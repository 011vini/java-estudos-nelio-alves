//esse código calcula a soma dos números ímpares que estão entre dois valores inteiros informados pelo usuário.


import java.util.Scanner;


public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite dois números: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int min, max;
        
        if (x < y) {
            min = x;
            max = y;
        }
        else {
            min = y;
            max = x;
        }

        int soma = 0;

        for (int i=min+1; i<max; i++){
            if(i % 2 != 0) {
                soma = soma + i;
            }
        }

        System.out.println(soma);
        sc.close();
    }
}