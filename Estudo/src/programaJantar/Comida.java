package programaJantar;

public class Comida {

	String eUm = "Batata Frita";
	double pEUm = 0.400;
	int precoEUm = 15;

	String entradaDois = "Dadinho de Tapioca";
	double pesoEntradaDois = 0.500;
	int precoEDois = 22;

	String entradaTres = "Asinhas de Frango";
	double pesoEntradaTres = 0.800;
	int precoETres = 29;

	String pratoPrincipal = "Filé ao molho  madeira";
	double pesoPratoPrincipal = 0.500;
	int precoPUm = 45;

	
	public String verCardapio() {
		return " Você deseja ver nosso cardapio? "
	;}
	
	public void MostrarComida() {
		System.out.println("\n=====> Entrada: " + "\n\n" + "-- E1." + this.eUm + "   R$" + this.precoEUm + "\n-- E2."
				+ this.entradaDois + "   R$" + this.precoEDois + "\n-- E3." + this.entradaTres + "   R$"
				+ this.precoETres + "\n\n=====> Prato Principal" + "\n\n-- P1." + this.pratoPrincipal + "\n-- P2.");

	}
}
