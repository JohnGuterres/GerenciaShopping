public class Bijuteria extends Loja {
    private double metaVendas;

    // Construtor da classe Bijuteria
    public Bijuteria(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int tamanhoEstoque, double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.metaVendas = metaVendas;
    }

    // M�todo de acesso para a meta de vendas
    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    // Sobrescrever o m�todo toString para incluir informa��es espec�ficas da classe
    @Override
    public String toString() {
        return super.toString() +
               "\nMeta de Vendas Mensais: R$" + metaVendas;
    }
}