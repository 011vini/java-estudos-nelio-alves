import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero >= 0 && numero <= 100) {
            System.out.println("Seu numero " + numero + " está dentro do intervalo entre 0 e 100.");
        }
        else {
            System.out.println("O número está fora do intervalo.");
        }

        sc.close();
    }
}
