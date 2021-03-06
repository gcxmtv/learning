package treino;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionSet {

	
	public static void main(String[] args) {
		
		Set<String> aprovados = new HashSet<String>();
		aprovados.add("Paulo");
		aprovados.add("Kissia Dias");
		aprovados.add("Vagner Machado");
		aprovados.add("MAtheus");
		aprovados.add("Giancarlo");
		
		for ( var nome: aprovados) { System.out.println(nome);}
				
		Set<String> amigosKissia = new LinkedHashSet<String>();
		amigosKissia.add("Paulo");
		amigosKissia.add("Kissia Dias");
		amigosKissia.add("Vagner Machado");
		amigosKissia.add("MAtheus");
		amigosKissia.add("Giancarlo");
	
		System.out.println("\n");
		for ( var amigos: amigosKissia) { System.out.println(amigos.toUpperCase());}
		
		
	}
}
