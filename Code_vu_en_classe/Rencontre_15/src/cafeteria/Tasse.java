package cafeteria;

public class Tasse {
    private Liquide l;

    public void ajouterLiquide(Liquide l) {
        this.l = l;
    }

    public void imprimer() {
        l.imprimer();
    }
}