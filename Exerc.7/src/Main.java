import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int Maxnumber = 10;

        for (int i = 1; i <= Maxnumber; i++) {
            System.out.println("Tabuada do " + i + ": ");

            for (int j = 0; j <= 10; j++) {
                System.out.println(i * j);
            }
        }
    }
}