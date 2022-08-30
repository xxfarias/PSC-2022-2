import javax.swing.JOptionPane;
public class Exercicio_MaiorDeIdade {
    public static  void main(String[] args){
        double idade;

        idade = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos anos você tem: "));


        if (idade > 18){
            JOptionPane.showMessageDialog(null, "Você é maior de idade!");
        }
            else {
                JOptionPane.showMessageDialog(null, "Você é menor de idade");
            }

        }

    }
   




