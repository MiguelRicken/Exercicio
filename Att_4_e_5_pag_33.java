import java.util.Scanner;

import javax.swing.JOptionPane;

//Essa atividade tem a 4 e a 5 da pág. 33

public class Att_4_e_5_pag_33 {
    public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        float valor = (float) 10.25; 
        float salario;
        int horas;
        System.out.println("Quantas horas trabalhadas: ");
        horas = input.nextInt();
        salario = horas * valor;
        System.out.println("Seu salário é: R$ " + salario);

        if (salario < 50) {
            JOptionPane.showMessageDialog(null, "Atenção, dirija-se à direção do Hotel!");
        }

    }

    }
}
