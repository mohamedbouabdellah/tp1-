class personne {
    private String nom;
    private String prenom;
    private int age;
    private String sexe;

    public personne() {
        this.nom = "Ben ALI";
        this.prenom = "Med";
        this.age = 30;
        this.sexe = "Homme";
    }

    public personne(String nom, String prenom, int age, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
    }

    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public int getAge() { return age; }
    public String getSexe() { return sexe; }

    public void affiche() {
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Âge: " + age);
        System.out.println("Sexe: " + sexe);
    }

    public boolean meme_dernier_nom(personne p) {
        return this.nom.equalsIgnoreCase(p.nom);
    }
}
