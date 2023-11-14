import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota do 1º bi: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a nota do 2º bi: ");
        double nota2 = scan.nextDouble();
        System.out.println("Digite a nota do 3º bi: ");
        double nota3 = scan.nextDouble();
        System.out.println("Digite a nota do 4º bi: ");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("A média do aluno é: " + "%.1f %n", media);
    }
}
