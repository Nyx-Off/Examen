package POO;
import java.util.Date;
import java.util.List;

public class Etudiant extends Individu {
    private Date dateInscription;
    private String niveauEtude;
    private List<Cours> coursParticipes; 

    public Etudiant(String nom, String prenom,int identifiant, Date dateInscription, String niveauEtude, List<Cours> coursParticipes){
        super(nom, prenom, identifiant);
        this.dateInscription = dateInscription;
        this.niveauEtude = niveauEtude;
        this.coursParticipes = coursParticipes; 
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public String getNiveauEtude() {
        return niveauEtude;
    }

    public void setNiveauEtude(String niveauEtude) {
        this.niveauEtude = niveauEtude;
    }

    public List<Cours> getCoursParticipes() { 
        return coursParticipes;
    }

    public void setCoursParticipes(List<Cours> coursParticipes) { 
        this.coursParticipes = coursParticipes;
    }

    public void montrerDetails() {
        System.out.println("Nom: " + getNom());
        System.out.println("Prénom: " + getPrenom());
        System.out.println("Identifiant: " + getIdentifiant());
    }
}