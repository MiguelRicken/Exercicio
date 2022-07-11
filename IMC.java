import javax.swing.JOptionPane;
public class IMC {
    public static void main(String[] args) {
        String aux = "";
        float peso = 0, altura = 0, imc = 0;
        try {
            aux = JOptionPane.showInputDialog(null, "Digite seu peso:");
            peso = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog(null, "Digite sua altura:");
            altura = Float.parseFloat(aux);

           imc = peso / ( altura * altura);

            if (imc < 18.3){ 
                JOptionPane.showMessageDialog(null, "Seu IMC é: " + Math.round (imc) + "|Sua categoria é 'A' = abaixo do peso");  
            } else if (imc >= 18.4 && imc <= 24.4) {
                JOptionPane.showMessageDialog(null, "Seu IMC é: " + Math.round (imc) + "| Sua categoria é 'B' = peso ideal");
            } else if (imc >= 24.5 && imc <= 29.9) {
                JOptionPane.showMessageDialog(null, "Seu IMC é: " + Math.round (imc) + "|Sua categoria é 'C' = pré obesidade");
            } else if (imc >= 30 && imc <= 34.9) {
                JOptionPane.showMessageDialog(null, "Seu IMC é: " + Math.round (imc) + "|Sua categoria é 'D' = obesidade classe I");
            } else if (imc >= 35 && imc <= 39.9) {
                JOptionPane.showMessageDialog(null, "Seu IMC é: " + Math.round (imc) + "|Sua categoria é 'E' = obesidade severa");
            } else if (imc > 39.9) {
                JOptionPane.showMessageDialog(null, "Seu IMC é: " + Math.round (imc) + "|Sua categoria é 'F' = acima do peso");
            }
        }
        catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Houve um erro!" + erro.toString());
        }
    }
    
}
