
import java.util.Scanner;

public class Exercicio3{
    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de " + 25 + " = " + C);

        A = Math.pow(x, y);
        B = Math.pow(5.0, 2.0);

        System.out.println("5 elevado a potencia de 2 é: " + B);
        System.out.println(x + " elevado a potencia de " + y + " é igual á: " + A );

        A = Math.abs(z);

        System.out.println("O valor absoluto de " + z + " é igual á: " + A);

        System.out.println("------------------------------------------");

        
        
        Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número inteiro: ");
            int n2 = sc.nextInt();
            scanner.nextLine();

            System.out.print("digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite um numero com ponto flutuante: ");
            double n3 = scanner.nextDouble();
            
            System.out.println("____________________________________________________");
            System.out.println("O número inteiro que você digitou foi: " + n2);
            System.out.println("O seu nome é: " + nome);
            System.out.println("O outro número é: " + n3);
            System.out.println("______________________________________________________");



        sc.close();

        
    }
}