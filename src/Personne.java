public abstract class Personne {
    private String nom;

    public Personne(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public abstract String getRole();

    public void afficher() {
        System.out.println(getRole() + " : " + nom);
    }
}
