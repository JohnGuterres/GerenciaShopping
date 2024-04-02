public class Bijuteria extends Loja {
    private double metaVendas;

    // Construtor da classe Bijuteria
    public Bijuteria(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int tamanhoEstoque, double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.metaVendas = metaVendas;
    }

    // Método de acesso para a meta de vendas
    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    // Sobrescrever o método toString para incluir informações específicas da classe
    @Override
    public String toString() {
        return super.toString() +
               "\nMeta de Vendas Mensais: R$" + metaVendas;
    }
}