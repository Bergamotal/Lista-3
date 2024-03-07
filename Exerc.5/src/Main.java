import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        int n, factorial;

        System.out.println("Digite um número para calcular seu fatorial: ");
        n = in.nextInt();
        factorial = 1;

        for(int i = 1; i <= n; i++){
            factorial *= i;
        }

        System.out.println("O resultado é: "+ factorial);
    }
}