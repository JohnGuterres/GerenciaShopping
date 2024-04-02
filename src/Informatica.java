public class Informatica extends Loja {
    private double seguroEletronicos;

    // Construtor da classe Informatica
    public Informatica(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int seguroEletronicos, int estoqueProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, estoqueProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    // M�todo de acesso para o seguro de eletr�nicos
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    // Sobrescrever o m�todo toString para incluir informa��es espec�ficas da classe
    @Override
    public String toString() {
        return super.toString() +
               "\nSeguro de Eletr�nicos (Mensal): R$" + seguroEletronicos;
    }
}