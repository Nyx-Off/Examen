package POO;

public abstract class Individu {
    protected String nom;
    protected String prenom;
    protected int identifiant;


    //constructeur

    public Individu(String nom, String prenom, int identifiant){
        this.nom = nom;
        this.prenom = prenom; 
        this.identifiant = identifiant;
    }

    //getters

    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public int getIdentifiant(){
        return this.identifiant;
    }

    //setters 

    public String setNom(String nom){
        return this.nom = nom;
    }

    public String setPrenom(String prenom){
        return this.prenom = prenom;
    }

    public int setIdentifiant(int identifiant){
        return this.identifiant = identifiant;
    }
    
}
