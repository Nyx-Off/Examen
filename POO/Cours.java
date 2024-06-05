package POO;

public class Cours {
    private String titre;
    private String formateur;
    private int duree;
    private int placesRestantes;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getFormateur() {
        return formateur;
    }

    public void setFormateur(String formateur) {
        this.formateur = formateur;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public int getPlacesRestantes() {
        return placesRestantes;
    }

    public void setPlacesRestantes(int placesRestantes) {
        this.placesRestantes = placesRestantes;
    }

    public void montrerDetails() {
        System.out.println("Titre du cours: " + titre);
        System.out.println("Formateur: " + formateur);
        System.out.println("Durée: " + duree + " heures");
        System.out.println("Places restantes: " + placesRestantes);
    }

    public void participer() {
        if (placesRestantes > 0) {
            placesRestantes--;
            System.out.println("Vous participé au cours. Places restantes : " + placesRestantes);
        } else {
            System.out.println("Désolé, il n'y a plus de places disponibles pour ce cours.");
        }
    }
    
    public void quitter() {
        placesRestantes++;
        System.out.println("Vous avez quitté le cours. Places restantes : " + placesRestantes);
    }

}