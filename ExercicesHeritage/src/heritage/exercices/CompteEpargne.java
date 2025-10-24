package heritage.exercices;

public class CompteEpargne extends Compte {
    private double tauxInteret;

    public CompteEpargne(int numero, double soldeInitial, double tauxInteret) {
        super(numero, soldeInitial);
        this.tauxInteret = tauxInteret;
    }

    public void calculerInteret() {
        double interet = solde * tauxInteret / 100;
        solde += interet;
    }
}
