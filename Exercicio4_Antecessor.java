import javax.swing.JOptionPane;
public class Exercicio4_Antecessor{

    public static  void main(String[] args){
    //Declaração de variaveis
        int numero1;
        int antecessor;

    //Entrada de dados
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

    // Processamento
        antecessor = (numero1 - 1);

    // Saida de dados
        JOptionPane.showMessageDialog(null, "O antecessor do número digitado é: "+antecessor);

    }
}