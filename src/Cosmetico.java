
public class Cosmetico extends Loja {
    private double taxaComercializacao;

    // Construtor da classe Cosmetico
    public Cosmetico(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int tamanhoEstoque,  int taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.taxaComercializacao = taxaComercializacao;
    }

    // M�todo de acesso para a taxa de comercializa��o
    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    // Sobrescrever o m�todo toString para incluir informa��es espec�ficas da classe
    @Override
    public String toString() {
        return super.toString() +
               "\nTaxa de Comercializa��o: " + taxaComercializacao;
    }
}
