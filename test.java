public class test {
    public static void main(String[] args) {
    	personne p1 = new personne();
    	personne p2 = new personne("Bouabdellha", "Mohamed", 19, "Homme");

        System.out.println("---- Personne 1 ----");
        p1.affiche();
        System.out.println("---- Personne 2 ----");
        p2.affiche();

        if (p1.meme_dernier_nom(p2)) {
            System.out.println("Les deux personnes ont le même nom de famille.");
        } else {
            System.out.println("Les deux personnes ont des noms différents.");
        }

        if (p1.getAge() > p2.getAge()) {
            System.out.println(p1.getPrenom() + " est plus âgé que " + p2.getPrenom());
        } else if (p1.getAge() < p2.getAge()) {
            System.out.println(p2.getPrenom() + " est plus âgé que " + p1.getPrenom());
        } else {
            System.out.println("Les deux personnes ont le même âge.");
        }
    }
}
