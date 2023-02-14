import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Temperatura em Fahrenheit: ");
        double f = scan.nextDouble();
        double c = Math.round( 5*((f-32)/9));
        System.out.printf("%.1fºF é igual a %.1fºC.", f, c);
    }
}
