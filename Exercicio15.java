import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================================");
        System.out.println("             CENTRAL DE VIAGENS");
        System.out.println("=======================================================");
        System.out.println("ATÈ 200KM PREÇO = R$0,50");
        System.out.println("MAIS DE 200KM PREÇO = R$0,45");
        System.out.println("QUAL A DISTANCIA EM KM DA SUA VIAGEM? ");
        int km = sc.nextInt();
        double preco;

        if (km <= 200 ) {
            preco = km * 0.50;
            
        }
        else {
            preco = km * 0.45;
            
        }

        System.out.printf("O VALOR DA SUA VIAGEM È DE: %.2f%n", preco);

        sc.close();
    }
}
