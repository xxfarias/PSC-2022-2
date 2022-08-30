import javax.swing.JOptionPane;
public class Exercicio_MaiorDeIdade2 {
    public static  void main(String[] args){
        double idade;

        idade = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos anos você tem: "));


       JOptionPane.showMessageDialog(null,((idade>=18) ? "Maior de idade!" : "Menor de idade!"));

    }
}
