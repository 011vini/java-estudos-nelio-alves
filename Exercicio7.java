import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Digite a quantidade de Segundos para ser convertido em horas");
        int N = sc.nextInt();
        System.out.println("---------------------------------------------------------------------");
        int resto, horas, minutos, segundos;
        horas = N / 3600;
        resto = N % 3600;
        minutos = resto / 60;
        segundos = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();

    }
}
