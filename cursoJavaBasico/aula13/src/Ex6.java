import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Calcule a área de um triângulo.");
        System.out.println("Digite o raio do triângulo a calcular: ");
        double raio = scan.nextDouble();
        double area = Math.PI * raio;

        System.out.println("A área desse triângulo é: " + area);

    }
}
