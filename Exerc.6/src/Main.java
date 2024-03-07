import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        int n1, n2, inter;

        System.out.println("Digite dois números inteiros: ");
        n1 = in.nextInt();
        n2 = in.nextInt();
        inter = n1 - n2;

        if(n1 > n2){
            int trade = n1;
            n1 = n2;
            n2 = trade;
        }


        System.out.println("Números entre " + n1 + " e " + n2 + ":");
        for (int i = n1 + 1; i < n2; i++) {
            System.out.print(i + " ");
        }
    }

}