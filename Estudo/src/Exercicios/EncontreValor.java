package Exercicios;

import java.util.Scanner;

import java.util.Random;

public class EncontreValor {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Random aleatorio = new Random();
		
		int resposta = 0;
		int daVez = aleatorio.nextInt(100) + 1;
		int chance = 3;

		System.out.println(
				"Seja bem vindo ao desafio. Irei pensar em um numero de 0 a 100, você terá 3 chances de acertar, será que você irá conseguir?");
		do {
			System.out.println("Diga um numero: ");
			resposta = entrada.nextInt();

			if (chance != 0 && resposta > daVez) {
				--chance;
				
				System.out.println("Ainda nao foi dessa vez, tente um numero menor!");
				
				System.out.println("Você ainda tem " + chance + " chances...");
			}

			else if (chance != 0 && resposta < daVez) {
				--chance;
				
				System.out.println("Ainda nao foi dessa vez, tente um numero maior!");
				
				System.out.println("Você ainda tem " + chance + " chances...");
			}
			
		
		} while (resposta != daVez && chance != 0);

		if (resposta == daVez) {
			System.out.println("Parabens! Você acertou :D");
		}

		if (chance == 0) {
			System.out.println("Infelizmente não foi dessa vez!");
		}

		entrada.close();

	}
}
