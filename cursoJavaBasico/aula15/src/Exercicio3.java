import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu gênero ('M' = Masculino e 'F' = Feminino): ");
        String genero = scan.next();

        if (genero.equalsIgnoreCase("M")) {
            System.out.println("Sexo masculino.");
        } else if (genero.equalsIgnoreCase("F")) {
            System.out.println("Sexo feminino.");
        } else {
            System.out.println("Gênero inválido");
        }

    }
}
