import javax.swing.JOptionPane;
public class Exercicio_Salario {
    public static  void main(String[] args){
        double salario;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário em reais: "));


        if (salario > 1212){
            JOptionPane.showMessageDialog(null, "Seu salário é maior que um salário minimo!");
        }
            else if(salario == 1212) {
                JOptionPane.showMessageDialog(null, "Seu salário é um salário minimo!");
            }
            else {
                JOptionPane.showMessageDialog(null, "Seu salário é menor que um salário minimo!");
            }

        }

    }
   




