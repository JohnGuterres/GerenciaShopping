import java.util.Map;
import java.text.Normalizer;

public class Shopping {

    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    // Construtor que inicializa o nome, o endereço e a capacidade máxima de lojas do shopping
    public Shopping(String nome, Endereco endereco, int capacidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[capacidadeMaximaLojas];
    }

    // Getters e Setters para os atributos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    // Método toString para retornar informações formatadas do shopping
    @Override
    public String toString() {
        return "Shopping: " + nome +
               "\nEndereço: " + endereco +
               "\nLojas:\n" + lojasToString();
    }

    // Método privado para formatar as informações das lojas
    public String lojasToString() {
        String result = "Shopping: " + nome +
                "\nEndereço: " + endereco +
                "\nLojas:\n";

        for (Loja loja : lojas) {
            if (loja != null) {
                result += loja.toString() + "\n";
            }
        }

        return result;
    }
    
    // Método para inserir uma loja no array de lojas
    public boolean insereLoja(Loja novaLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = novaLoja;
                return true; // Loja inserida com sucesso
            }
        }
        return false; // Não há lugar disponível para inserir a loja
    }
    
 // Método para remover uma loja do array de lojas
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true; // Loja removida com sucesso
            }
        }
        return false; // Não encontrou a loja com o nome especificado
    }
    
    private boolean verificaTipo(Loja loja, String tipo) {
        // Obtém o nome simples da classe da loja
        String nomeClasse = loja.getClass().getSimpleName();
        nomeClasse = removerAcentos (nomeClasse).toLowerCase();
        String tipoNormalizado = removerAcentos (tipo).toLowerCase();
        return nomeClasse.equals(tipoNormalizado);
    }
    
    // substitui acento por sem acento
    public static String removerAcentos(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
    // Método para contar a quantidade de lojas de um determinado tipo
    public int quantidadeLojasPorTipo(String tipo) {
        int contador = 0;

        // Itera sobre as lojas e verifica o tipo da loja
        for (Loja loja : lojas) {
            if (loja != null && verificaTipo(loja, tipo)) {
                contador++;
            }
        }

        return contador;
    }

    
    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;

        // Itera sobre as lojas e encontra a loja de Informatica com o maior valor de seguro
        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja; // Cast para Informatica
                double valorSeguro = informatica.getSeguroEletronicos();

                if (lojaMaisCara == null || valorSeguro > lojaMaisCara.getSeguroEletronicos()) {
                    lojaMaisCara = informatica;
                }
            }
        }

        return lojaMaisCara;
    }
}
    
