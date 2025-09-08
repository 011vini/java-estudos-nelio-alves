import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
        int N = sc.nextInt();
        int soma = 0;
        for (int i=0; i <= N; i++){
            soma += i;
=======
        
        int N = sc.nextInt();
        int soma = 0;
        
        for(int i = 0;i < N; i++){
            int x = sc.nextInt();
            soma += x;
>>>>>>> b36945ceb0d739039272a440cd0b564346eb49c0
        }

        System.out.println(soma);
        sc.close();
        System.out.println(soma);
    }
}
