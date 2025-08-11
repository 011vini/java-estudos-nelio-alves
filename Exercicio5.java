import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        double altura = sc.nextDouble();

        double area = base * altura;
        double perimetro = 2.0* (base + altura);
        double diagonal = Math.sqrt((base * base) + (altura * altura));
        
        System.out.printf("Area = %.4f%n", area);
        System.out.printf("Perimetro = %.4f%n", perimetro);
        System.out.printf("diagonal = %.4f%n", diagonal);


        sc.close();

    }
}