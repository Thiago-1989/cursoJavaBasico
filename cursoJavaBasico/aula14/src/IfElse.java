import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salário bruto por hora: ");
        double salarioHora = scan.nextDouble();
        System.out.println("Digite o número de horas trabalhadas no mês: ");
        double horasTrab = scan.nextDouble();

        double salarioBruto = salarioHora * horasTrab;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double descontos = inss + sindicato;
        double salarioLiq = salarioBruto - descontos;

        if (salarioBruto > 2640.00){
            double iR = salarioBruto * 0.11;
            descontos = iR + inss + sindicato;
            salarioLiq = salarioBruto - descontos;

            System.out.printf("%nSalário bruto: R$" + "%.2f %n", salarioBruto);
            System.out.println("Descontos: %n");
            System.out.printf("INSS: R$" + "%.2f %n", inss);
            System.out.printf("Sindicato: R$" + "%.2f %n", sindicato);
            System.out.printf("Imposto de renda: R$" + "%.2f %n", iR);
            System.out.printf("Salario líquido: R$" + "%.2f %n", salarioLiq);
        }else {

            System.out.printf("%nSalário bruto: R$" + "%.2f %n", salarioBruto);
            System.out.println("Descontos: \n");
            System.out.printf("INSS: R$" + "%.2f %n", inss);
            System.out.printf("Sindicato: R$" + "%.2f %n", sindicato);
            System.out.printf("\nSalario líquido: R$" + "%.2f %n", salarioLiq);
        }

    }}