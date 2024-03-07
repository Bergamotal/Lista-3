import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int max, min, n;

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        for (int i=1; i<=5;i++) {
            System.out.println("Digite o " + i  + "º número inteiro: ");
            n = in.nextInt();

            if(n > max){
                max = n;
            }
            if(n < min){
                min = n;
            }
        }
        System.out.println("O maior número é: "+ max);
        System.out.println("O menor número é: "+ min);
    }
}