import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        int i = 1;

        System.out.println("Todos os números positivos divisíveis por 4 e menores que 200: ");
        while (4 * i <200){

            System.out.println(4*i);
            i++;
        }
    }
}