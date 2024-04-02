public class Informatica extends Loja {
    private double seguroEletronicos;

    // Construtor da classe Informatica
    public Informatica(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int seguroEletronicos, int estoqueProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, estoqueProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    // Método de acesso para o seguro de eletrônicos
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    // Sobrescrever o método toString para incluir informações específicas da classe
    @Override
    public String toString() {
        return super.toString() +
               "\nSeguro de Eletrônicos (Mensal): R$" + seguroEletronicos;
    }
}