package Exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class testeSwitch {

	
	public static void main(String[] args) {
		
		Scanner entrada =  new Scanner(System.in);
		
		
		System.out.println("Adivinhe a cor que estou pensando:");
		String corPensando = entrada.next().toLowerCase();
		
		switch (corPensando) {
			case "azul" : System.out.println("Parab�ns, voc� acertou!!");
			break;
			
			case "vermelho" : System.out.println("Parab�ns, voc� acertou!!");
			break;
			
			case "amarelo" : System.out.println("Parab�ns, voc� acertou!!");
			break;
			
			case "verde" : System.out.println("Parab�ns, voc� acertou!!");
			break;
			
			case "lilas" : System.out.println("Parab�ns, voc� acertou!!");
			break;
			
		}
		
		System.out.println(corPensando);
		
		entrada.close();
	}
}
