package POO;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
    Etudiant etudiant = new Etudiant("Dupont", "Jean", 123, new Date(), "Master");

    etudiant.montrerDetails();
    System.out.println("Date d'inscription: " + etudiant.getDateInscription());
    System.out.println("Niveau d'étude: " + etudiant.getNiveauEtude());

    etudiant.setNiveauEtude("Doctorat");
    System.out.println("Nouveau niveau d'étude: " + etudiant.getNiveauEtude());

    Cours cours = new Cours();
    cours.setTitre("Programmation en Java");
    cours.setFormateur("M. Dupont");
    cours.setDuree(2);
    cours.setPlacesRestantes(30);

    cours.montrerDetails();

    cours.participer();

    System.out.println("Places restantes après la participation de l'étudiant: " + cours.getPlacesRestantes());

    cours.quitter();

    System.out.println("Places restantes après que l'étudiant ait quitté le cours: " + cours.getPlacesRestantes());
    }
}