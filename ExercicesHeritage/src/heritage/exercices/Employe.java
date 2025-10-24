package heritage.exercices;

public class Employe {
    protected String nom;
    protected int id;
    protected float salaireDeBase;

    public Employe(String nom, int id, float salaireDeBase) {
        this.nom = nom;
        this.id = id;
        this.salaireDeBase = salaireDeBase;
    }

    public void afficherInfos() {
        System.out.println("Nom : " + nom + ", ID : " + id + ", Salaire de base : " + salaireDeBase);
    }

    public void finalize() throws Throwable {
        System.out.println("Destruction de l'employé : " + nom);
    }
}
