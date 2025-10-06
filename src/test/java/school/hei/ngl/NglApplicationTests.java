package school.hei.ngl;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class NglApplicationTests {

    @Test
        public void Test() {
            NglApplication u1 = new Personne(123 , "Andy", "Steevel", "alice@gmail.com");
            NglApplication u2 = new Anonyme("Randy007");
            Publication pub = new Publication("pub001", u1);
            pub.ajouterMessage(new Message("bonjour", LocalDateTime.now(), false, u1));
            pub.ajouterMessage(new Message("salut", LocalDateTime.now(), true, u2));
            pub.ajouterMessage(new Message("coucou", LocalDateTime.now(), true, u2));
            pub.afficherAuteursMessages();
        System.out.println(pub);
        }
    }

