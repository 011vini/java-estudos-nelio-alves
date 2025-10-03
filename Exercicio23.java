
import java.util.Locale;
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int N = sc.nextInt();
        double soma = 0.0;
        double media;
        double[] vet = new double[N];

        for (int i =0; i<N; i++) {
            vet[i] = sc.nextDouble();
        }

        for (int i = 0; i<N; i++) {
            soma = soma + vet[i];   
        } 
        media = soma / N;
        System.out.println(soma);
        System.out.println(media);

        sc.close();
    }
}
