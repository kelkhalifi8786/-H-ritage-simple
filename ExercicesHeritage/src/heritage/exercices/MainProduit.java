package heritage.exercices;

public class MainProduit {
    public static void main(String[] args) {
        Produit p1 = new ProduitAlimentaire("Yaourt", 5.5, "01/12/2025");
        Produit p2 = new ProduitElectronique("Téléphone", 3500, 24);

        p1.afficherInfos();
        p2.afficherInfos();
    }
}
