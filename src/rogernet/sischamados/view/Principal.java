package rogernet.sischamados.view;

import java.util.Scanner;

import rogernet.sischamados.bo.ManterChamado;
import rogernet.sischamados.vo.Chamado;

public class Principal {
	private static final int OPCAO_SAIR = 3;
	private static ManterChamado manter =  new ManterChamado();
	
	

	public static int menu() {
		int opcao;
		Scanner teclado = new Scanner(System.in);

		System.out.println("****************SiSChamados***********");
		System.out.println("1 - Criar chamado");
		System.out.println("2 - Listar  chamados");
		System.out.println("3 - Sair");

		System.out.println("Qual a opcao desejada?");
		opcao = teclado.nextInt();

		return opcao;
	}
	
	private static void criarContato(Chamado chamado) {
		Scanner teclado = new Scanner(System.in);
		String novo ="s";
		
		while (novo.equals("s") ) {
			System.out.println("Informe o codigo do contato ");
			int codigoContato = teclado.nextInt();
			
			System.out.println("Informe o nome do contato");
			String nomeContato = teclado.next();
			
			chamado.cadastrarContato(codigoContato, nomeContato);
			
			System.out.println("Gostaria de Cadastrar um novo contato? s/n");
			
			novo=teclado.next();
		}
		
	}
	
	
	public static void criarChamado() {
		Scanner teclado = new Scanner(System.in);
		int     codigo;
		String  descricao;
		
		System.out.println("Informe o codigo do chamado");
		codigo = teclado.nextInt();
		
		System.out.println("Informe a descricao chamado");
		descricao = teclado.next();

		
		//Inicio BackEnd
		Chamado chamado = new Chamado(codigo,descricao);

		criarContato(chamado);//Link entre Chamado e contato
		
		manter.criarChamado(chamado);
		//Fim BackEnd
		
		System.out.println("Criou o chamado");
	}
	
	public static void listarChamados() {
		System.out.println("******Listagem de Chamados******");
		for (Chamado c : manter.getChamados()) {
			System.out.println(c);
			System.out.println("------------------------------");
		}
		System.out.println("******Fim da Listagem de Chamados******");
		
		
		
		
		
	}

	public static void main(String[] args) {

		int opcao = menu();

		while (opcao < OPCAO_SAIR && opcao > 0) {
			switch (opcao) {
			case 1:
				criarChamado();
				break;
			case 2:
				listarChamados();
				break;
			}//fim case
			
			opcao = menu();
		}//fim while
	}//fim main

}
