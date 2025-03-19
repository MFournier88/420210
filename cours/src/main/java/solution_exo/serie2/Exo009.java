package solution_exo.serie2;
// Classe Etudiant
// La classe Etudiant doit posséder les éléments suivants :

// Attributs :
// da (de type int) : représente le numéro de dossier de l'étudiant.
// nomComplet (de type String) : représente le nom complet de l'étudiant.
// evaluations (de type Evaluation[]) : un tableau d'objets Evaluation, contenant trois évaluations (deux examens et un examen final) avec leurs pondérations respectives (Examen 1 : 0.2, Examen 2 : 0.3, Examen Final : 0.5).
// Constructeur :
// Un constructeur public qui prend en paramètres da et nomComplet, et initialise les attributs correspondants. Le tableau evaluations est déjà initialisé avec trois évaluations prédéfinies.
// Méthodes :
// noteFinale() : Cette méthode calcule la note finale de l'étudiant en additionnant les notes pondérées de toutes les évaluations. Elle renvoie la somme totale sous forme de byte.
// afficheResultat() : Cette méthode affiche le résultat de l'étudiant, en affichant son numéro de dossier, son nom complet, ainsi que les résultats des évaluations (notes pondérées), suivi de la note finale de l'étudiant.
// Instructions :
// Créez une instance de la classe Etudiant avec un numéro de dossier et un nom complet.
// Définissez les notes obtenues sur 100 pour chaque évaluation (par exemple, 80 pour Examen 1, 90 pour Examen 2, et 75 pour Examen Final).
// Utilisez la méthode afficheResultat() pour afficher les informations complètes (note de chaque évaluation et note finale).
// Vous pouvez également tester la méthode noteFinale() séparément pour obtenir uniquement la note finale de l'étudiant.

public class Exo009 {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant(12345, "Bob");
        etudiant1.evaluations[0].noteSur100 = 50;
        etudiant1.evaluations[1].noteSur100 = 67;
        etudiant1.evaluations[2].noteSur100 = 100;

        etudiant1.afficheResultat();
    }
}

class Etudiant{
    int da;
    String nomComplet;
    Evaluation[] evaluations = {
        new Evaluation("Examen 1", 0.2f),
        new Evaluation("Examen 2", 0.3f),
        new Evaluation("Examen Final", 0.5f)
    };
    public Etudiant(int da, String nomComplet){
        this.da = da;
        this.nomComplet = nomComplet;
    }

    public byte noteFinal(){
        byte noteFinale = 0;
        for(int i = 0 ; i < this.evaluations.length ; i++){
            noteFinale += this.evaluations[i].notePonderee();
        }
        return noteFinale;
    }

    public void afficheResultat(){
        System.out.print(this.da + " " + this.nomComplet + " ");
        for(int i = 0 ; i < this.evaluations.length ; i++){
            System.out.print(this.evaluations[i].notePonderee() + " ");
        }
        System.out.println("| " + this.noteFinal());
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