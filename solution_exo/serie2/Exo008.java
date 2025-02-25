// Classe Evaluation
// La classe Evaluation doit posséder les éléments suivants :

// Attributs :
// nom (de type String) : représente le nom de l'évaluation.
// ponderation (de type float) : représente la pondération de l'évaluation.
// noteSur100 (de type byte) : représente la note obtenue sur 100 (initialisée à 0 par défaut).
// Constructeur :
// Un constructeur public qui prend en paramètres nom et ponderation, et initialise les attributs correspondants. Le paramètre noteSur100 doit être laissé à sa valeur par défaut (0).
// Méthodes :
// notePonderee() : Cette méthode calcule et renvoie la note pondérée de l'évaluation. La note pondérée se calcule en multipliant la noteSur100 par la pondération et en renvoyant le résultat sous forme d'un byte (arrondi au besoin).
// afficherEvaluation() : Cette méthode affiche les informations de l'évaluation, c'est-à-dire son nom, sa pondération et la note pondérée (en utilisant la méthode notePonderee()).
// Instructions :
// Créez une instance de la classe Evaluation avec un nom, une pondération et une note sur 100.
// Utilisez la méthode afficherEvaluation() pour afficher les informations.
// Changez la note sur 100 et recalculer la note pondérée.


public class Exo008 {
    public static void main(String[] args) {
        Evaluation eval1 = new Evaluation("Examen 1", 0.3f);
        eval1.noteSur100 = 50;
        eval1.afficheEvaluation();
        eval1.noteSur100 = 75;
        eval1.afficheEvaluation();
    }
}
class Evaluation{
    String nom;
    float ponderation;
    byte noteSur100;

    public Evaluation(String nom,float ponderation){
        this.nom = nom;
        this.ponderation = ponderation;
    }

    public byte notePonderee(){
        return (byte) (this.noteSur100 * this.ponderation);
    }
    public void afficheEvaluation(){
        System.out.println(this.nom + " " + this.ponderation + " " + this.notePonderee());
    }
}