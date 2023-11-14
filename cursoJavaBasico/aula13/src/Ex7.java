import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Esse programa calcula a área de um quadrado e mostra o dobro desse valor");
        System.out.println("Digite o  tamanho de um dos lados do qudrado: ");
        double lado = scan.nextDouble();
        double area = Math.pow(lado,2);

        System.out.printf("O dobro da área desse quadrado é: " + "%.1f %n", area*2);
    }
}
