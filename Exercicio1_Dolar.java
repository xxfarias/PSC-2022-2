import javax.swing.JOptionPane;
public class Exercicio1_Dolar {
    public static void main(String[] args) {
        double notasEmReal;
        double valorDolar;
        double resultado;
    notasEmReal = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos reais você tem: "));
    valorDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do dolar hoje:"));

    resultado = (notasEmReal * valorDolar);
        JOptionPane.showMessageDialog(null, "Você tem: $"+resultado +" Dólares");
    }
}