package treino;

import java.util.Random;

import javax.swing.JOptionPane;

public class RoletaRussa {
	public static void main(String[] args) {
		
		Random numAleatorio = new Random();
		
		String toDie[] = new String[5];
		toDie[0] = JOptionPane.showInputDialog("Insira um nome para a roleta russa :");
		toDie[1] = JOptionPane.showInputDialog("Insira um nome para a roleta russa :");
		toDie[2] = JOptionPane.showInputDialog("Insira um nome para a roleta russa :");
		toDie[3] = JOptionPane.showInputDialog("Insira um nome para a roleta russa :");
		toDie[4] = JOptionPane.showInputDialog("Insira um nome para a roleta russa :");
		
		int tiro = numAleatorio.nextInt(5);
		
		System.out.println("O(a) "+ toDie[tiro] + " levou um tiro na cabeca!!!!");
	}

}
