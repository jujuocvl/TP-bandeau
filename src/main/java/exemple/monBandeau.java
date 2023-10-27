package exemple;

import bandeau.Bandeau;

public class monBandeau {
    public static void main(String[]args) {
        Bandeau bandeau = new Bandeau();
        Rotation rotation = new Rotation();
        Zoom zoom = new Zoom();
        FondCouleur fondcouleur = new FondCouleur();

        rotation.effet(bandeau);
        zoom.effet(bandeau);
        fondcouleur.effet(bandeau);

        Scenario scene = new Scenario();
        scene.addEffet(zoom, 2);
        scene.addEffet(fondcouleur, 3);
        scene.afficherEffet(bandeau);
        bandeau.close();
    }
    
}
