public class ValidadorEtapa4 {

	public static void main(String[] args){
		System.out.println("[Laborat�rio I]\n Desafio: Validador - Etapa 04\n");

		//// Verifica��o da classe Endereco
		//inst�ncia
		Endereco e1 = new Endereco("Rua dos Bobos", "Piraporinha", "SC", "Uruguai", "99000-100", "0", "Fundos");
		System.out.println("\n[OK] Classe Endereco identificada");
		
		//public void setNomeDaRua(String nomeDaRua);
		e1.setNomeDaRua("Bla");
		System.out.println("[OK] M�todo Endereco.setNomeDaRua()");
		
		//public String getNomeDaRua()
		System.out.println(e1.getNomeDaRua().equals("Bla") ? "[OK] M�todo Endereco.getNomeDaRua()" : "[NOK] M�todo Endereco.getNomeDaRua()");
		
		//public void setCidade(String cidde);
		e1.setCidade("S�o Leopoldo");
		System.out.println("[OK] M�todo Endereco.setCidade()");
		
		//public String getCidade();
		System.out.println(e1.getCidade().equals("S�o Leopoldo") ? "[OK] M�todo Endereco.getCidade()" : "[NOK] M�todo Endereco.getCidade()");
		
		//public void setEstado(String estado);
		e1.setEstado("RS");
		System.out.println("[OK] M�todo Endereco.setEstado()");
		
		//public String getEstado();
		System.out.println(e1.getEstado().equals("RS") ? "[OK] M�todo Endereco.getEstado()" : "[NOK] M�todo Endereco.getEstado()");		
		
		//public void setPais(String pais);
		e1.setPais("Brasil");
		System.out.println("[OK] M�todo Endereco.setPais()");
		
		//public String getPais();
		System.out.println(e1.getPais().equals("Brasil") ? "[OK] M�todo Endereco.getPais()" : "[NOK] M�todo Endereco.getPais()");
		
		//public void setCep(String cep);
		e1.setCep("99999-000");
		System.out.println("[OK] M�todo Endereco.setCep()");
		
		//public String getCep();
		System.out.println(e1.getCep().equals("99999-000") ? "[OK] M�todo Endereco.getCep()" : "[NOK] M�todo Endereco.getCep()");		
		
		//public void setNumero(String numero);
		e1.setNumero("50");
		System.out.println("[OK] M�todo Endereco.setNumero()");
		
		//public String getNumero();
		System.out.println(e1.getNumero().equals("50") ? "[OK] M�todo Endereco.getNumero()" : "[NOK] M�todo Endereco.getNumero()");
		
		//public void setComplemento(String complemento);
		e1.setComplemento("apto 502");
		System.out.println("[OK] M�todo Endereco.setComplemento()");
		
		//public String getComplemento();
		System.out.println(e1.getComplemento().equals("apto 502") ? "[OK] M�todo Endereco.getComplemento()" : "[NOK] M�todo Endereco.getComplemento()");
		
		//public String toString();
		e1.toString();
		System.out.println("[OK] M�todo Endereco.toString()");
		
		
		//// Verifica��o da classe Data
		//inst�ncia
		Data d1 = new Data(10, 3, 2023);
		System.out.println("\n[OK] Classe Data identificada");
				
		//public void setDia(int dia);
		d1.setDia(15);
		System.out.println("[OK] M�todo Dia.setDia()");
		
		//public int getDia();
		System.out.println(d1.getDia() == 15 ? "[OK] M�todo Dia.getDia()" : "[NOK] M�todo Dia.getDia()");
		
		//public void setMes(int mes);
		d1.setMes(12);
		System.out.println("[OK] M�todo Dia.setMes()");
		
		//public int getMes()
		System.out.println(d1.getMes() == 12 ? "[OK] M�todo Dia.getMes()" : "[NOK] M�todo Dia.getMes()");
		
		//public void setAno(int ano);
		d1.setAno(2024);
		System.out.println("[OK] M�todo Dia.setAno()");
			
		//public int getAno();
		System.out.println(d1.getAno() == 2024 ? "[OK] M�todo Dia.getAno()" : "[NOK] M�todo Dia.getAno()");
		
		//public String toString();	
		d1.toString();
		System.out.println("[OK] M�todo Data.toString()");
		
		//public boolean verificaAnoBissexto();
		System.out.println(d1.verificaAnoBissexto() ? "[OK] M�todo Dia.verificaAnoBissexto()" : "[NOK] M�todo Dia.verificaAnoBissexto()");


		//// Verifica��o da classe Produto
		Produto p1 = new Produto("Cubo m�gico", 10, d1);
		System.out.println("\n[OK] Classe Produto identificada");
		
		//public void setNome(String nome);
		p1.setNome("Cubo maravilha");
		System.out.println("[OK] M�todo Produto.setNome()");
	
		//public String getNome();
		System.out.println(p1.getNome().equals("Cubo maravilha") ? "[OK] M�todo Produto.getNome()" : "[NOK] M�todo Produto.getNome()");

		//public void setPreco(double preco);		
		p1.setPreco(20);
		System.out.println("[OK] M�todo Produto.setPreco()");
		
		//public double getPreco();
		System.out.println(p1.getPreco() == 20 ? "[OK] M�todo Produto.getPreco()" : "[NOK] M�todo Produto.getPreco()");
		
		//public String toString();
		p1.toString();
		System.out.println("[OK] M�todo Produto.toString()");

		//public void setDataValidade(Data dataValidade);
		p1.setDataValidade(new Data(10, 4, 2023));
		System.out.println("[OK] M�todo Produto.setDataValidade()");
		
		//public double getDataValidade();
		System.out.println(p1.getDataValidade() != null ? "[OK] M�todo Produto.getDataValidade()" : "[NOK] M�todo Produto.getDataValidade()");
		
		//public boolean estaVencido(Data data);
		System.out.println(p1.estaVencido(new Data(20, 4, 2023)) ? "[OK] M�todo Produto.estaVencido()" : "[NOK] M�todo Produto.estaVencido()");

		
		//// Verifica��o da classe Loja
		Loja loja1 = new Loja ("E3", 5, e1, d1, 5);
		System.out.println("\n[OK] Classe Loja identificada (construtor com cinco par�metros)");
		
		Loja loja2 = new Loja ("E7", 20, 2000, e1, d1, 2);
		System.out.println("[OK] Classe Loja identificada (construtor com seis par�metros)");
		
		//public String getNome();
		System.out.println(loja1.getNome().equals("E3") ? "[OK] M�todo Loja.getNome()" : "[NOK] M�todo Loja.getNome()");
		
		//public void setNome(String nome);
		loja1.setNome("E10");
		System.out.println("[OK] M�todo Loja.setNome()");
		
		//public int getQuantidadeFuncionarios();
		System.out.println(loja1.getQuantidadeFuncionarios() == 5 ? "[OK] M�todo Loja.getQuantidadeFuncionarios()" : "[NOK] M�todo Loja.getQuantidadeFuncionarios()");

		//public void setQuantidadeFuncionarios(int quantidadeFuncionarios);
		loja1.setQuantidadeFuncionarios(3);
		System.out.println("[OK] M�todo Loja.setQuantidadeFuncionarios()");

		//public double getSalarioBaseFuncionario();
		System.out.println(loja1.getSalarioBaseFuncionario() == -1 ? "[OK] M�todo Loja.getSalarioBaseFuncionario()" : "[NOK] M�todo Loja.getSalarioBaseFuncionario()");

		//public void setSalarioBaseFuncionario(double salarioBaseFuncionario);
		loja1.setSalarioBaseFuncionario(3000);
		System.out.println("[OK] M�todo Loja.setSalarioBaseFuncionario()");
		
		//public Endereco getEndereco();
		System.out.println(loja1.getEndereco() != null ? "[OK] M�todo Loja.getEndereco()" : "[NOK] M�todo Loja.getEndereco()");
		
		//public void setEndereco(Endereco endereco);
		loja1.setEndereco(new Endereco("Rua Tainhas", "Porto Feliz", "SP", "Brasil", "88.000-100", "67", "Sala 91"));
		System.out.println("[OK] M�todo Loja.setEndereco()");
		
		//public Data getDataFundacao();
		System.out.println(loja1.getDataFundacao() != null ? "[OK] M�todo Loja.getDataFundacao()" : "[NOK] M�todo Loja.getDataFundacao()");
		
		//public void setDataFundacao(Data dataFundacao);
		loja1.setDataFundacao(new Data(10, 8, 2020));
		System.out.println("[OK] M�todo Loja.setDataFundacao()");
		
		//public Produto[] getEstoqueProdutos();
		System.out.println(loja1.getEstoqueProdutos().length == 5 ? "[OK] M�todo Loja.getEstoqueProdutos()" : "[NOK] M�todo Loja.getEstoqueProdutos()");
						
		//public String toString();
		System.out.println(loja1.toString() != null ? "[OK] M�todo Loja.toString()" : "[NOK] M�todo Loja.toString()");
		
		//public double gastosComSalario();
		System.out.println(loja1.gastosComSalario() == 9000 ? "[OK] M�todo Loja.gastosComSalario()" : "[NOK] M�todo Loja.gastosComSalario()");
		
		//public char tamanhoDaLoja();
		System.out.println(loja1.tamanhoDaLoja() == 'P' ? "[OK] M�todo Loja.tamanhoDaLoja()" : "[NOK] M�todo Loja.tamanhoDaLoja()");
		
		//public void imprimeProdutos();
		loja1.imprimeProdutos();
		System.out.println("[OK] M�todo Loja.imprimeProdutos()");
		
		//public boolean insereProduto(Produto p);
		boolean prod1 = loja2.insereProduto(new Produto("Pipoca doce", 5, new Data(10,5,2023)));
		System.out.println(prod1 ? "[OK] M�todo Loja.insereProduto() - inclus�o de um produto" : "[NOK] M�todo Loja.insereProduto() - n�o deixou incluir um produto");

		System.out.println(loja2.getEstoqueProdutos()[1] == null ? "[OK] M�todo Loja.insereProduto() - restante do array permanece vazio" : "[NOK] M�todo Loja.insereProduto() - ao incluir um produto, mexeu nas demais posi��es do array");

		boolean prod2 = loja2.insereProduto(new Produto("Pipoca salgada", 4, new Data(15,5,2023)));
		System.out.println((prod1 && prod2) ? "[OK] M�todo Loja.insereProduto() - inclus�o de dois produtos" : "[NOK] M�todo Loja.insereProduto() - n�o deixou incluir dois produtos");

		boolean prod3 = loja2.insereProduto(new Produto("Pipoca caramelo", 5, new Data(12,5,2023)));
		System.out.println(!prod3 ? "[OK] M�todo Loja.insereProduto() - n�o permitiu inclus�o de item quando array cheio" : "[NOK] M�todo Loja.insereProduto() - permitiu inclus�o de item quando array cheio");
		
		//public boolean removeProduto(String nomeProduto)
		boolean rem1 = loja2.removeProduto("Pipoca salgada");
		System.out.println(rem1 ? "[OK] M�todo Loja.removeProduto()" : "[NOK] M�todo Loja.removeProduto()");
		
		boolean rem2 = loja2.removeProduto("Pipoc caramelo");
		System.out.println(!rem2 ? "[OK] M�todo Loja.removeProduto() - n�o encontrou produto corretamente" : "[NOK] M�todo Loja.removeProduto() - removeu produto que n�o existe");

		//// Verifica��o da classe Cosmetico
		//Cria��o da inst�ncia
		Cosmetico lojaCosmetico = new Cosmetico("Loja Cosm�tico", 10, 2100, e1, d1, 20, 10);
		System.out.println("\n[OK] Classe Cosmetico identificada");
		
		//public void setTaxaComercializacao(double taxaComercializacao)
		lojaCosmetico.setTaxaComercializacao(50);
		System.out.println("[OK] M�todo Cosmetico.setTaxaComercializacao()");
		
		//public double getTaxaComercializacao()
		System.out.println(lojaCosmetico.getTaxaComercializacao() == 50 ? "[OK] M�todo Cosmetico.getTaxaComercializacao()" : "[NOK] M�todo Cosmetico.getTaxaComercializacao()");
		
		//public String toString()
		System.out.println(lojaCosmetico.toString() != null ? "[OK] M�todo Cosmetico.toString()" : "[NOK] M�todo Cosmetico.toString()");

		
		//// Verifica��o da classe Vestuario
		//Cria��o da inst�ncia
		Vestuario lojaVestuario = new Vestuario("Loja Vestu�rio", 10, 2100, e1, d1, false, 10);
		System.out.println("\n[OK] Classe Vestuario identificada");
		
		//public void setProdutosImportados(boolean produtosImportados)
		lojaVestuario.setProdutosImportados(true);
		System.out.println("[OK] M�todo Vestuario.setProdutosImportados()");
		
		//public boolean getProdutosImportados()
		System.out.println(lojaVestuario.getProdutosImportados() ? "[OK] M�todo Vestuario.getProdutosImportados()" : "[NOK] M�todo Vestuario.getProdutosImportados()");
		
		//public String toString()
		System.out.println(lojaVestuario.toString() !=  null ? "[OK] M�todo Vestuario.toString()" : "[NOK] M�todo Vestuario.toString()");
		
		
		//// Verifica��o da classe Bijuteria
		//Cria��o da inst�ncia
		Bijuteria lojaBijuteria = new Bijuteria("Loja Bijuteria", 10, 2100, e1, d1, 5000, 10);
		System.out.println("\n[OK] Classe Bijuteria identificada");
		
		//public void setMetaVendas(double metaVendas)
		lojaBijuteria.setMetaVendas(4000);
		System.out.println("[OK] M�todo Bijuteria.setMetaVendas()");
		
		//public double getMetaVendas()
		System.out.println(lojaBijuteria.getMetaVendas() == 4000 ? "[OK] M�todo Bijuteria.getMetaVendas()" : "[NOK] M�todo Bijuteria.getMetaVendas()");
		
		//public String toString()
		System.out.println(lojaBijuteria.toString() != null ? "[OK] M�todo Bijuteria.toString()" : "[NOK] M�todo Bijuteria.toString()");
		
		
		//// Verifica��o da classe Alimentacao
		//Cria��o da inst�ncia
		Alimentacao lojaAlimentacao = new Alimentacao("Loja Alimenta��o", 10, 2100, e1, d1, d1, 10);
		System.out.println("\n[OK] Classe Alimentacao identificada");

		//public void setDataAlvara(Data dataAlvara)
		lojaAlimentacao.setDataAlvara(new Data(20, 4, 2023));
		System.out.println("[OK] M�todo Alimentacao.setDataAlvara()");
		
		//public Data getDataAlvara()
		System.out.println(lojaAlimentacao.getDataAlvara() != null ? "[OK] M�todo Alimentacao.getDataAlvara()" : "[NOK] M�todo Alimentacao.getDataAlvara()");
		
		//public String toString()
		System.out.println(lojaAlimentacao.toString() != null ? "[OK] M�todo Alimentacao.toString()" : "[NOK] M�todo Alimentacao.toString()");

		
		//// Verifica��o da classe Informatica
		//Cria��o da inst�ncia
		Informatica lojaInformatica = new Informatica("Loja Inform�tica", 10, 2100, e1, d1, 300, 10);
		System.out.println("\n[OK] Classe Informatica identificada");
		
		//public void setSeguroEletronicos(double seguroEletronicos)
		lojaInformatica.setSeguroEletronicos(500);
		System.out.println("[OK] M�todo Informatica.setSeguroEletronicos()");
		
		//public double getSeguroEletronicos()
		System.out.println(lojaInformatica.getSeguroEletronicos() == 500 ? "[OK] M�todo Informatica.getSeguroEletronicos()" : "[NOK] M�todo Informatica.getSeguroEletronicos()");

		//public String toString()
		System.out.println(lojaInformatica.toString() != null ? "[OK] M�todo Informatica.toString()" : "[NOK] M�todo Informatica.toString()");
		
		
		//// Verifica��o da classe Shopping
		Shopping shopping = new Shopping("Shopping Real", e1, 2);
		System.out.println("\n[OK] Classe Shopping idetificada");

		//public void setNome(String nome)
		shopping.setNome("Park Shopping");
		System.out.println("[OK] M�todo Shopping.setNome()");

		//public String getNome()
		System.out.println(shopping.getNome().equals("Park Shopping") ? "[OK] M�todo Shopping.getNome()" : "[NOK] M�todo Shopping.getNome()");

		//public void setEndereco(Endereco endereco)
		Endereco e2 = new Endereco("Rua das Flores", "Porto Alegre","RS", "Brasil", "91000-100", "15", null);
		shopping.setEndereco(e2);
		System.out.println("[OK] M�todo Shopping.setEndereco()");

		//public Endereco getEndereco()
		System.out.println(shopping.getEndereco().getNumero().equals("15") ? "[OK] M�todo Shopping.getEndereco()" : "[NOK] M�todo Shopping.getEndereco()");

		//public Loja[] getLojas()
		System.out.println(shopping.getLojas().length == 2 ? "[OK] M�todo Shopping.getLojas()" : "[NOK] M�todo Shopping.getLojas()");

		//public boolean insereLoja(Loja loja)
		boolean criaLoja1 = shopping.insereLoja(lojaInformatica);
		System.out.println(criaLoja1 ? "[OK] M�todo Shopping.insereLoja() - inclus�o de uma loja" : "[NOK] M�todo Shopping.insereLoja() - n�o deixou inserir a primeira loja");

		System.out.println(shopping.getLojas()[1] == null ? "[OK] M�todo Shopping.insereLoja() - restante do array permanece vazio" : "[NOK] M�todo Shopping.insereLoja() - ao incluir uma loja, mexeu nas demais posi��es do array");
		
		boolean criaLoja2 = shopping.insereLoja(lojaBijuteria);
		System.out.println((criaLoja1 && criaLoja2) ? "[OK] M�todo Shopping.insereLoja() - inclus�o de duas lojas" : "[NOK] M�todo Shopping.insereLoja() - n�o deixou incluir duas lojas");
		
		boolean criaLoja3 = shopping.insereLoja(lojaCosmetico);
		System.out.println(!criaLoja3 ? "[OK] M�todo Shopping.insereLoja() - n�o permitiu inclus�o de item quando array cheio" : "[NOK] M�todo Shopping.insereLoja() - permitiu inclus�o de item quando array cheio");

		//public int quantidadeLojasPorTipo(String tipoLoja)
		int total = shopping.quantidadeLojasPorTipo("Bijuteria");
		System.out.println(total == 1 ? "[OK] M�todo Shopping.quantidadeLojasPorTipo() - localizou uma loja" : "[NOK] M�todo Shopping.quantidadeLojasPorTipo() - n�o conseguiu localizar uma loja");

		//public boolean removeLoja(String nomeLoja)
		boolean removeLoja1 = shopping.removeLoja("Loja Bijuteria");
		System.out.println(removeLoja1 ? "[OK] M�todo Shopping.removeLoja() - removeu corretamente uma loja" : "[NOK] M�todo Shopping.removeLoja() - n�o conseguiu remover a loja");

		boolean removeLoja2 = shopping.removeLoja("Loja Bijuteria");
		System.out.println(!removeLoja2 ? "[OK] M�todo Shopping.removeLoja() - loja n�o existe para remover" : "[NOK] M�todo Shopping.removeLoja() - removeu uma loja que n�o existe");

		lojaInformatica.setSeguroEletronicos(800);
		shopping.insereLoja(lojaInformatica);
		total = shopping.quantidadeLojasPorTipo("Inform�tica");
		System.out.println(total == 2 ? "[OK] M�todo Shopping.quantidadeLojasPorTipo() - localizou duas lojas" : "[NOK] M�todo Shopping.quantidadeLojasPorTipo() - n�o conseguiu localizar as lojas");

		//public Informatica lojaSeguroMaisCaro()
		Informatica maisCaro = shopping.lojaSeguroMaisCaro();
		System.out.println(maisCaro.getSeguroEletronicos() == 800 ? "[OK] M�todo Shopping.lojaSeguroMaisCaro()" : "[NOK] M�todo Shopping.lojaSeguroMaisCaro");

	}
}
