import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("          Calculadora de Preços de Terrenos");
        System.out.println("----------------------------------------------------");
        System.out.print("Qual a largura do seu terreno?  ");
        double largura = sc.nextDouble();
        System.out.print("Qual o comprimento desse terreno?  ");
        double comprimento = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * 300.00;

        System.out.printf("Á area do seu terreno é de %.2f%n" , area );
        System.out.printf("Preço total: R$ %.2f%n" , preco );




        System.out.println("----------------------------------------------------");




        sc.close();

    }
}
