package solution_exo.serie3;

public class Exo5 {
    public static void main(String[] args) {
        additionner(7.0, 7.0);
        additionner(7, 7);
        additionner(7.0, 7);
        additionner(7, 7.0);

    }
    public static void additionner(double a, double b){System.out.println( a + b + 1);}
    public static void additionner(int a, int b){System.out.println( a + b - 1 );}
    public static void additionner(double a, int b){System.out.println( a + b + 4);}
    public static void additionner(int a, double b){System.out.println( a + b - 6);}
}

//     public static void main(String[] args) {
//         Chat[] arrayChats = new Chat[200];
//         Chien[] arrayChiens = new Chien[300];

//         // for(int i = 0 ; i < 200 ; i++){
//         //     arrayChats[i] = new Chat();
//         // }
//         for(int i = 0 ; i < 300 ; i++){
//             arrayChiens[i] = new Chien();

//         }

//         Animal[] arrayAnimaux = new Animal[500];

//         for(int i = 0 ; i < 200 ; i++){
//             arrayAnimaux[i] = new Chat();
//         }
//         for(int i = 200 ; i < 500 ; i++){
//             arrayAnimaux[i] = arrayChiens[i - 200];

//         }
//         int somme = 0;
//         for( Animal ani : arrayAnimaux){
//             ani.parler();
//             somme += ani.getAge();
//         }

//         System.out.println(somme / arrayAnimaux.length);

//     }
// }

// class Animal{
//     protected int age;

//     public Animal(){

//     }
//     public int getAge(){
//         return age;
//     }

//     public void parler(){
//         System.out.println("");
//     }

// }

// class Chien extends Animal{
//     public Chien(){
//         super();
//         this.age = (int)(Math.random() * 11);
//     }
//     @Override
//     public void parler(){
//         System.out.println("Woof");
//     }
// }
// class Chat extends Animal{
//     public Chat(){
//         super();
//         this.age = (int)(Math.random() * 21);
//     }
//     @Override
//     public void parler(){
//         System.out.println("Miaou");
//     }
// }

