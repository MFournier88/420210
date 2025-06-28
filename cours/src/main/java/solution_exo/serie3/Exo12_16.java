package solution_exo.serie3;

public class Exo12_16 {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
    
        list.addFirst(5);
        list.addFirst(55);
        list.addFirst(33);
        list.addLast(10);
        list.addLast(20);
        list.printForward();    // Liste → 5 10 20
        list.echange(list.getElementFromStart(4), list.getElementFromStart(0));
        list.printForward();    // Liste → 5 10 20

        // list.printBackward();   // Liste (revers) ← 20 10 5
        System.out.println(list.getElementFromStart(2).data);
        // list.remove(list.getElementFromStart(1));
        list.trier();
        list.printForward();
        System.out.println("Taille: " + list.size()); // Taille: 2

        int[] arr = list.toArray();

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
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
        Node cur = this.head;
        for(int i = 0 ; i < index ; i++){
            cur = cur.next;
        }
        return cur;
    }
    public void remove(Node noeud){
        //Check if has prev and next
        if(noeud.next == null){
            if(noeud.prev != null){
                noeud.prev.next = null;
            }
        }
        else if(noeud.prev == null){
            noeud.next.prev = null;
            this.head = noeud.next;
        }
        else{
            noeud.prev.next = noeud.next;
            noeud.next.prev = noeud.prev;
        }

        this.size--;
    }

    public void echange(Node n1, Node n2){
        
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

    public void trier(){
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
    public int[] toArray(){
        int[] arr = new int[this.size];
        Node cur = this.head;
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = cur.data;
            cur = cur.next;
        }
        return arr;
    }
}

