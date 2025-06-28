package solution_exo.examenFinal.formatif1;


import java.util.Scanner;
import java.util.ArrayList;
public class v1Q2 {
    public static void main(String[] args) {
        OutilsGestion gestion = new OutilsGestion();

        gestion.ajouterContact(new Individu("Maxime", "maxime.fournier@cegepmv.ca", (byte)99, "123-456-7899"));
        gestion.ajouterContact(new Individu("Maxime", "maxime.fournier@cegepmv.ca", (byte)99, "123-456-7899"));
        gestion.ajouterContact(new Individu("Alice", "alice.dupont@email.com", (byte)28, "514-123-4567"));
        gestion.ajouterContact(new Entreprise("TechNova", "contact@technova.com", "Technologie", "456 rue des Érables, Montréal"));
        gestion.ajouterContact(new Individu("Jean", "jean.martin@email.ca", (byte)34, "438-765-4321"));
        gestion.ajouterContact(new Entreprise("Boulangerie BelleVie", "info@bellevie.ca", "Alimentation", "123 boul. Saint-Laurent, Québec"));


        gestion.afficherContacts();
        System.out.println("--------------------------------------------\n");

        System.out.println(gestion.getContactByName("Jean"));

        System.out.println("--------------------------------------------\n");

        gestion.retirerContactByName("Boulangerie BelleVie");
        gestion.retirerContactByName("Alice");
        gestion.retirerContactByName("TechNova");
        gestion.retirerContactByName("Harry Potter");

        System.out.println("--------------------------------------------");

        gestion.afficherContacts();


    }
}

class OutilsGestion{
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void afficherContacts(){
        for (Contact contactTMP : contacts) {
            System.out.println(contactTMP);
        }
    }
    public void afficheContactByName(String nom){
        Contact contact = getContactByName(nom);
        if(contact != null){
            System.out.println(contact);
        }
    }
    
    public void retirerContactByName(String nom){
        Contact contact = getContactByName(nom);
        if(contact != null){
            contacts.remove(contact);
            System.out.println("\nRetrait de " + nom + " effectué avec succès\n");

        }
        else{
            System.out.println("\nÉchec du retrait de " + nom + "\n");
        }
    }
    
    public void ajouterContact(Contact contact){
        if(getContactByName(contact.getNom()) != null){
            System.out.println("Échec de l'ajout : Il existe déjà un contact avec ce nom : " + contact.getNom());
            return;
        }
        contacts.add(contact);
    }

    public Contact getContactByName(String name){
        
        for (Contact contact : contacts) {
            if(contact.getNom().toLowerCase().equals(name.toLowerCase())){
                return contact;
            }
        }
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