package programaJantar;

/**
 * 
 * @author Gian Carlo Xavier Mantovani
 * @contato gcxmtv@gmail.com
 * @version 1.0
 * @since 1.0
 * 
 */

import java.util.Date;
import java.util.Scanner;


public class Jantar {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Comida pratos = new Comida();
		Pessoa cadastro = new Pessoa();
		double conta = 0 ;
		Date hora = new Date();

		int horaAtual = hora.getHours();

		String saudacao;

		if (horaAtual >= 01 && horaAtual <= 11) {
			saudacao = "Bom Dia";
		} else if (horaAtual >= 12 && horaAtual <= 18) {
			saudacao = "Boa Tarde";
		} else {
			saudacao = "Boa Noite";
		}

		
		System.out.println(
				"Olá " + saudacao + ", seja bem vindo(a) ao nosso restaurante virtual.\n" + pratos.verCardapio());
		String cardapio = entrada.nextLine().toLowerCase();


		if (cardapio.equalsIgnoreCase("sim")) {
			pratos.MostrarComida();
			System.out.println("\nVoce deseja pedir uma entrada ou ir para o prato principal?");
			String pratoOuEntrada = entrada.nextLine();
			if (pratoOuEntrada.contains("entrada")) {
				System.out.println("Digite o numero da entrada que voce deseja comer.");

				int entradaPedido = entrada.nextInt();

				if (entradaPedido == 1) {
					System.out.println("Voce fez uma excelente escolha, este prato possui " + pratos.pEUm
							+ "gr de puro prazer gastronomico.");
					cadastro.peso += pratos.pEUm;
					conta += pratos.precoEUm;
				
					
					}
				}

				else {
				}
				
			System.out.println("Agora vamos de prato principal?");
			String pedirPratoAposEntrada = entrada.nextLine();
			
			if ( pedirPratoAposEntrada.equalsIgnoreCase("sim")) {
				System.out.println("Agora você vai se deliciar de um delicioso file ao mlho madeira!!");
				conta += pratos.precoPUm;
				cadastro.peso += pratos.pesoPratoPrincipal;
			
				
			}

			
			
			
			
			
			
			else if (pratoOuEntrada.contains("prato")) {
				System.out.println("Digite o código do prato que voce deseja comer:");
				String pratoPedido = entrada.next();

				if (pratoPedido.equalsIgnoreCase("p1")) {
					cadastro.peso += pratos.pesoPratoPrincipal;
					conta += pratos.precoPUm;
					System.out.println("Voce fez uma excelente escolha, este prato tem " + pratos.pesoPratoPrincipal
							+ "gr de puro prazer gastronomico.");

				}
			}
		}

		else if (cardapio.equalsIgnoreCase("nao")) {
			System.out.println("Tudo bem tenha uma " + saudacao);
		} else {
			System.out.println("Bastava dizer sim ou nao...");

		}

		System.out.println("Voce deseja pedir mais alguma coisa?");
		String maisPedido = entrada.nextLine();

		if (maisPedido.equals("sim")) {
			System.out.println("Você deseja ver o cardápio novamente ou já sabe o que deseja?");
			String verOuJaSabe = entrada.nextLine();
			
			if (verOuJaSabe.equals("sim")) {
				pratos.MostrarComida();
	
			}

		} else {
			System.out.println("Certo, qual seu pedido?");
		}

		System.out.println("Depois desse maravilhoso jantar, sua conta deu R$" + conta + ". Qual sua forma de pagamento?");
		
		
		
		
		
		
		entrada.close();

	}

}
