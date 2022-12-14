package restoraunt;

public class TestRistoranteBackup {
	public static void main(String[] args) {
		System.out.println("RISTORANTE MIVIA - Test backup");
		Comande comande = new Comande("backup.dat", false);
		
		Cameriere cameriere = new Cameriere("Nicola", comande);
		Thread tcameriere = new Thread(cameriere);
		tcameriere.start();
		
		Cuoco cuoco = new Cuoco(comande);
		Thread tcuoco = new Thread(cuoco);
		tcuoco.start();
	}
}
