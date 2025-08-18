import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int tabuada;
        
        System.out.println("================================================");
        System.out.println("               TABUADA");
        System.out.println("================================================");

        for(int i = 1;i <= 10; i++) {
            tabuada = N * i;
            System.out.println(i + " x " + N + " = " + tabuada);
        }

        System.out.println("================================================");

        sc.close();
    }
}
