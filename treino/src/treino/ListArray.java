package treino;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListArray {

	public static void main(String[] args) {
		
	
	List<String> sorteio = new ArrayList<String>();
	sorteio.add("GIAN CARLO");
	sorteio.add("KISSIA DIAS");
	sorteio.add("MARCUS DIAS");
	sorteio.add("WILLA DIAS");
	
	Random sorteando = new Random();
	
	System.out.println(sorteio.get(sorteando.nextInt(4)));
		
	}
	
}
