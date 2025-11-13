import java.util.StringJoiner;

public class IkeaASTPrinter extends IkeaParserBaseListener {

    private final StringBuilder sb = new StringBuilder();
    private int indent = 0;

    private void println(String s) {
        for (int i = 0; i < indent; i++) {
            sb.append("  "); // dos espacios por nivel
        }
        sb.append(s).append('\n');
    }

    public String getResult() {
        return sb.toString();
    }

    //PROGRAMA

    @Override
    public void enterPrograma(IkeaParser.ProgramaContext ctx) {
        println("PROGRAMA");
        indent++;
    }

    @Override
    public void exitPrograma(IkeaParser.ProgramaContext ctx) {
        indent--;
    }

    //DECLARACIÓN INICIO / FIN

    @Override
    public void enterDeclaracion_inicio(IkeaParser.Declaracion_inicioContext ctx) {
        StringBuilder line = new StringBuilder("INICIO_MONTAJE ");

        if (ctx.MAYUS_NOMBRE() != null) {
            line.append(ctx.MAYUS_NOMBRE().getText()).append(" ");
        }
        line.append(ctx.NUMERO().getText());

        if (ctx.mueble_referencia() != null) {
            line.append(" COMO EXTENSION_DE ");
            line.append(muebleToString(ctx.mueble_referencia()));
        }

        println(line.toString());
    }

    @Override
    public void enterDeclaracion_fin(IkeaParser.Declaracion_finContext ctx) {
        println("FIN");
    }

    // PASOS

    @Override
    public void enterPaso(IkeaParser.PasoContext ctx) {
        String numPaso = ctx.NUMERO().getText();
        println("PASO " + numPaso);
        indent++;
    }

    @Override
    public void exitPaso(IkeaParser.PasoContext ctx) {
        indent--;
    }

    //ACCIONES

    @Override
    public void enterAccion(IkeaParser.AccionContext ctx) {
        String s = renderAccion(ctx);
        println(s);
    }

    private String renderAccion(IkeaParser.AccionContext ctx) {

        // INSERTAR herraje_lista EN pieza
        if (ctx.INSERTAR() != null) {
            return "INSERTAR " + herrajeListaToString(ctx.herraje_lista())
                    + " EN " + piezaToString(ctx.pieza(0));
        }

        // UNIR pieza (Y pieza)+
        if (ctx.UNIR() != null) {
            StringJoiner j = new StringJoiner(" Y ");
            for (IkeaParser.PiezaContext pctx : ctx.pieza()) {
                j.add(piezaToString(pctx));
            }
            return "UNIR " + j;
        }

        // FIJAR herraje_lista CON herramienta
        if (ctx.FIJAR() != null) {
            return "FIJAR " + herrajeListaToString(ctx.herraje_lista())
                    + " CON " + herramientaToString(ctx.herramienta());
        }

        // MARTILLAR herraje_lista SOBRE pieza
        if (ctx.MARTILLAR() != null) {
            return "MARTILLAR " + herrajeListaToString(ctx.herraje_lista())
                    + " SOBRE " + piezaToString(ctx.pieza(0));
        }

        // COLOCAR NUMERO? pieza (mod_espacio)? (EN posicion)?
        if (ctx.COLOCAR() != null) {
            StringBuilder b = new StringBuilder("COLOCAR ");
            if (ctx.NUMERO() != null) {
                b.append(ctx.NUMERO().getText()).append(" ");
            }
            b.append(piezaToString(ctx.pieza(0)));

            if (ctx.mod_espacio() != null) {
                b.append(" ").append(modEspacioToString(ctx.mod_espacio()));
            }
            if (ctx.posicion() != null) {
                b.append(" EN ").append(posicionToString(ctx.posicion()));
            }
            return b.toString();
        }

        // GIRAR ORIENTACION
        if (ctx.GIRAR() != null) {
            return "GIRAR " + ctx.ORIENTACION().getText();
        }

        // CONECTAR ESTE_MODULO A mueble_referencia CON herraje_lista
        if (ctx.CONECTAR() != null) {
            return "CONECTAR ESTE_MODULO A " + muebleToString(ctx.mueble_referencia())
                    + " CON " + herrajeListaToString(ctx.herraje_lista());
        }

        // MARCAR_PARED CON pieza (CON herramienta)?
        if (ctx.MARCAR_PARED() != null) {
            StringBuilder b = new StringBuilder("MARCAR_PARED CON ");
            b.append(piezaToString(ctx.pieza(0)));
            if (ctx.herramienta() != null) {
                b.append(" CON ").append(herramientaToString(ctx.herramienta()));
            }
            return b.toString();
        }

        // NIVELAR (pieza | MUEBLE)
        if (ctx.NIVELAR() != null) {
            if (!ctx.pieza().isEmpty()) {
                return "NIVELAR " + piezaToString(ctx.pieza(0));
            } else {
                return "NIVELAR MUEBLE";
            }
        }

        // FIJAR_PARED (PAREN_ABRE OPCIONAL PAREN_CIERRA)? CON herraje_lista
        if (ctx.FIJAR_PARED() != null) {
            StringBuilder b = new StringBuilder("FIJAR_PARED");
            if (ctx.OPCIONAL() != null) {
                b.append(" (OPCIONAL)");
            }
            b.append(" CON ").append(herrajeListaToString(ctx.herraje_lista()));
            return b.toString();
        }

        // Fallback
        return ctx.getText();
    }

    // Helpers

    private String piezaToString(IkeaParser.PiezaContext ctx) {
        String tipo = ctx.TIPO_PIEZA().getText(); // PIEZA, PANEL, BALDA, ESTANTE

        if (ctx.NUMERO() != null) {
            return tipo + "(" + ctx.NUMERO().getText() + ")";
        } else if (ctx.NOMBRE() != null) {
            return tipo + "(" + ctx.NOMBRE().getText() + ")";
        } else {
            return tipo;
        }
    }

    private String muebleToString(IkeaParser.Mueble_referenciaContext ctx) {
        // mueble_referencia: MUEBLE id ;
        // id: MAYUS_NOMBRE? PAREN_ABRE NUMERO PAREN_CIERRA ;
        StringBuilder b = new StringBuilder("MUEBLE");
        IkeaParser.IdContext idCtx = ctx.id();
        b.append("(");
        if (idCtx.MAYUS_NOMBRE() != null) {
            b.append(idCtx.MAYUS_NOMBRE().getText()).append("_");
        }
        b.append(idCtx.NUMERO().getText());
        b.append(")");
        return b.toString();
    }

    private String herramientaToString(IkeaParser.HerramientaContext ctx) {
        String base = ctx.HERRAMIENTA().getText();
        if (ctx.NUMERO() != null) {
            return base + "(" + ctx.NUMERO().getText() + ")";
        }
        return base;
    }

    private String herrajeListaToString(IkeaParser.Herraje_listaContext ctx) {
        // herraje_lista: NUMERO id_herraje (Y NUMERO id_herraje)*
        StringJoiner j = new StringJoiner(" Y ");
        int n = ctx.id_herraje().size();
        for (int i = 0; i < n; i++) {
            String cantidad = ctx.NUMERO(i).getText();
            String id = ctx.id_herraje(i).getText(); // NUMERO o HERRAJE
            j.add(cantidad + "x" + id);
        }
        return j.toString();
    }

    private String modEspacioToString(IkeaParser.Mod_espacioContext ctx) {
        return "DEJAR_ESPACIO " + ctx.NUMERO().getText()
                + " " + ctx.UD_MEDIDA().getText();
    }

    private String posicionToString(IkeaParser.PosicionContext ctx) {
        return ctx.getText();
    }
}
