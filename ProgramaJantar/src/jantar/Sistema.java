package jantar;

import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {

		Garcom garcom = new Garcom();
		var resposta = new Scanner(System.in);
		Cardapio cardapio = new Cardapio();
		String answer = "";
		String itensConta = "";
		double itensContaValor = 0;
		long itensCaloriaTotal = 0;

		System.out.println("Ol�, " + garcom.recepcao + "! \n" + "Seja Bem-vindo(a) ao nosso restaurante virtual."
				+ "\n Voc� deseja ver nosso cardapio? (sim/nao/sair)");

		answer = resposta.nextLine();
		if (answer.equalsIgnoreCase("sim")) {

			cardapio.getCardapioCompleto();

			System.out.println("Podemos iniciar seu pedido? (sim/nao/sair)");
			answer = resposta.nextLine().toLowerCase();

			if (answer.equalsIgnoreCase("sim")) {
				do {

					System.out.println(
							"Me diga o c�digo do seu pedido conforme esta no card�pio. (Ex.: E1, ou P1, etc.)");
					answer = resposta.next().toLowerCase();

					switch (answer) {

					case "e1":
						itensConta += cardapio.e1ent;
						itensContaValor += cardapio.e1preco;
						itensCaloriaTotal += cardapio.e2kcal;
						System.out.println("Excelent entrada, deseja pedir algo mais? (sim/nao)");
						answer = resposta.next().toLowerCase();
						break;

					case "e2":
						itensCaloriaTotal += cardapio.e2kcal;
						itensContaValor += cardapio.e2preco;
						itensConta += cardapio.e2ent;
						System.out.println("Excelente entrada, deseja pedir algo mais? (sim/nao)");
						answer = resposta.next().toLowerCase();
						break;

					case "e3":
						itensCaloriaTotal += cardapio.e3kcal;
						itensContaValor += cardapio.e3preco;
						itensConta += cardapio.e3ent;
						System.out.println("Excelent entrada, deseja pedir algo mais? (sim/nao)");
						answer = resposta.next().toLowerCase();
						break;

					case "p1":
						itensCaloriaTotal += cardapio.p1kcal;
						itensContaValor += cardapio.p1preco;
						itensConta += cardapio.p1prato;
						System.out.println("Excelent prato, deseja pedir algo mais? (sim/nao)");
						answer = resposta.next().toLowerCase();
						break;

					case "p2":
						itensCaloriaTotal += cardapio.p2kcal;
						itensContaValor += cardapio.p2preco;
						itensConta += cardapio.p2prato;
						System.out.println("Excelent prato, deseja pedir algo mais? (sim/nao)");
						answer = resposta.next().toLowerCase();
						break;

					case "p3":
						itensCaloriaTotal += cardapio.p3kcal;
						itensContaValor += cardapio.p3preco;
						itensConta += cardapio.p3prato;
						System.out.println("Excelent prato, deseja pedir algo mais? (sim/nao)");
						answer = resposta.next().toLowerCase();
						break;

					case "s1":
						itensCaloriaTotal += cardapio.s1kcal;
						itensContaValor += cardapio.s1preco;
						itensConta += cardapio.s1sob;
						System.out.println("Excelent sobremesa, deseja pedir algo mais? (sim/nao)");
						break;

					case "s2":
						itensCaloriaTotal += cardapio.s2kcal;
						itensContaValor += cardapio.s2preco;
						itensConta += cardapio.s2sob;
						System.out.println("Excelent sobremesa, deseja pedir algo mais? (sim/nao)");
						answer = resposta.next().toLowerCase();
						break;

					case "s3":
						itensCaloriaTotal += cardapio.s3kcal;
						itensContaValor += cardapio.s3preco;
						itensConta += cardapio.s3sob;
						System.out.println("Excelent sobremesa, deseja pedir algo mais? (sim/nao)");
						answer = resposta.next().toLowerCase();
						break;

					}
				} while (!answer.equalsIgnoreCase("nao"));

			} else if (answer.equalsIgnoreCase("nao")) {

				System.out.println(
						"Certo, Voc� ja tem em mente seu pedido ou deseja sair de nosso restaurante virtual? (sim/nao/sair)");
				answer = resposta.nextLine();

				switch (answer) {

				case "sim":
					System.out.println("Me informe o/os codigo(s) do seu pedido por favor.");
					break;

				case "nao":
					System.out.println("Ent�o porque voce n�o da uma olhada em nosso cardapio?");
					cardapio.getCardapioCompleto();
					break;

				case "sair":
					System.out.println("Tudo bem, tenha um(a) " + garcom.recepcao + "!!");
					System.exit(0);

				}
			} else {
				System.out.println("Tudo bem, tenha um(a) " + garcom.recepcao + "!!");
				System.exit(0);
			}

		} else if (answer.toLowerCase().equals("nao")) { 
			
			
			System.out.println("saida do nao"); } else { System.out.println("voce saiu do sistema!"); System.exit(0); }
		
		
		System.out.println("sua conta = " + itensConta + "\ntotal da sua conta R$" + itensContaValor + "\nvoce ingeriu "
				+ itensCaloriaTotal + "kcal.");

	System.out.println("pulamos para o fim do codigo!");
	
	
	
	resposta.close();
	
	}
	
}