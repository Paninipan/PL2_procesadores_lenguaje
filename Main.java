import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase principal para leer archivos CSV
 * Práctica de laboratorio 2 - Procesadores del Lenguaje
 */
public class Main {
    
    public static void main(String[] args) {
        String csvFile = "archivo_csv.csv";
        String line;
        String csvSeparator = ",";
        
        System.out.println("Leyendo archivo CSV: " + csvFile);
        System.out.println("=====================================");
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Leer la primera línea (encabezados)
            String headerLine = br.readLine();
            if (headerLine != null) {
                String[] headers = headerLine.split(csvSeparator);
                System.out.println("Columnas: " + String.join(" | ", headers));
                System.out.println("=====================================");
            }
            
            // Leer las líneas de datos
            int contador = 1;
            while ((line = br.readLine()) != null) {
                // Saltar líneas vacías
                if (line.trim().isEmpty()) {
                    continue;
                }
                
                String[] datos = line.split(csvSeparator);
                
                System.out.println("Registro " + contador + ":");
                for (int i = 0; i < datos.length; i++) {
                    System.out.println("  " + datos[i]);
                }
                System.out.println("-------------------------------------");
                contador++;
            }
            
            System.out.println("Total de registros leídos: " + (contador - 1));
            
        } catch (IOException e) {
            System.err.println("Error al leer el archivo CSV: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
