package treino;


import javax.swing.JOptionPane;

public class Arrays {

	public static void main(String[] args) {


		String[] numeros = new String[3];
		numeros[0] = JOptionPane.showInputDialog("Insira um valor de 0 a 100 :");
		numeros[1] = JOptionPane.showInputDialog("Insira um valor de 0 a 100 :");
		numeros[2] = JOptionPane.showInputDialog("Insira um valor de 0 a 100 :");

		int primeiroNum = Integer.parseInt(numeros[0]);
		int segundoNum = Integer.parseInt(numeros[1]);
		int terceiroNum = Integer.parseInt(numeros[2]);

		System.out.println(
				(primeiroNum + segundoNum + terceiroNum) / numeros.length);


				
	}
}
