import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        CalculatorADT calculator = new CalculatorADT();
        String fileName = "datos.txt"; 
        //Read the file and divide it into lines to complete the expression
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim(); //Deletes unnecessary space in the beginning and end of the line
                if (!line.isEmpty()) {
                    try {
                        
                        int result = calculator.evaluatePostfix(line);
                        System.out.println("Expresión: " + line + " = " + result);
                    } catch (Exception e) {
                        System.err.println("Error al evaluar la expresión '" + line + "': " + e.getMessage());
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}