package heritage.exercices;

public class Compte {
    protected int numero;
    protected double solde;

    public Compte(int numero, double soldeInitial) {
        this.numero = numero;
        this.solde = soldeInitial;
    }

    public void deposer(double montant) {
        solde += montant;
    }

    public void retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
        } else {
            System.out.println("Solde insuffisant !");
        }
    }

    public void afficherSolde() {
        System.out.println("Compte N°" + numero + " - Solde : " + solde + " DH");
    }
}
