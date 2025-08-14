import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================================================");
        System.out.println("        CALCULADOR DE MEDIA ENTRE IDADES!!!");
        System.out.println("=============================================================");
        int soma = 0;
        int cont = 0;
        double media;
        String opn = "Sim";
        while (opn.equalsIgnoreCase("Sim")) {
            System.out.print("Digite a idade  :  ");
            int idade = sc.nextInt();
            soma = soma + idade;
            cont = cont + 1;   
        
            System.out.println("Deseja continuar?(Sim/Nao)");
            opn = sc.next();
        
        }
        if (cont > 0) {
            media = (double) soma / cont;
            System.out.printf("A média dessas idades é: %.2f%n", media);
        }
        else {
            System.out.println("IMPOSSÍVEL CALCULAR!!");
        }
        System.out.println("=============================================================");
        sc.close();

    }
}