package heritage.exercices;

public class MainEmploye {
    public static void main(String[] args) {
        Employe[] tab = new Employe[3];

        tab[0] = new Permanent("Ali", 1, 5000, 2000);
        tab[1] = new Contractuel("Sara", 2, 0, 6, 80);
        tab[2] = new Permanent("Hicham", 3, 7000, 1500);

        for (Employe e : tab) {
            e.afficherInfos();
            System.out.println("-------------------");
        }

        Contractuel c = (Contractuel) tab[1];
        System.out.println("Salaire mensuel de " + c.nom + " : " + c.calculerSalaireMensuel(160) + " DH");
    }
}
