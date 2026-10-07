public class Facture implements Payable {
    private double montant;

    public Facture(double montant) {
        this.montant = montant;
    }

    @Override
    public double calculerPaiement() {
        return montant;
    }
}
