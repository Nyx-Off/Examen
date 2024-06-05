package POO;
import java.util.Date;

public class Etudiant extends Individu {
    private Date dateInscription;
    private String niveauEtude;

    public Etudiant(String nom, String prenom,int identifiant, Date dateInscription, String niveauEtude){
        super(nom, prenom, identifiant);
        this.dateInscription = dateInscription;
        this.niveauEtude = niveauEtude;
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

    public void montrerDetails() {
        System.out.println("Nom: " + getNom());
        System.out.println("Prénom: " + getPrenom());
        System.out.println("Identifiant: " + getIdentifiant());
    }

}
