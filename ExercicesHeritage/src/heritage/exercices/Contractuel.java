package heritage.exercices;

public class Contractuel extends Employe {
    private int dureeContrat; // en mois
    private float tauxHoraire;

    public Contractuel(String nom, int id, float salaireDeBase, int dureeContrat, float tauxHoraire) {
        super(nom, id, salaireDeBase);
        this.dureeContrat = dureeContrat;
        this.tauxHoraire = tauxHoraire;
    }

    public float calculerSalaireMensuel(int heures) {
        return heures * tauxHoraire;
    }

    @Override
    public void afficherInfos() {
        System.out.println("Employé Contractuel - Nom : " + nom +
                           ", ID : " + id +
                           ", Taux horaire : " + tauxHoraire +
                           ", Durée du contrat : " + dureeContrat + " mois");
    }
}
