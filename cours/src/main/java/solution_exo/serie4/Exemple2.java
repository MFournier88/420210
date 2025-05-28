package solution_exo.serie4;
import java.util.Scanner;
import java.util.ArrayList;
public class Exemple2 {
    public static void main(String[] args) {
        OutilsGestion.start();
    }
}

class OutilsGestion{
    
    static final String MENU = String.format( """
            1. Ajouter un contact
            2. Afficher tous les contact
            3. Afficher les infos d'un contact
            4. Retirer un contact
            q. Quitter le programme

            Votre choix : """);
    public static void start(){
        ArrayList<Contact> contacts = new ArrayList<>();
        // contacts.add(new Individu("Maxime", "maxime.fournier@cegepmv.ca", (byte)99, "123-456-7899"));
        // contacts.add(new Individu("Alice", "alice.dupont@email.com", (byte)28, "514-123-4567"));
        // contacts.add(new Entreprise("TechNova", "contact@technova.com", "Technologie", "456 rue des Érables, Montréal"));
        // contacts.add(new Individu("Jean", "jean.martin@email.ca", (byte)34, "438-765-4321"));
        // contacts.add(new Entreprise("TechNova", "contact@technova.com", "Technologie", "456 rue des Érables, Montréal"));
        // contacts.add(new Entreprise("Boulangerie BelleVie", "info@bellevie.ca", "Alimentation", "123 boul. Saint-Laurent, Québec"));

        
        Scanner scan = new Scanner(System.in); 
        String choix;
        String nom;
        Contact contact;
        while(true){
            System.out.print(MENU);
            choix = scan.nextLine();
            switch (choix) {
                case "1":
                    ajouterContact(contacts, scan);
                    break;
                case "2":
                    for (Contact contactTMP : contacts) {
                        System.out.println(contactTMP);
                    }
                    break;
                case "3":
                    nom = lireValeur("Nom du contact à afficher : ", scan).toLowerCase();
                    
                    contact = getContactByName(contacts, nom, scan);
                    if(contact != null){
                        System.out.println(contact);
                    }
                    break;
                case "4":
                
                    nom = lireValeur("Nom du contact à supprimer : ", scan).toLowerCase();
                    
                    contact = getContactByName(contacts, nom, scan);
                    if(contact != null){
                        contacts.remove(contact);
                    }
                    break;
                case "q":
                    System.out.println("\n\nFin du programme\n\n");
                    return;
                    
                default:
                    System.out.println("""
                            Veuillez choisir un choix parmis ceux dans le menu -> 1,2,3,4, q
                            
                            Appuyer sur entrée pour continuer...
                            """);
                    scan.nextLine();
                    break;
            }
        
        }

    }
    public static void ajouterContact(ArrayList<Contact> contacts, Scanner scan){
        String choix;
        String nom;
        String courriel;
        String secteur;
        String adressePostale;
        byte age;
        String tmpAge;
        String numTel;
        while(true){
            choix = lireValeur("Voulez-vous ajouter une entreprise(e) ou un individu(i)?" , scan);
            
            switch (choix) {
                case "e":
                    nom = lireValeur("Entrez le nom : ", scan);
                    courriel = lireValeur("Entrez le courriel : ", scan);
                    secteur = lireValeur("Entrez le secteur d'activité : ", scan);
                    adressePostale = lireValeur("Entrez l'adressePostale : ", scan);
                    contacts.add(new Entreprise(nom, courriel, secteur, adressePostale));
                    return;
                case "i":
                    nom = lireValeur("Entrez le nom : ", scan);
                    courriel = lireValeur("Entrez le courriel : ", scan);
                    while(true){
                        tmpAge = lireValeur("Entrez l'âge' : ", scan);
                        try {
                            age = Byte.valueOf(tmpAge);
                        } catch (Exception e) {
                           System.out.println("Age invalide réessayer");
                           scan.nextLine();
                           continue;
                        }
                        break;
                    }
                    numTel = lireValeur("Entrez le numéro de téléphone : ", scan);
                    contacts.add(new Individu(nom, courriel, age, numTel));
                    return;
                case "q":
                    return;
                default:
                    System.out.println("Entrez soit \"e\" pour entreprise, \"i\" pour individu ou q pour revenir au menu principal ");
                    break;
            }

        }
        
    }

    public static String lireValeur(String msg, Scanner scan){
        System.out.print(msg);
        return scan.nextLine();
    }

    public static Contact getContactByName(ArrayList<Contact> contacts, String name, Scanner scan){
        
        for (Contact contact : contacts) {
            if(contact.getNom().toLowerCase().equals(name)){
                return contact;
            }
        }
       
        System.out.println("Aucun contact avec ce nom");
        return null;
        
        
    }
}
abstract class Contact{
    private String nom;
    private String courriel;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public Contact(String nom, String courriel) {
        this.nom = nom;
        this.courriel = courriel;
    }

    

}
class Individu extends Contact{
    private byte age;
    private String numTel;
    
    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public Individu(String nom, String courriel, byte age, String numTel) {
        super(nom, courriel);
        this.age = age;
        this.numTel = numTel;
    }

    //Format
    @Override
    public String toString() {
        return String.format("""

                Nom : %s
                Age : %d
                Courriel : %s
                Tel. : %s

                """, this.getNom(), this.age, this.getCourriel(), this.numTel);
    }
    
    
    
}
class Entreprise extends Contact{
    private String secteurActivite;
    private String adressePostale;
    public String getSecteurActivite() {
        return secteurActivite;
    }
    public void setSecteurActivite(String secteurActivite) {
        this.secteurActivite = secteurActivite;
    }
    public String getAdressePostale() {
        return adressePostale;
    }
    public void setAdressePostale(String adressePostale) {
        this.adressePostale = adressePostale;
    }
    
    public Entreprise(String nom, String courriel, String secteurActivite, String adressePostale) {
        super(nom, courriel);
        this.secteurActivite = secteurActivite;
        this.adressePostale = adressePostale;
    }
    //Format
     @Override
    public String toString() {
        return String.format("""

                Nom : %s
                Secteur d'activié : %s
                Adresse postale : %s
                Courriel : %s

                """, this.getNom(), this.secteurActivite, this.adressePostale, this.getCourriel());
    }
   
    
}