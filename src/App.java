import java.util.Locale;
import java.util.Scanner;

/*Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule 
seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58 */

public class App {
    public static void main(String[] args) throws Exception {

        double altura;
        double ideal;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Informe a altura para o cauculo do peso ideal");

        altura = scanner.nextDouble();

        ideal = (72.7 * altura) - 58;
        System.out.print(" o peso ideal desta pessoa é " + ideal);

    }
}
