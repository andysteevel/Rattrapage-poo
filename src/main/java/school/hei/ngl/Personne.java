package school.hei.ngl;

public class Personne implements NglApplication{
    private int id;
    private String nom;
    private String prenom;
    private String mail;

    public Personne(int id, String nom, String prenom, String mail){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
 }

    public int getId() {
        return id;
   }

    public void setId(int id) {
        this.id = id;
  }

    public String getMail() {
        return mail;
}

    public void setMail(String mail) {
        this.mail = mail;
      }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String getIdentifiant() {
        return "";
    }

    @Override
    public void afficherInfos() {

    }
}
