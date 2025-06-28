package question2;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addFirst(5);
        list.printForward();    // Liste → 5 10 20
        list.printBackward();   // Liste (revers) ← 20 10 5


        list.addAfter(new Node(88),list.getElementFromStart(1));
        list.printForward();    // Liste → 5 10 88 20
        list.printBackward();   // Liste (revers) ← 20 88 10 5


        list.addAfter(new Node(8),list.getElementFromStart(3));
        list.printForward();    // Liste → 5 10 88 20 8
        list.printBackward();    // Liste (revers) ← 8 20 88 10 5


        System.out.println("Taille: " + list.size()); // Taille: 5
    }
}

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

    public Node getElementFromStart(int index){
        if(index < 0 || index > this.size){
            System.out.println("Erreur");
            return null;
        }
        Node cur = this.head;
        for(int i = 0 ; i < index ; i++){
            cur = cur.next;
        }
        return cur;
    }



    //Remplisser cette méthode
    //Ajouter une méthode pour ajouter un noeud après un autre noeud passée en paramètre.
    public void addAfter(Node nouveau, Node vieux){

        //1
        if(vieux == tail){
            //1
            tail = nouveau;
        }
 

        //1
        nouveau.next = vieux.next;

        //1
        nouveau.prev = vieux;

        //1
        vieux.next = nouveau;

        //2
        if(tail != nouveau){
            //1
            nouveau.next.prev = nouveau;
        }

        //2
        size++;
    }

   
}

