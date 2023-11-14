import java.util.Scanner;

public class Exercicio4 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letter = scan.next();

        if (letter.length() == 1 && "AEIOUaeiou".contains(letter)) {
            System.out.println("É vogal");
        } else if (letter.length() == 1 && "bcçdfghjklmnpqrstywxz".contains(letter)) {
            
        } else {
            System.out.println("É consoante");
        }

    }
}
