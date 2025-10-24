package heritage.exercices;

public class ProduitElectronique extends Produit {
    private int garantie; // en mois

    public ProduitElectronique(String nom, double prix, int garantie) {
        super(nom, prix);
        this.garantie = garantie;
    }

    @Override
    public void afficherInfos() {
        System.out.println("Produit Électronique - Nom : " + nom +
                           ", Prix : " + prix + " DH" +
                           ", Garantie : " + garantie + " mois");
    }
}
