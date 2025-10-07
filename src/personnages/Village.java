package personnages;

public class Village {
	private String nom;
	private  int nbVillageois;
	private Gaulois chef; 
	private Gaulois[] villageois;
	public String getNom() {
		return nom;
	}
	
	public Gaulois getChef() {
		return chef;
	}
	public int getNbVillageois() {
		return nbVillageois;
	}
	
	public Village(String nom, Gaulois chef, int nbVillageMax) {
		this.nom = nom;
		this.chef = chef;
		this.villageois = new Gaulois[nbVillageMax];
		this.nbVillageois = 0;
	}
	
	
	public void ajouterVillageois(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois] = gaulois;
			gaulois.setVillage(this);
			nbVillageois ++;
		}
	}
	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois <= 0 || numVillageois > nbVillageois) {
			System.out.println("Il n’y a pas autant d’habitants dans notre village !");
			return null;
		}
		return villageois[numVillageois - 1];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village " + nom +  " du chef " + chef.getNom());
		System.out.println("vivent les légendaires gaulois :");
		for(int i = 0; i < nbVillageois; i ++) {
			System.out.println(villageois[i]);
		}
	}
	
    public static void main(String[] args) {
    	Gaulois Abraracourcix = new Gaulois("Abraracourcix", 6);
    	Village village = new Village("“Village des Irréductibles”", Abraracourcix, 30);
    	Gaulois Astérix = new Gaulois("Astérix", 6);
    	village.ajouterVillageois(Astérix);
    	Gaulois gaulois = village.trouverVillageois(1);
    	System.out.println(gaulois);
    	gaulois = village.trouverVillageois(2);
    	System.out.println(gaulois);
    	village.afficherVillageois();
    }


}
