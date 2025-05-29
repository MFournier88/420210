package solution_exo.examenFinal.video.src.main.java.formatif1.question2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Contact maxime = new Individu("Maxime","maxime.fournier@cegepmv.ca", 99,"123-456-7899");
        Contact alice = new Individu("Alice", "alice.dupont@email.com", 28, "514-123-4567");
        Contact jean = new Individu("Jean", "jean.martin@email.ca", 34, "438-765-4321");
        Contact techNova = new Entreprise("TechNova", "contact@technova.com","Technologie", "456 rue des Érables, Montréal");
        Contact boulangerie  = new Entreprise("Boulangerie BelleVie", "info@bellevie.ca", "Alimentation", "123 boul. Saint-Laurent, Québec");
        

        OutilGestion outil = new OutilGestion();

        outil.ajouterContact(maxime);
        outil.ajouterContact(alice);
        outil.ajouterContact(techNova);
        outil.ajouterContact(jean);
        outil.ajouterContact(boulangerie);

        System.out.println("--------------------- Liste de contacts ---------------------\n\n");

        outil.affichageContact();

        System.out.println("--------------\n\n");
        System.out.println("--------- Recherche du contact nommé Jean ---------\n\n");

        System.out.println(outil.rechercherContactParNom("Jean"));

        System.out.println("\n--------------\n\n");

        outil.retirerContactParNom("Boulangerie BelleVie");
        outil.retirerContactParNom("Alice");
        outil.retirerContactParNom("TechNova");
        outil.retirerContactParNom("Harry Potter");
        System.out.println("\n--------------------- Liste de contacts ---------------------\n\n\n");

        outil.affichageContact();

        System.out.println("--------------\n\n");

    }

}


abstract class Contact{
    private String nom;
    private String adresseElectronique;
    public Contact(String nom, String adresseElectronique) {
        this.nom = nom;
        this.adresseElectronique = adresseElectronique;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getAdresseElectronique() {
        return adresseElectronique;
    }
    public void setAdresseElectronique(String adresseElectronique) {
        this.adresseElectronique = adresseElectronique;
    }
    
}

class Individu extends Contact{
    private int age;
    private String numTel;
    public Individu(String nom, String adresseElectronique, int age, String numTel) {
        super(nom, adresseElectronique);
        this.age = age;
        this.numTel = numTel;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getNumTel() {
        return numTel;
    }
    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }
    @Override
    public String toString() {
        return String.format("""
                Nom : %s
                Age : %d
                Courriel : %s
                Tel. : %s
                """, this.getNom(), this.getAge(), this.getAdresseElectronique(), this.getNumTel());
    }

    
}

class Entreprise extends Contact{
    private String secteurActivite;
    private String adressePostale;
    public Entreprise(String nom, String adresseElectronique, String secteurActivite, String adressePostale) {
        super(nom, adresseElectronique);
        this.secteurActivite = secteurActivite;
        this.adressePostale = adressePostale;
    }
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
    @Override
    public String toString() {
        return String.format("""
                Nom : %s
                Secteur d'activité : %s
                AdressePostale : %s
                Courriel. : %s
                """, this.getNom(), this.getSecteurActivite(), this.getAdressePostale(), this.getAdresseElectronique());
    }

    
}

class OutilGestion{
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void ajouterContact(Contact contact){
        
        if(rechercherContactParNom(contact.getNom()) == null){
            contacts.add(contact);
        }
        else{
            System.out.println("Échec de l'ajout, car le nom est déjà utilisé");
        }
    }
    public void affichageContact(){
        for (Contact contact : contacts) {
            System.out.println("\n" + contact + "\n" );
        }
    }

    public Contact rechercherContactParNom(String nom){
        for (Contact cur : contacts) {
            if(cur.getNom().equals(nom)){
                return cur;
            }
        }

        return null;
    }
    public void retirerContactParNom(String nom){
        Contact contact = rechercherContactParNom(nom);
        if( contact == null){
            System.out.println("Échec du retrait de " + nom);
        }
        else{
            
            contacts.remove(contact);
            System.out.println("Retrait de " + contact.getNom() + " effectué avec succès.\n\n");
        }
    }
}
