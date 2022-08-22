import javax.swing.JOptionPane;
public class Exercicio3_Comissao{

    public static  void main(String[] args){
    //Declaração de variaveis
        double precoUnitario;
        double quantidadeVendida;
        double totalVendas;
        double comissao;

    //Entrada de dados
        precoUnitario = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço unitário por peça: "));
        quantidadeVendida = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de peças vendida: "));

    // Processamento
    totalVendas = ((precoUnitario*quantidadeVendida));
    comissao = ((totalVendas * 0.05));

    // Saida de dados
    JOptionPane.showMessageDialog(null, "Você vendeu um total de: R$"+totalVendas+" A sua comissão será de: R$"+comissao);

    }
}