
public class Produto {
	private String nome;
	private double preco;
    private Data dataValidade;

	
	// Construtor da classe Produto
    public Produto(String nome, double precoProduto, Data dataValidade) {
        this.nome = nome;
        this.preco = precoProduto;
        this.dataValidade = dataValidade;
    }
    
    // M�todo para verificar se o produto est� vencido em rela��o a uma data espec�fica
    public boolean estaVencido(Data dataReferencia) {
        if (dataValidade != null && dataReferencia != null) {
            if (dataValidade.getAno() < dataReferencia.getAno()) {
                return true;
            } else if (dataValidade.getAno() == dataReferencia.getAno() && dataValidade.getMes() < dataReferencia.getMes()) {
                return true;
            } else if (dataValidade.getAno() == dataReferencia.getAno() && dataValidade.getMes() == dataReferencia.getMes() && dataValidade.getDia() < dataReferencia.getDia()) {
                return true;
            }
        }
        return false; // Se as datas n�o estiverem definidas ou o produto n�o est� vencido
    }


 // M�todo toString para retornar informa��es formatadas do produto
    @Override
    public String toString() {
    	return "Nome do Produto: " + nome +
                "\nPre�o: " + preco +
                "\nData de Validade: " + dataValidade;
    }
    // M�todos de acesso (getters e setters)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Data getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Data dataValidade) {
		this.dataValidade = dataValidade;
	}
	

}
