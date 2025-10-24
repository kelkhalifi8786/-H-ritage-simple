package heritage.exercices;

public class MainCompte {
    public static void main(String[] args) {
        CompteEpargne c1 = new CompteEpargne(101, 1000, 5);
        c1.deposer(500);
        c1.retirer(200);
        c1.calculerInteret();
        c1.afficherSolde();
    }
}
