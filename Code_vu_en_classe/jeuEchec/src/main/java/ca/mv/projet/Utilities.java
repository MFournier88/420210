package ca.mv.projet;

public class Utilities {
    public static final double TAILLE_TUILE = 70;
    public static final double TAILLE_GRID_PANE = 560;
    public static final double SCENE_WIDTH = 1000;
    public static final double SCENE_HIEGHT = 800;
    public static final int NB_CASES_COTE = 8;
    public static final int DERNIERE_POS = NB_CASES_COTE - 1;
    public static final int PREMIERE_POS = 0;

    public static int convertirPixelEnPos(double pixels){
        // TODO : à tester
        return (int) ((int)(pixels + TAILLE_TUILE / 2) / TAILLE_TUILE);
    }
}
