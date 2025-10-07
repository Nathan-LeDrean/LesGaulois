package tableaux;

public class TestTableau {
	public static void main(String[] args) {
		int[] tableauEntiers = { 5, 7, 2, 5, 3 };
		String[] tableauChaines = new String[5];
		int nbChaines = 0;
		tableauChaines[nbChaines] = "Hello";
		nbChaines++;
		tableauChaines[nbChaines] = "World";
		nbChaines++;
		tableauChaines[3] = " !";
		for (int entier : tableauEntiers) {
			System.out.print(entier + " ");
		}
		for (String chaine : tableauChaines) {
			if (chaine != null) {
			System.out.print(chaine + " ");
			}
		}

	}
}
