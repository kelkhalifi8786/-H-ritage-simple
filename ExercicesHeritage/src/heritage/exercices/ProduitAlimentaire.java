package heritage.exercices;

public class ProduitAlimentaire extends Produit {
    private String dateExpiration;

    public ProduitAlimentaire(String nom, double prix, String dateExpiration) {
        super(nom, prix);
        this.dateExpiration = dateExpiration;
    }

    @Override
    public void afficherInfos() {
        System.out.println("Produit Alimentaire - Nom : " + nom + 
                           ", Prix : " + prix + " DH" +
                           ", Date d'expiration : " + dateExpiration);
    }
}
