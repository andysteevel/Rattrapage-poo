package school.hei.ngl;

import java.time.LocalDateTime;

public class Message {
    private String texte;
    private LocalDateTime dateHeure;
    private boolean confidentiel;
    private NglApplication auteur;

    public Message(String texte, LocalDateTime dateHeure, boolean confidentiel, NglApplication auteur){
        this.texte = texte;
        this.dateHeure = dateHeure;
        this.confidentiel = confidentiel;
        this.auteur = auteur;
    }

    public NglApplication getAuteur(){
        return auteur;
  }
}