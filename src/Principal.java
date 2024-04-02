import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loja loja = null;
        Produto produto = null;

        while (true) {
            System.out.println("Menu:");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma op��o: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar a quebra de linha

            if (opcao == 1) { // inserir loja manualmente
                System.out.print("Nome da loja: ");
                String nomeLoja = scanner.nextLine();
                System.out.print("Quantidade de funcion�rios: ");
                int quantidadeFuncionarios = scanner.nextInt();
                scanner.nextLine(); // Limpar a quebra de linha
                System.out.print("Sal�rio base dos funcion�rios: ");
                int salarioBaseFuncionario = scanner.nextInt();
                scanner.nextLine(); // Limpar a quebra de linha
                System.out.print("Nome da rua: ");
                String nomeRua = scanner.nextLine();
                System.out.print("Cidade: ");
                String cidade = scanner.nextLine();
                System.out.print("Estado: ");
                String estado = scanner.nextLine();
                System.out.print("Pa�s: ");
                String pais = scanner.nextLine();
                System.out.print("CEP: ");
                String cep = scanner.nextLine();
                System.out.print("N�mero: ");
                String numero = scanner.nextLine();
                System.out.print("Complemento: ");
                String complemento = scanner.nextLine();
// atualiza par�metros na classe
                Endereco endereco = new Endereco(nomeRua, cidade, estado, pais, cep, numero, complemento);
                loja = new Loja(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, endereco, null, 0);

                // exibe dados de loja criada
                if (loja != null) {
                	System.out.println("Informa��es da loja:");
                    System.out.println("Nome: " + loja.getNome());
                    System.out.println("Quantidade de Funcion�rios: " + loja.getQuantidadeFuncionarios());
                    System.out.println("Sal�rio Base dos Funcion�rios: " + loja.getSalarioBaseFuncionario());
                    System.out.println("Endere�o: " + loja.getEndereco());
                    System.out.println("Retornando ao menu");
                    System.out.println("");
                }     
                
            } else if (opcao == 2) { // insere produto
                System.out.print("Nome do produto: ");
                String nomeProduto = scanner.nextLine();
                System.out.print("Pre�o do produto: ");
                double precoProduto = scanner.nextDouble();
                scanner.nextLine(); // Limpar a quebra de linha
                System.out.print("Data de validade do produto (no formato dia/m�s/ano): ");
                String dataValidade = scanner.nextLine();

                String[] dataValidadeParts = dataValidade.split("/");
                if (dataValidadeParts.length == 3) {
                    int dia = Integer.parseInt(dataValidadeParts[0]);
                    int mes = Integer.parseInt(dataValidadeParts[1]);
                    int ano = Integer.parseInt(dataValidadeParts[2]);
                    Data dataProduto = new Data(dia, mes, ano);
                    produto = new Produto(nomeProduto, precoProduto, dataProduto);
                    
                 // verifica se o produto est� vencido
                    if (produto != null) {
                        Data dataReferencia = new Data(20, 10, 2023);
                        boolean produtoVencido = produto.estaVencido(dataReferencia);
                        System.out.println(produtoVencido ? "PRODUTO VENCIDO" : "PRODUTO N�O VENCIDO");   
                    	System.out.println("Retornando ao menu");
                    	System.out.println("");
                    }
                    
                } else {
                    System.out.println("Formato de data inv�lido. Use o formato dia/m�s/ano.");
                }

            } else if (opcao == 3) {
                break;
            } else {
                System.out.println("Op��o inv�lida. Tente novamente.");
            }
         
        }
       
    }
}
