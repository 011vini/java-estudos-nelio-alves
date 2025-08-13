import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero >= 1) {
            System.out.println("POSITIVO!");
        }
        else if (numero <= -1 ) {
            System.out.println("NEGATIVO!");
        }
        else {
            System.out.println("ZERO");
        }
        




        sc.close();
    }
}
