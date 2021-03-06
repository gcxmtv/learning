package jantar;

public class Cardapio {

	//////////////
	// ENTRADAS//
	////////////

	String e1ent = "";
	double e1preco = 0;
	double e1peso = 0;
	long e1kcal = 0l;
	String e1desc = "";

	String e2ent = "";
	double e2preco = 0;
	double e2peso = 0;
	long e2kcal = 0l;
	String e2desc = "";

	String e3ent = "";
	double e3preco = 0;
	double e3peso = 0;
	long e3kcal = 0l;
	String e3desc = "";

	///////////////////////
	// PRATOS PRINCIPAIS//
	/////////////////////

	String p1prato = "";
	double p1preco = 0;
	double p1peso = 0;
	long p1kcal = 0l;

	String p2prato = "";
	double p2preco = 0;
	double p2peso = 0;
	long p2kcal = 0l;

	String p3prato = "";
	double p3preco = 0;
	double p3peso = 0;
	long p3kcal = 0l;

	////////////////
	// SOBREMESAS//
	//////////////

	String s1sob = "";
	double s1preco = 0;
	double s1peso = 0;
	long s1kcal = 0l;

	String s2sob = "";
	double s2preco = 0;
	double s2peso = 0;
	long s2kcal = 0l;

	String s3sob = "";
	double s3preco = 0;
	double s3peso = 0;
	long s3kcal = 0l;

	/////////////
	// BEBIDAS//
	///////////

	String b1beb = "";
	double b1preco = 0;

	String b2beb = "";
	double b2preco = 0;

	String b3beb = "";
	double b3preco = 0;

	public Cardapio() {

		////////////////////////// ENTRADAS

		e1ent = "Asinhas de Frango";
		e1preco = 23; // R$
		e1peso = 0.400; // gr
		e1kcal = 1152l; // kcal
		e1desc = "Deliciosas Asinhas de Frango fritas e banhadas ao molho barbecue picante";

		e2ent = "Dadinho de Tapioca";
		e2preco = 22;
		e2peso = 0.500;
		e2kcal = 984l;
		e2desc = "Delicioso Dadinho de Tapioca recheado de queijo mussarela acompanhado de um molho agridoce de goiaba";

		e3ent = "Batata-Frita";
		e3preco = 17;
		e3peso = 350;
		e3kcal = 1023l;

		////////////////////////// PRATOS PRINCIPAIS

		p1prato = "Fil? ao molho madeira";
		p1preco = 65;
		p1peso = 0.500;
		p1kcal = 0;

		p2prato = "Caldeirada";
		p2preco = 120;
		p2peso = 1;
		p2kcal = 0;

		p3prato = "Camar?o ao alho e ?leo";
		p3preco = 70;
		p3peso = 0.450;
		p3kcal = 0;

		////////////////////////// SOBREMESAS

		s1sob = "Petit Gateau";
		s1preco = 28;
		s1peso = 0.300;
		s1kcal = 0;

		s2sob = "Pudim";
		s2preco = 17;
		s2peso = 0.300;
		s2kcal = 0;

		s3sob = "Sorvete";
		s3preco = 22;
		s3peso = 0.450;
		s3kcal = 0;

		///////////////// BEBIDAS

		b1beb = "Refrigerante";
		b1preco = 3.50;

		b2beb = "Suco";
		b2preco = 3;

		b3beb = "Agua";
		b3preco = 3;

	};

	public void getCardapioEntradas() {

		System.out.println("\n========== ENTRADAS ========== \n" + "--- E1. " + e1ent + " R$ " + e1preco + "\n" + "--- E2. "
				+ e2ent + " R$ " + e2preco + "\n" + "--- E3. " + e3ent + " R$ " + e3preco);
	}

	public void getCardapioPratos() {

		System.out.println("\n========== PRATOS ========== \n" + "--- P1. " + p1prato + " R$ " + p1preco + "\n" + "--- P2. "
				+ p2prato + " R$ " + p2preco + "\n" + "--- P3. " + p3prato + " R$ " + p3preco);

	}

	public void getCardapioSobremesa() {

		System.out.println("\n========== SOBREMESAS ========== \n" + "--- S1. " + s1sob + " R$ " + s1preco + "\n" + "--- S2. "
				+ s2sob + " R$ " + s2preco + "\n" + "--- S3. " + s3sob + " R$ " + s3preco);
	}

	public void getCardapioBebidas() {

		System.out.println("\n========== BEBIDAS ========== \n" + "--- B1. " + b1beb + " R$ " + b1preco + "\n" + "--- B2. "
				+ b2beb + " R$ " + b2preco + "\n" + "--- B3. " + b3beb + " R$ " + b3preco + "\n");

	}

	public void getCardapioCompleto() {
		
		getCardapioEntradas();
		getCardapioPratos();
		getCardapioSobremesa();
		getCardapioBebidas();
		
	}


}
