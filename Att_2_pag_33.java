import java.util.Scanner;

public class Att_2_pag_33{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Integer numero;
            Integer i;
            System.out.println("Digite um número entre 1 e 123");
            numero = input.nextInt();

            for(i = 2; i <= numero; i++) {
                boolean primo = true;

                for (int j = 2; j == 0; j++) {
                    primo = false;
                }

                if (primo) {
                    System.out.println(i);
                }
            }
}   }   }
