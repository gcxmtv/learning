package treino;

import java.util.Random;

import javax.swing.JOptionPane;

public class SorteioArray {

public static void main(String[] args) {
	
Random numAleatorio = new Random();

	double megaSena[] = new double[12]; {
	
	megaSena[0] = 90;
	megaSena[1] = 91;
	megaSena[2] = 92;
	megaSena[3] = 93;
	megaSena[4] = 94;
	megaSena[6] = 95;
	megaSena[7] = 96;
	megaSena[8] = 97;
	megaSena[9] = 98;
	megaSena[10] = 99;
	megaSena[11] = 100;
	
	}
	
	int arrayRandom = numAleatorio.nextInt(10);

	int sorteioArray = (int) megaSena[arrayRandom];
	
	var sorte = JOptionPane.showInputDialog("Digite um numero entre 90 e 100 :");
	int sorteio = Integer.parseInt(sorte);
	
	if (sorteio == sorteioArray ) { System.out.println("Parabens! voce ganhou o premio!!");
	
	} else { System.out.println("nao foi dessa vez!"); 
	System.out.println("o numero sorteado foi " + sorteioArray);}
	

}}
