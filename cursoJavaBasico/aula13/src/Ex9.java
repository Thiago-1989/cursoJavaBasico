import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
// C = 5*(F-32) /9
        Scanner scan = new Scanner(System.in);

        System.out.println("Converta graus farenheit em celsius.");

        System.out.println("Digite a temperatura em ºF: ");
        double far = scan.nextDouble();

        double celsius = 5 * (far - 32) / 9;
        System.out.printf(far + " graus farenheit é igual a " + "%.2f " , celsius);
        System.out.print("graus celsius");
    }
}
