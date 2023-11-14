import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Converta metros em centímetros.");

        System.out.println("Metros: ");
        double metros = scan.nextDouble();
        int centimetros = (int) (metros * 100);
        System.out.println(metros + " metros é igual a " + centimetros + " centímetros.");

    }

}
