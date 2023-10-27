package exemple;
 import bandeau.Bandeau;

 import java.util.ArrayList;

public class Scenario {
    private Bandeau bandeau;

    public Scenario() {
    }

    ArrayList<Effet> listeffet = new ArrayList<Effet>(); // pour stocker les effets
    
    public void addEffet (Effet effet, int nbEffet) {
        for(int i = 0; i<nbEffet; i++) {
            listeffet.add(effet);
        }
    }
    public void afficherEffet(Bandeau bandeau) {
        for(Effet e : listeffet) {
            e.effet(bandeau);
        }
    }
}
