import java.util.Scanner;

public class Exercicio1 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um  número: ");
        int num1 = scan.nextInt();
        System.out.println("Digite outro  número: ");
        int num2 = scan.nextInt();

        int maiorNum;

        if (num1 > num2) {
            maiorNum = num1;
        } else {
            maiorNum = num2;
        }

        System.out.println("O maior número digitado foi: " + maiorNum);

    }
}
