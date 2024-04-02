public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private int salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;
    private int tamanhoEstoque;

    // Construtor que inicializa todos os atributos, incluindo o estoque de produtos
    public Loja(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int tamanhoEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[tamanhoEstoque];
    }

    // Construtor que inicializa o nome e a quantidade de funcionários, com salário base -1 e estoque vazio
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int tamanhoEstoque) {
        this(nome, quantidadeFuncionarios, -1, endereco, dataFundacao, tamanhoEstoque);
    }
    
    // Método toString para retornar informações formatadas da loja
    @Override
    public String toString() {
        String result = "Nome da Loja: " + nome +
                "\nQuantidade de Funcionários: " + quantidadeFuncionarios +
                "\nSalário Base dos Funcionários: " + salarioBaseFuncionario +
                "\nEndereço: " + endereco +
                "\nData de Fundação: " + dataFundacao +
                "\nEstoque de Produtos:\n";

        imprimeProdutos();  // Utilizando o método imprimeProdutos

        return result;
    }

    // Método para calcular os gastos com salários dos funcionários
    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1; // Não é possível calcular os gastos com salários
        } else {
            return quantidadeFuncionarios * salarioBaseFuncionario;
        }
    }

    // Método para calcular o tamanho da loja
    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P'; // Loja pequena
        } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
            return 'M'; // Loja média
        } else {
            return 'G'; // Loja grande
        }
    }

    // Método para imprimir informações de todos os produtos da loja
    public void imprimeProdutos() {
        System.out.println("Produtos da Loja " + nome + ":\n");

        for (Produto produto : estoqueProdutos) {
            if (produto != null) {  // Verifica se o produto não é nulo (evita NullPointerException)
                System.out.println(produto.toString());
                System.out.println("------------------------");
            }
        }
    }
    
    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true; // Produto inserido com sucesso
            }
        }
        return false; // Não há espaço livre no estoque
    }
    
 // Método para remover um produto do estoque pelo nome
    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true; // Produto removido com sucesso
            }
        }
        return false; // Produto não encontrado no estoque
    }
    
    // Getters e Setters para os atributos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(int salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

}