package POO;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Etudiant etudiant = new Etudiant("Dupont", "Jean", 123, new Date(), "Master");

        System.out.println("Nom: " + etudiant.getNom());
        System.out.println("Prénom: " + etudiant.getPrenom());
        System.out.println("Identifiant: " + etudiant.getIdentifiant());
        System.out.println("Date d'inscription: " + etudiant.getDateInscription());
        System.out.println("Niveau d'étude: " + etudiant.getNiveauEtude());

        etudiant.setNiveauEtude("Doctorat");
        System.out.println("Nouveau niveau d'étude: " + etudiant.getNiveauEtude());

    }

}
