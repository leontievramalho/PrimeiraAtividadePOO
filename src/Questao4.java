import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Quanto você ganhar por hora? ");
        double valor = scan.nextDouble();
        System.out.print("Quantas horas você trabalhou esse mês? ");
        double horas = scan.nextDouble();
        double salarioBruto = valor*horas;
        double impostoRenda = 0.11*salarioBruto;
        double inss = 0.08*salarioBruto;
        double sindicato = 0.05*salarioBruto;
        double salarioLiquido = salarioBruto - impostoRenda - inss - sindicato;
        System.out.printf("""
                        + Salário Bruto: R$ %.2f
                        - IR: R$ %.2f
                        - INSS: R$ %.2f
                        - Sindicato: R$ %.2f
                        = Salário Líquido: R$ %.2f""", salarioBruto, impostoRenda,
                inss, sindicato, salarioLiquido);
    }
}
