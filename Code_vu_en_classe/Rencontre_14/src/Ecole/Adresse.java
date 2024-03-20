package Ecole;

public class Adresse {
    private int numRue;
    private String nomRue;
    private String province;

    public Adresse(int numRue, String nomRue, String province) {
        this.numRue = numRue;
        this.nomRue = nomRue;
        this.province = province;
    }

    public Adresse() {
        this(0, "rue ", "QC");
    }

    @Override
    public String toString(){
        return numRue + " " + nomRue + " (" + province + "), CA";
    }
}
