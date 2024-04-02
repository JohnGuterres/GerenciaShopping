
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
    
    // Método para verificar se o produto está vencido em relação a uma data específica
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
        return false; // Se as datas não estiverem definidas ou o produto não está vencido
    }


 // Método toString para retornar informações formatadas do produto
    @Override
    public String toString() {
    	return "Nome do Produto: " + nome +
                "\nPreço: " + preco +
                "\nData de Validade: " + dataValidade;
    }
    // Métodos de acesso (getters e setters)
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
