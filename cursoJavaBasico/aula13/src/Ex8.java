import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Calcule o salário relativo ao mês. ");

        System.out.println("Digite valor a receber por hora trabalhada: ");
        double valor = scan.nextDouble();
        System.out.println("Digite o número de horas trabalhadas no mês: ");
        double horas = scan.nextDouble();

        double salario = valor * horas;

        System.out.printf("O valor a receber é: R$" + "%.2f %n", salario);
    }
}
