package school.hei.ngl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Publication{
    private String id;
    private NglApplication auteur;
    private List<Message> messages;

    public Publication(String id, NglApplication auteur){
        this.id = id;
        this.auteur = auteur;
        this.messages = new ArrayList<>();
  }

    public void ajouterMessage(Message message){
        messages.add(message);
   }

    public void afficherAuteursMessages(){
        Set<String> dejaAffiches = new HashSet<>();
        for (Message msg : messages) {
            NglApplication auteur = msg.getAuteur();
            if (!dejaAffiches.contains(auteur.getIdentifiant())) {
                auteur.afficherInfos();
                dejaAffiches.add(auteur.getIdentifiant());
    }
 }
}
}
