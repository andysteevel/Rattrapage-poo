package school.hei.ngl;

public class Anonyme implements NglApplication{
    private String id ;

    public Anonyme( String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getIdentifiant() {
        return "";
    }

    @Override
    public void afficherInfos() {

    }
}
