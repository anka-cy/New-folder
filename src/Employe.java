public class Employe extends Personne implements Payable {
    private double salaire;

    public Employe(String nom, double salaire) {
        super(nom);
        this.salaire = salaire;
    }

    @Override
    public String getRole() {
        return "Employe";
    }

    @Override
    public double calculerPaiement() {
        return salaire;
    }
}
