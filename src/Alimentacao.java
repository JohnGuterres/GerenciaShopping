public class Alimentacao extends Loja {
    private Data dataAlvara;

    // Construtor da classe Alimentacao
    public Alimentacao(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int tamanhoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.dataAlvara = dataAlvara;
    }
    
    // M�todo de acesso para a data do alvar�
    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    // Sobrescrever o m�todo toString para incluir informa��es espec�ficas da classe
    @Override
    public String toString() {
        return super.toString() +
               "\nData do Alvar� de Funcionamento: " + dataAlvara;
    }
}