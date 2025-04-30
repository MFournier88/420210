# SOLUTION -> Examen Formatif

## Partie Théorique (50%)


### Question 1 (7 pts)

<u>Choisissez l'un des noms suivants pour chaque INCONNU:</u>

addLast  addFirst    printForward    printBackward    getElementFromStart    remove    echange    trier   toArray


INCONNU_1:addFirst     INCONNU_2: getElementFromStart   INCONNU_3: printForward   INCONNU_4: addLast    INCONNU_5:  trier   INCONNU_6: echange     INCONNU_7:   toArray 
```java
class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
// Classe de la liste doublement chaînée
class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;


    public void INCONNU_1(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public Node INCONNU_2(int index){
        Node cur = this.head;
        for(int i = 0 ; i < index ; i++){
            cur = cur.next;
        }
        return cur;
    }
   


    public void INCONNU_3() {
        Node current = head;
        System.out.print("Liste → ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Obtenir la taille
    public int size() {
        return size;
    }



    public void INCONNU_4(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void INCONNU_5(){
        Node cur = head;
        Node min = head;
        Node test;
        while(cur != null){
            
            min = cur;
            test = min.next;
            while(test != null){
                if(test.data < min.data){
                    min = test;
                }
                test = test.next;
            }
            if(min != cur){
                this.echange(min, cur);
            }
            if(min != null){
                cur = min.next;
            }
           
        }
    }
    public void INCONNU_6(Node n1, Node n2){

        if(n1 == this.head){
            this.head = n2;
        }
        else if(n2 == this.head){
            this.head = n1;
        }

        if(n1 == this.tail){
            this.tail = n2;
        }
        else if(n2 == this.tail){
            this.tail = n1;
        }
        if(n1.next == n2){
            n1.next = n2.next;
            n2.next = n1;
            n2.prev = n1.prev;
            n1.prev = n2;
        }
        else if(n2.next == n1){
            n2.next = n1.next;
            n1.next = n2;
            n1.prev = n2.prev;
            n2.prev = n1;
        }
        else{
            
            Node tmpPrev = n1.prev;
            Node tmpNext = n1.next;
            
            n1.prev = n2.prev;
            n1.next = n2.next;
            
            n2.prev = tmpPrev;
            n2.next = tmpNext;
            
            
        }
        if(n1.prev != null){
            n1.prev.next = n1;
        }
        if(n1.next != null){
            n1.next.prev = n1;
        }
        
        if(n2.prev != null){
            n2.prev.next = n2;
        }
        if(n2.next != null){
            n2.next.prev = n2;
        }
    }
    public int[] INCONNU_7(){
        int[] arr = new int[this.size];
        Node cur = this.head;
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = cur.data;
            cur = cur.next;
        }
        return arr;
    }
}


```

### Question 2 (5 pts)
<u>Quel est <strong>EXACTEMENT<strong> la sortie de ce programme (Il n'y a pas d'erreur) :</u>

```java
public class Exo9 {

    public static void main(String[] args) {
       
        Etudiant etudiant = new Etudiant("Marie", 22, "15 rue de la Paix", "Informatique", "E123");
        Professeur professeur = new Professeur("Mr. Dupont", 45, "12 avenue des Champs", "Mathématiques", 2500.00);
    
        Personne[] personnes = {
            etudiant,
            professeur
        };
        

        personnes[1].seDecrire();
    }
}
abstract class Personne{
    protected String nom;
    protected int age;
    protected String adresse;

    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNom(){
        return this.nom;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    public String getAdresse(){
        return this.adresse;
    }
    public Personne(String nom, int age, String adresse){
        this.setNom(nom);
        this.setAge(age);
        this.setAdresse(adresse);
    }


    public void seDecrire(){
        System.out.println("Étudier c'est la recette du succès.");
    }

    public void sePresenter(){
        System.out.println("Je suis " + this.nom + ", j'ai " + this.age + " ans et mon adresse est " + this.adresse);
    }
}
class Etudiant extends Personne{
    protected String filiere;
    protected String numEtudiant;

    public void setFiliere(String filiere){
        this.filiere = filiere;
    }
    public String getFiliere(){
        return this.filiere;
    }

    public void setNumEtudiant(String numEtudiant){
        this.numEtudiant = numEtudiant;
    }
    public String getNumEtudiant(){
        return this.numEtudiant;
    }
    public Etudiant(String nom, int age, String adresse, String filiere, String numEtudiant){
        super(nom, age, adresse);
        this.setFiliere(filiere);
        this.setNumEtudiant(numEtudiant);

    }

    public void etudier(){
        System.out.printf("L'étudiant %s étudie %s\n",this.nom, this.filiere);
    }
    @Override
    public void seDecrire(){
        super.sePresenter();
        System.out.printf("Je suis en filière %s, Numéro étudiant: %s\n", this.filiere, this.numEtudiant);
    }
}
class Professeur extends Personne{
    protected String matiere;
    protected double salaire;

    public void setMatiere(String matiere){
        this.matiere = matiere;
    }
    public String getMatiere(){
        return this.matiere;
    }
    public void setSalaire(double salaire){
        this.salaire = salaire;
    }
    public double getSalaire(){
        return this.salaire;
    }
    public Professeur(String nom, int age, String adresse, String matiere, double salaire){
        super(nom, age, adresse);
        this.setMatiere(matiere);
        this.setSalaire(salaire);
    }
    public void enseigner(){
        System.out.printf("L'enseignant %s enseigne %s\n",this.nom, this.matiere);
    }
    @Override
    public void seDecrire(){
        super.sePresenter();
        System.out.printf("J'enseigne la matière %s, salaire: %.02f€\n", this.matiere, this.salaire);
    }
}
```

Réponse :

```
Je suis Mr. Dupont, j'ai 45 ans et mon adresse est 12 avenue des Champs
J'enseigne la matière Mathématiques, salaire: 2500.00€
```

### Question 3 (6 pts)

<u>Mets toutes les bonnes réponses parmi ces choix :</u>
```
Classe, Classe abstraite, Interface, aucune de ces réponses, toutes ces réponses 
```

Je ne peux pas contenir de méthode abstraite : <u>Classe</u>

Je ne peux pas "extends" une autre entité : <u>aucune de ces réponses</u>

Je peux être plusieurs "Parent" pour le même enfant : <u>Interface</u>

Je ne peux pas être instancié : <u>Classe abstraite et l'interface</u>

J'utilise le mot-clé "implements" pour être utilisé : <u>Interface</u>

Je peux avoir des attributs et des constructeurs : <u>Classe et Classe abstraite</u>

### Question 4 (12 pts)

<u>Identifie les erreurs dans ce code et explique la solution. Il y a exactement 7 erreurs, mais vous devez en identifier 6 pour avoir 12 pts.</u>


```java
//----Pas d'erreur ici tu ne peux pas le modifier----------------------
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
public class Exo6 {
    public static void main(String[] args) {
        ArrayList<Forme> liste = new ArrayList<>();
        liste.add(new Cercle(new HashMap<Dimensions, Double>() {{ put(Dimensions.RAYON, 4.5);}}));
        liste.add(new Triangle(new HashMap<Dimensions, Double>() {{ put(Dimensions.BASE, 4.0);put(Dimensions.HAUTEUR, 5.0);}}));
        liste.add(new Rectangle(new HashMap<Dimensions, Double>() {{ put(Dimensions.BASE, 4.0);put(Dimensions.HAUTEUR, 5.0);}}));
        liste.add(new Cercle(new HashMap<Dimensions, Double>() {{ put(Dimensions.RAYON, 8.0);}}));

        afficherAire(liste);

        System.out.println();

        Collections.sort(liste, (forme1, forme2) -> Double.compare(forme1.getArea(), forme2.getArea()));
        
        afficherAire(liste);
    }
    public static void afficherAire(ArrayList<Forme> liste){
        for( Forme forme : liste){
            System.out.println(forme.getArea());
        }
    }
    //----------------------------------------
}


interface Dimensions { 
    BASE,
    HAUTEUR,
    RAYON
}
class Forme { 

    HashMap<Dimensions, Double> dimensions = new HashMap<>();


    public HashMap<Dimensions, Double> getDimensions() {
        return dimensions;
    }

    public void setDimensions(HashMap<Dimensions, Double> dimensions) {
        this.setDimensions(dimensions);
    }

    public Forme(HashMap<Dimensions, Double> dimensions) {
        this.setDimensions(dimensions);
    }

    abstract double getArea();
}

class Triangle { 
    public Triangle(HashMap<Dimensions, Double> dimensions){
        super(dimensions);
    }

    @Override
    public double getArea(){
        return (getDimensions().get(Dimensions.BASE) * getDimensions().get(Dimensions.HAUTEUR)) / 2;
    }
}



class Cercle implements Forme{ 
    public Cercle(HashMap<Dimensions, Double> dimensions){

    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(getDimensions().get(Dimensions.RAYON),2);
    }
}
```

1. Ceci n'est pas une interface, mais une enum
```java
interface Dimensions { 
    BASE,
    HAUTEUR,
    RAYON
}
```

```java
enum Dimensions { 
    BASE,
    HAUTEUR,
    RAYON
}
```

2. La classe Forme devrait être abstraite, puisqu'elle a une méthode abstraite.

3. La classe Triangle devrait extends la classe Forme, puisque l'on ajoute la classe Triangle à un ArrayList de Forme. 

4.  La classe Cercle devrait extends la classe Forme plutôt que l'implémenter, car la classe Frome est une classe abstraite et non une interface.

5. Cercle devrait gérer le constructeur de la classe Parent.

6. La classe Rectangle devrait être créé.

7. 
```java
public void setDimensions(HashMap<Dimensions, Double> dimensions) {
    this.setDimensions(dimensions);
} 
```

```java
public void setDimensions(HashMap<Dimensions, Double> dimensions) {
    this.dimensions = dimensions;
} 
```



## Fait la représentation graphique de ce code (15 pts)

```java
abstract class Article{
    String nom;
    float prix;
    boolean enStock;
    public Article(String nom, float prix, boolean enStock){
        this.nom = nom;
        this.prix = prix;
        this.enStock = enStock;
    }

    abstract void imprimerEtiquette();

    abstract void imprimerEtiquette(float rabais);

    public float calculPrixEnGroupe(int nb){
        return prix * nb;
    }
    public float calculPrixEnGroupe(int nb, float rabaisDeGroupe){
        return prix * nb * (1- rabaisDeGroupe);
    }
}

class Jeu extends Article{
    public Jeu(String nom, float prix, boolean enStock){
        super(nom, prix, enStock);
    }
    public void imprimerEtiquette() {
        System.out.println("Jeu: " + nom + ", Prix: " + prix + "€" + (enStock ? " (En stock)" : " (Rupture)"));
    }

    public void imprimerEtiquette(float rabais) {
        float prixAvecRabais = prix * (1 - rabais);
        System.out.println("Jeu: " + nom + ", Prix après rabais: " + prixAvecRabais + "€" + (enStock ? " (En stock)" : " (Rupture)"));
    }


    public float calculPrixEnGroupe(int nb, float rabaisDeGroupe, float rabaisPromotionnel){
        return prix * nb * (1 - rabaisDeGroupe) * (1 - rabaisPromotionnel);
    }
}
```
![alt text](image-10.png)
## Indique ici quelles méthodes sont des surcharges et quelles méthodes sont des redéfinitions.

 J'ai retiré les annotations! Indiquez le nom de la classe devant la méthode.


Indice :  Il y a trop de lignes

---

| Méthode dans `Jeu`                                                                 | Méthode dans `Article`                                               | Redéfinition (Override) | Surcharge (Overload) |
|------------------------------------------------------------------------------------|----------------------------------------------------------------------|--------------------------|------------------------|
| `+ imprimerEtiquette() : void`                                                    | `<<abstract>> + imprimerEtiquette() : void`                          | ✅ Oui                   | ❌ Non                 |
| `+ imprimerEtiquette(rabais : float) : void`                                      | `<<abstract>> + imprimerEtiquette(rabais : float) : void`           | ✅ Oui                   | ❌ Non                 |
| `+ calculPrixEnGroupe(nb : int, rabaisDeGroupe : float, rabaisPromotionnel float) : float` | `+ calculPrixEnGroupe(nb : int) : float` <br> `+ calculPrixEnGroupe(nb : int, rabaisDeGroupe : float) : float` | ❌ Non                  | ✅ Oui                 |



# Partie pratique

# Q1 (40 pts)
Faites l'exo 10
ou
Faites l'exo 7

ATTENTION : Je vais ajouter des petites surprises à l'examen pour que ce ne soit pas du copier-collé. Lisez bien les questions!

# Q2 (10 pts)

Ajouter une méthode pour ajouter un noeud à l'index passée en paramètre.

```java
class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
// Classe de la liste doublement chaînée
public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    // Ajouter à la fin
    public void addLast(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Ajouter au début
    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

   

    // Affichage de la liste (vers l'avant)
    public void printForward() {
        Node current = head;
        System.out.print("Liste → ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Affichage de la liste (vers l'arrière)
    public void printBackward() {
        Node current = tail;
        System.out.print("Liste (revers) ← ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    // Obtenir la taille
    public int size() {
        return size;
    }

    //Remplisser cette méthode
    public void addAtIndex(Node noeud, int index){
        if(index == 0){
            addFirst(noeud.data);
            return;
        }
        else if(index == this.size()){
            addLast(noeud.data);
            return;
        }
        //Pas obligatoire, mais stylé----
        else if(index > size()){
            System.out.println("Erreur, la taille est trop grande");
            return;
        }
        //----

        Node cur = this.head;
        for(int i = 0 ; i < index; i++){
            cur = cur.next;
        }

        //J'insère le noeud
        noeud.prev = cur.prev;
        noeud.next = cur;

        //J'avise mes voisins
        noeud.prev.next = noeud;
        cur.prev = noeud;

        //Augmente la taille de la liste
        size++;
    }


    // Test de la liste
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addFirst(5);
        list.printForward();    // Liste → 5 10 20
        list.printBackward();   // Liste (revers) ← 20 10 5

        list.addAtIndex(new Node(88),1);
        list.addAtIndex(new Node(8),0);
        list.printForward();    // Liste → 8 5 88 10 20
        list.printBackward();    // Liste (revers) ← 20 10 88 5 8

        System.out.println("Taille: " + list.size()); // Taille: 5
    }
}

```
