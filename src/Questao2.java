import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Quanto você ganha por hora? ");
        Double valor = scan.nextDouble();
        System.out.print("Quantas horas você trabalhou nesse mês? ");
        Double horas = scan.nextDouble();
        System.out.printf("Seu salário esse mês foi de R$ %.2f", valor*horas);
    }
}
