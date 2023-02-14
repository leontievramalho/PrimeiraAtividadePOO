import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        float n1 = scan.nextFloat();
        System.out.print("Segunda nota: ");
        float n2 = scan.nextFloat();
        float media = (n1+n2)/2;
        System.out.printf("Média: %.1f\n", media);
        if(media<7)
            System.out.println("Reprovado");
        else if(media<10)
            System.out.println("Aprovado");
        else
            System.out.println("Aprovado com Distinção");
    }
}
