package POO;

public class Enseignant extends Individu {
    private String specialisation;
    private double salaireMensuel;

    public Enseignant(String nom, String prenom, int id, String specialisation, double salaireMensuel) {
        super(nom, prenom, id);
        this.specialisation = specialisation;
        this.salaireMensuel = salaireMensuel;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public double getSalaireMensuel() {
        return salaireMensuel;
    }

    public void setSalaireMensuel(double salaireMensuel) {
        this.salaireMensuel = salaireMensuel;
    }

    public void montrerDetails() {
        System.out.println("Nom: " + getNom());
        System.out.println("Prénom: " + getPrenom());
        System.out.println("Identifiant: " + getIdentifiant());
        System.out.println("Spécialisation: " + specialisation);
        System.out.println("Salaire mensuel: " + salaireMensuel);
    }
}