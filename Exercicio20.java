
import java.util.Locale;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double soma = 0;
        for (int i=1; i <= 5; i++){
            System.out.println("Digite a nota " + i + ": ");
            double nota = sc.nextDouble();
            soma = soma + nota;

        }

        soma = soma / 5;

        System.out.printf("Média final = %.2f%n", soma);


        sc.close();
    }
}
