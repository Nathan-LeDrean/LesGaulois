package personnages;

public class Druide {
    private String nom;
    private int force;
    private int nbDoses;
    private int forcePotion;

    public Druide(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    private String prendreParole() {
        return "Le Druide " + nom + " : ";
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "\"" + texte + "\"");
    }

    public String getNom() {
        return nom;
    }

    public void fabriquerPotion(int nbDoses, int forcePotion) {
        this.nbDoses = nbDoses;
        this.forcePotion = forcePotion;
        parler("J'ai concoct� " + nbDoses + " doses de potion magique. Elle a une force de " + forcePotion + ".");
    }

    public void boosterGaulois(Gaulois gaulois) {
        if (gaulois.getNom().equals("Ob�lix")) {
            parler("Non, Ob�lix Non !... Et tu le sais tr�s bien !");
        } else if (nbDoses > 0) {
            parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");
            gaulois.boirePotion(forcePotion);
            nbDoses--;
        } else {
            parler("D�sol�, il n'y a plus de potion !");
        }
    }
}
