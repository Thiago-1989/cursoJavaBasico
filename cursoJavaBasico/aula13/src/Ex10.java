import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // (C * 9 / 5) + 32 = F
        System.out.println("Converta graus celsius em farenheit.");

        System.out.println("Digite a temperatura em ºC: ");
        double celsius = scan.nextDouble();

        double far = celsius * 9 / 5 + 32;
        System.out.printf(celsius + " graus celsius é igual a " + "%.1f ºF %n ", far);
       
    }
}
