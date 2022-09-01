import javax.swing.JOptionPane;
public class Exercicio7_IdadeEmDias{

    // Enunciado:
    //Ler a idade de uma pessoa expressa em anos, meses e dias e exibir a idade dessa
    //pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
    public static  void main(String[] args){
    //Declaração de variaveis
        double anos;
        double meses;
        double dias;
        double resultado;

    //Entrada de dados
        anos = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos anos você tem: "));
        meses = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos meses você já viveu esse ano: "));
        dias = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos dias você já viveu nesse mês: "));

    // Processamento
        resultado = ((anos * 365)+(meses*30)+dias);

    // Saida de dados
        JOptionPane.showMessageDialog(null, "Você tem "+resultado+" dias de vida vividos até hoje");

    }
}
