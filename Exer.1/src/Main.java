import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        int n;
        int i = 0;

        System.out.println("Digite um número: ");
        n = in.nextInt();
        System.out.println("A tabuada é: ");

        while(i<=10){
            System.out.println(n * i);
            i++;
        }
    }
}