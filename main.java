import java.util.Scanner;

public class main {
    public static void main(String[] args) {
<<<<<<< Updated upstream
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
=======

>>>>>>> Stashed changes
        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Digite as horas:");
        hora = sc.nextInt();

        if (hora < 12 && hora > 6) {

            System.out.println("Bom dia, tenha um bom dia");
        }

        else {
            if (hora >= 12 && hora < 19) {
                System.out.println("Boa tarde");
            }
            else {
                System.out.println("Boa noite");
            }
        }

        sc.close();
    }
<<<<<<< Updated upstream
<<<<<<< Updated upstream
}
=======
}
>>>>>>>
>>>>>>> Stashed changes
=======
}
>>>>>>>
>>>>>>> Stashed changes
