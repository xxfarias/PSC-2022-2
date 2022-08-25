import javax.swing.JOptionPane;
public class Exercicio6_IdadeEmDias{

    public static  void main(String[] args){
    //Declaração de variaveis
        double anos;
        double dias;

    //Entrada de dados
        anos = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos anos você tem: "));

    // Processamento
        dias = (anos * 365);

    // Saida de dados
        JOptionPane.showMessageDialog(null, "Você tem "+dias+" dias de vida");

    }
}
