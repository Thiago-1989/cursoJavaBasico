// Calcule o seu peso ideal

import java.util.Scanner;

public class Ex12 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Para saber o seu peso ideal digite sua altura: ");
        double altura  = scan.nextDouble();
        double pesoIdeal = (72.7*altura) - 58;
        System.out.printf("Seu peso ideal é: " + "%.3f %n" , pesoIdeal);

    }
}
