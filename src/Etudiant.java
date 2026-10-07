public class Etudiant extends Personne {
    private String filiere;

    public Etudiant(String nom, String filiere) {
        super(nom);
        this.filiere = filiere;
    }

    public String getFiliere() {
        return filiere;
    }

    @Override
    public String getRole() {
        return "Etudiant en " + filiere;
    }
}