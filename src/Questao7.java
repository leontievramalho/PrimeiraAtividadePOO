import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("De qual números deseja ver a tabuada? ");
        int num = scan.nextInt();
        for(int i = 1; i<11; i++)
            System.out.println(num + " x " + i + " = " + num*i);
    }
}
