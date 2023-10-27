package exemple;

import bandeau.Bandeau;
import java.awt.*;

public class FondCouleur extends Effet{

    public FondCouleur() {
    }

    public void effet(Bandeau bandeau) {
        Font font = bandeau.getFont();
        Color back = bandeau.getBackground();
        Color fore = bandeau.getForeground();

        bandeau.setMessage("On va changer de couleur de fond");
        bandeau.sleep(1000);
        bandeau.setBackground(Color.DARK_GRAY);
        bandeau.setMessage("On va changer de couleur");
        bandeau.sleep(1000);
        bandeau.setForeground(Color.YELLOW);
        bandeau.sleep(1000);
        bandeau.setFont(font);
        bandeau.setForeground(fore);
        bandeau.setBackground(back);
        bandeau.setMessage("Terminé");
        bandeau.sleep(3000);
        bandeau.close();}
    }





