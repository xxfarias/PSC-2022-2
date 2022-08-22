import javax.swing.JOptionPane;
public class Exercicio2_SomaQuadrado {
    public static void main(String[] args){
    //Declaração de variaveis
        double quadrado1;
        double quadrado2;
        double quadrado3;
        double quadrado4;
        double resultado;

    //Entrada de dados
        quadrado1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeniro numero: "));
        quadrado2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        quadrado3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor:"));
        quadrado4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto valor: "));


    // Processamento de dados

    resultado = ((quadrado1*quadrado1) +(quadrado2*quadrado2)+(quadrado3*quadrado3)+(quadrado4*quadrado4));


    // Saída de dados

        JOptionPane.showMessageDialog(null, "A soma dos quatro quadarados é: "+resultado);
    }
    
}
