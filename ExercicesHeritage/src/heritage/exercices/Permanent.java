package heritage.exercices;

public class Permanent extends Employe {
    private float primeAnnuelle;

    public Permanent(String nom, int id, float salaireDeBase, float primeAnnuelle) {
        super(nom, id, salaireDeBase);
        this.primeAnnuelle = primeAnnuelle;
    }

    @Override
    public void afficherInfos() {
        System.out.println("Employé Permanent - Nom : " + nom +
                           ", ID : " + id +
                           ", Salaire de base : " + salaireDeBase +
                           ", Prime annuelle : " + primeAnnuelle);
    }
}
