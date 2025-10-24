package heritage.exercices;

public class Produit {
    protected String nom;
    protected double prix;

    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public void afficherInfos() {
        System.out.println("Nom : " + nom + ", Prix : " + prix + " DH");
    }
}
