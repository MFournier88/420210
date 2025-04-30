package solution_exo.serie3;


// Classe représentant un nœud de la liste
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

    // Test de la liste
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addFirst(5);
        list.printForward();    // Liste → 5 10 20
        list.echange(list.getElementFromStart(0), list.getElementFromStart(2));
        list.printBackward();   // Liste (revers) ← 20 10 5


        System.out.println("Taille: " + list.size()); // Taille: 2
    }

    public Node getElementFromStart(int index){
        if(index >= size){
            throw new IndexOutOfBoundsException();
        }

        Node cur = head;
        for(int i = 0; i < index ; i++ ){
            cur = cur.next;
        }
        return cur;
    }

    public void remove(Node noeud){
        if(noeud == head){
            noeud.next.prev = null;
            head = noeud.next;
        }
        else if (noeud == tail){
            noeud.prev.next = null;
            tail = noeud.prev;
        }
        else{
            noeud.prev.next = noeud.next;
            noeud.next.prev = noeud.prev;
        }
        noeud = null;
    }

    public void echange(Node n1, Node n2){
        if(n1 == head){
            head = n2;
        }
        else if(n2 == head){
            head = n1;
        }
    
        if (n1 == tail){
            tail = n2;
        }
        else if (n2 == tail){
            tail = n1;
        }
        
        if(n1.next == n2 ){
            n1.next = n2.next;
            n1.prev = n2;
            n2.next = n1;
            n2.prev = n1.prev;
        }
        else if(n1.prev == n2){
            n2.next = n1.next;
            n2.prev = n1;
            n1.next = n2;
            n1.prev = n2.prev;
        }
        else{
            Node next = n1.next;
            Node prev = n1.prev;

            n1.next = n2.next;
            n1.prev = n2.prev;

            n2.next = next;
            n2.prev = prev;
        }

        n1.prev.next = n1;
    }

}
