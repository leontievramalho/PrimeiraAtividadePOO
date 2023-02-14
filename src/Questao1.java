import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("=-Digite as 4 notas-=");
        System.out.print("Nota 1: ");
        double n1 = scan.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = scan.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = scan.nextDouble();
        System.out.print("Nota 4: ");
        double n4 = scan.nextDouble();
        double media = (n1 + n2 + n3 + n4)/4;
        System.out.printf("A média das 4 notas é %.1f", media);
    }
}
