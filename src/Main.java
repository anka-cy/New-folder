public class Main {
    public static void main(String[] args) {
        Personne[] groupe = {
            new Etudiant("Sara", "IMS"),
            new Employe("Omar", 9000),
            new Etudiant("Amina", "GCL")
        };
        afficherGroupe(groupe);

        Payable[] paiements = {
            new Employe("Omar", 8000),
            new Facture(200),
            new Facture(150)
        };
        System.out.println("Total : " + calculerTotal(paiements) + " DH");
    }

    public static void afficherGroupe(Personne[] groupe) {
        for (Personne personne : groupe) {
            personne.afficher();
        }
    }

    public static double calculerTotal(Payable[] paiements) {
        double total = 0;
        for (Payable paiement : paiements) {
            total += paiement.calculerPaiement();
        }
        return total;
    }
}