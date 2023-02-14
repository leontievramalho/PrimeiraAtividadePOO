import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double n1 = scan.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = scan.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double n3 = scan.nextDouble();

        if(n1>=n2 && n2>=n3){
            System.out.printf("""
                    Maior: %.2f
                    Menor: %.2f
                    """, n1, n3);
        } else if(n1>=n3 && n3>=n2){
            System.out.printf("""
                        Maior: %.2f
                        Menor: %.2f
                        """, n1, n2);
        } else if(n2>=n1 && n1>=n3){
            System.out.printf("""
                        Maior: %.2f
                        Menor: %.2f
                        """, n2, n3);
        } else if(n2>=n3){
            System.out.printf("""
                        Maior: %.2f
                        Menor: %.2f
                        """, n2, n1);
        } else if(n2>=n1){
            System.out.printf("""
                        Maior: %.2f
                        Menor: %.2f
                        """, n3, n1);
        } else
            System.out.printf("""
                        Maior: %.2f
                        Menor: %.2f
                        """, n3, n2);
    }
}
