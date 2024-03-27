package PreExam1.R2;

public class Rencontre2 {

    public static void afficheResult() {
        //                        COURS 1.1
        System.out.println("#################                      Types primitifs                   ###################");
        System.out.println("\n");

        // Créer et afficher les variables avec le meilleur type possible
        // Variable contenant l'age d'une personne
        byte age = 44;

        // Population du cégep Marie-Victorin
        short populationMV = 3_000;

        // Variable comptant la population au Qc
        int populationQc = 8_000_000;

        // Variable pour calculer le revenu d'un individu
        float revenu = 123_456.78F;

        // Nombre de gouttes d'eau dans une piscine.
        long nbGoutte = 10_000_000_000L;

        // Revenu d'Elon Musk
        double revenuElonMusk = 10_000_000_000D;

        // Une variable qui se rappelle si le prof était bon ou pas
        boolean profEstBon = true;

        // Note en lettre que vous voulez à ce cours
        char note = 'D'; // D pour diplôme :)



        System.out.println("\n#########################################################################################");

        //                        COURS 1.2
        System.out.println("\n#################                      OPÉRATEURS                      ###################");
        System.out.println("#### Arithmétique ####");
        int i = 9;
        // Additionne 50 et 34
        System.out.println(50 + 34);

        // Soustrait 50 à 34
        System.out.println(50 - 34);

        // Mutiplie 4 par 80
        System.out.println(4 * 80);

        // Divise 80 par 4
        System.out.println(80 / 4);

        // 50 modulo 3
        System.out.println(50 % 3);

        // Ajoute 1 à la variable i
        System.out.println(++i);

        // Retire 1 à la variable i
        System.out.println(--i);

        System.out.println("#### Opérateurs d'assignation ####");
        int demo = 0;
        // Assigne 8 à demo
        demo = 8;

        // Augmente la valeur de  demo de 100
        demo += 100;

        // Reduit la valeur de demo de 46
        demo -= 46;

        // Multiplie la valeur actuel de demo par 5
        demo *=5;

        // Divise la valeur actuel de demo par 2
        demo /= 2;

        // Assigne à demo le modulo par 4 de sa valeur actuelle
        demo %= 4;

        System.out.println("#### Opérateurs comparaison et logique ####");
        boolean verif;
        // Enregistre dans une variable si 44 est égal à 66
        verif = 44 == 66;

        // Enregistre dans une variable si 44 n'est pas égal a 66
        verif = 44 != 66;

        // Enregistre dans une variable si 44 est plus grand que 66
        verif = 44 > 66;

        // Enregistre dans une variable si 44 est plus petit ou égal à 66
        verif = !verif;

        boolean isHealthy = true;
        boolean isCheap = false;


        // Enregistre dans une variable si les variables isHealthy et isCheap sont toutes les 2 vraies
        verif = isHealthy && isCheap;

        // Enregistre dans une variable si les variables isHealthy est fausse et isCheap est vrai
        verif = !isHealthy && isCheap;


        // Enregistrer dans une varible si isHealthy ou isCheap est vrai
        verif = isHealthy || isCheap;

        //                        COURS 1.3
        System.out.println("#### STRINGS ####");
        // Enregistre l'alphabet en minuscule dans une variable
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        // Affiche la longeur de la varibale alphabet
        System.out.println(alphabet.length());

        // Affiche l'alphabet en majuscule
        System.out.println(alphabet.toUpperCase());


        // Trouve la position du f dans l'alphabet
        System.out.println(alphabet.indexOf('f') + 1);


        // Créez deux variables nommées prénom et nom. Assignez-leur vos propres renseignements.
        // Afficher prenom nom de tel sort que pour moi, il s'afficherait Maxime Fournier
        String prenom = "Maxime";
        String nom = "Fournier";

        // Écrire ceci avec un seul System.out.println:
        // L'apostrophe peut briser le code.
        // Les guillemets "Sont dangereux".
        System.out.println(prenom + " " + nom);

        System.out.println("\n#### Contrôle ####");

        // Créez les varibales int1, int2 et int3 contenant 3 entiers
        // Sans supposé que vous savez la valeur de ces entiers, sauvegarder la valeur du plus grand des nombres dans une variable nommée plusGrand
        int int1 = 345;
        int int2 = 2323;
        int int3 = 3;

        int plusGrand = Integer.MIN_VALUE;

        if(int1 > plusGrand){
            plusGrand = int1;
        }
        if(int2 > plusGrand){
            plusGrand = int2;
        }
        if(int3 > plusGrand){
            plusGrand = int3;
        }
        System.out.println("Le plus grand est : " + plusGrand);





        // Si le plus gros était int1 afficher : Le plus gros est int1
        // Si le plus gros était int2 afficher : Le plus gros est int2
        // Si le plus gros était int3 afficher : Le plus gros est int3
        // N'utilisez pas plus de 1 if toujours en supposant ne pas savoir lequel est le plus gros, mais vous pouvez utiliser plusGrand

        if(int1 == plusGrand){
            System.out.println("Le plus gros est int1");
        }
        else if(int2 == plusGrand){
            System.out.println("Le plus gros est int2");
        }
        else if(int3 == plusGrand){
            System.out.println("Le plus gros est int3");
        }
        // Même chose que le dernier exercice, mais sans if cette fois.(switch)

        switch(plusGrand){
            case 345:
                System.out.println("Le plus gros est le int1");
                break;
            case 2323:
                System.out.println("Le plus gros est le int2");
                break;
            case 3:
                System.out.println("Le plus gros est le int3");
        }




        // Si age plus grand ou égal à 18 retourne majeur, sinon mineur sans if ni switch

        System.out.println((age >= 18) ? "Majeur" : "Mineur");

        /*
        *
        *
        *
        *
        *               EXERCICES 2
        *
        *
        *
        *
        * */

        String mot1 = "toto";
        String mot2 = "ToTo";

        //Comparez de 2 Strings. Par exemple la comparaison de « Toto » et « TOTO ». Doit vérifier si les 2 strings sont identique sans tenir compte de la casse.
        System.out.println("Est-ce que les deux sont égaux : " + mot1.equalsIgnoreCase(mot2));

        //Convertir un type primitif « int » en un objet « String »
        String ageStr = String.valueOf(124);

        //Convertir un objet « Integer » en un objet « String »
        Integer a = Integer.valueOf(44);
        String ageStr2 = String.valueOf(a);


        System.out.println(ageStr + " " + ageStr2);

        //Convertir un objet « String » en un objet « Integer »
        Integer ageInteger = Integer.valueOf(ageStr);


        //...

    }
}
