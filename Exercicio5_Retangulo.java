import javax.swing.JOptionPane;
public class Exercicio5_Retangulo{

    public static  void main(String[] args){
    //Declaração de variaveis
        double base;
        double altura;
        double area;

    //Entrada de dados
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do Retângulo em cm: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do Retãngulo em cm: "));


    // Processamento
        area = ((base * altura) / 2);

    // Saida de dados
        JOptionPane.showMessageDialog(null, "A area do retángulo é: "+area+"cm");

    }
}
