import java.util.Scanner;

import javax.swing.*;

public class Emanuel {
    
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            int idade;
            System.out.println("Digite a sua idade: ");
            idade = input.nextInt();          

            if (idade <= 2)
             {
                JOptionPane.showMessageDialog(null,  "Bebê");
            } else if (idade > 2 && idade <= 11){
                JOptionPane.showMessageDialog(null,  "Criança");
            } else if (idade > 11 && idade <= 19){
                JOptionPane.showMessageDialog(null,  "Adolescente");
            } else if (idade >19 && idade <= 30) {
                JOptionPane.showMessageDialog(null,  "Jovem");
            } else if (idade > 30 && idade <= 60){
                JOptionPane.showMessageDialog(null,  "Adulto");
            } else if (idade > 61){
                JOptionPane.showMessageDialog(null,  "Idoso");
            }

          
        }
        
        
    }   
    
}