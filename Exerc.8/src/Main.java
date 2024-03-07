import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        int n, option;
        boolean prime;

        do {
            System.out.println("Digite um número: ");
            n = in.nextInt();
            prime = true;

            if (n < 1) {
                prime = false;
            }
            else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        prime = false;
                    }
                }
            }
            if (prime == true) {
                System.out.println(n + " é um número primo");
            }
            else {
                System.out.println(n + " não é um número primo");
            }

            System.out.println("Inserir outro número?\n1. Sim\n2. Não");
            option = in.nextInt();
        } while (option != 2);

    }
}