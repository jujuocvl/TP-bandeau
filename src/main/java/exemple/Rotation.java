package exemple;

import bandeau.Bandeau;

public class Rotation extends Effet{

    public Rotation() {
    }

    public void effet(Bandeau bandeau) {
        bandeau.setRotation(Math.PI / 4.0f);
        bandeau.sleep(2000);
    }
    
}
