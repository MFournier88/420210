package solution_exo.serie4;

import java.util.ArrayList;






/*Chantier */












public class Soccer {
    public static void main(String[] args) {
        String[] nomsEquipes = {
            "Real Madrid", "Manchester City", "Bayern Munich", "Paris SG", "Juventus",
            "Liverpool", "Barcelona", "Chelsea"
        };
    
        ArrayList<Equipe> equipes = new ArrayList<>();
    
        for (String nom : nomsEquipes) {
            ArrayList<Joueur> joueurs = new ArrayList<>();
    
            // Composition équilibrée : 1 gardien, 4 défenseurs, 5 attaquants
            joueurs.add(new GardienDeBut());
    
            for (int i = 0; i < 4; i++) {
                Defenseur d = new Defenseur();
                d.impactPosition = (int)(Math.random() * 4 + 1); // Valeurs entre 1 et 4
                joueurs.add(d);
            }
    
            for (int i = 0; i < 5; i++) {
                Attaquant a = new Attaquant();
                a.impactPosition = (int)(Math.random() * 5 + 1); // Valeurs entre 1 et 5
                joueurs.add(a);
            }
    
            equipes.add(new Equipe(nom, joueurs));
        }
    
        Ligue ligue = new Ligue(equipes);
        ligue.makeCalendar();
        ligue.playSeason();
        ligue.showSeason();
    }
    
}

abstract class Joueur{
    int talent;
    int impactPosition = 1;

    abstract GameDetails getGamePerformance();

    int impactJoueur(){
        return talent * impactPosition;
    }
}

class GameDetails{
    int defense;
    int attaque;
    public GameDetails(int defense, int attaque) {
        this.defense = defense;
        this.attaque = attaque;
    }
    public void addPerformance(GameDetails performance){
        this.defense += performance.defense;
        this.attaque += performance.attaque;
    }
}

class GardienDeBut extends Joueur{
    public GardienDeBut(){
        this.talent = (int) (Math.random() * 51) + 50;
    }
    public GameDetails getGamePerformance(){
        return new GameDetails(impactJoueur(), 0);
    }
}


class Defenseur extends Joueur{
    public Defenseur(){
        this.talent = (int) (Math.random() * 41) + 55;
    }
    public GameDetails getGamePerformance(){
        return new GameDetails((int)(impactJoueur() * 0.7), (int)(impactJoueur() * 0.3));
    }
}
class Attaquant extends Joueur{
    public Attaquant(){
        this.talent = (int) (Math.random() * 71) + 40;
    }
    public GameDetails getGamePerformance(){
        double dailyVariation = Math.random() * 0.6 + 0.7;
        return new GameDetails((int)(impactJoueur() * 0.3 * dailyVariation), (int)(impactJoueur() * 0.7 * dailyVariation));
    }
}

class Equipe {
    String nom;
    ArrayList<Joueur> listeJoueurs;


    public Equipe(String nom, ArrayList<Joueur> listeJoueurs){
        this.nom = nom;
        this.listeJoueurs = listeJoueurs;
    }

    public GameDetails calculStatsPartie(){
        GameDetails avg = new GameDetails(0, 0);

        for(Joueur joueur : listeJoueurs){
            avg.addPerformance(joueur.getGamePerformance());
        }

        avg.attaque /= listeJoueurs.size();
        avg.defense /= listeJoueurs.size();

        return avg;
    }
}
class Ligue {
    ArrayList<Equipe> listeEquipes;
    ArrayList<Partie> calendar = new ArrayList<>();
    public Ligue(ArrayList<Equipe> listeEquipes){
        this.listeEquipes = listeEquipes;
    }

    public void makeCalendar(){
        for(int i = 0; i < listeEquipes.size(); i++){
            for(int j = 0; j < listeEquipes.size(); j++){
                if(i != j){
                    calendar.add(new Partie(listeEquipes.get(i), listeEquipes.get(j)));
                    calendar.add(new Partie(listeEquipes.get(j), listeEquipes.get(i)));
                }
            }
        }
        //would shuffle, but i prefer seeing it like this for now
        
    }

    public void playSeason(){
        for(Partie partie : calendar){
            partie.play();
        }
    }

    public void showSeason(){
        for(Partie partie : calendar){
            System.out.println(partie);
        }
    }


}

class Partie{

    Equipe equipe1;
    Equipe equipe2;
    
    int butE1 = 0;
    int butE2 = 0;

    boolean partieJouer = false;


    public Partie(Equipe equipe1, Equipe equipe2) {
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
    }

    public void play(){
        GameDetails statsE1 = equipe1.calculStatsPartie();
        GameDetails statsE2 = equipe2.calculStatsPartie();
        if(statsE1.attaque > statsE2.defense){
            butE1 = (statsE1.attaque - statsE2.defense) / 6;
        }   
        if(statsE2.attaque > statsE1.defense){
            butE2 = (statsE2.attaque - statsE1.defense) / 6;
        }

        partieJouer = true;
    }
    
    public Equipe getWinner(){
        if(butE1 > butE2){
            return equipe1;
        }
        else if(butE2 >butE1){
            return equipe2;
        }
        else return null;
    }
    // Rouge	\u001B[41m
    // Vert	\u001B[42m
    @Override
    public String toString() {
        if(this.partieJouer){
            if(butE1 > butE2){
                return highLight(String.format("%26s %2d",equipe1.nom, butE1), "green")
                      + String.format(" vs %-2d %26s", butE2, equipe2.nom);
                
            }
            else if(butE2 > butE1){
                return String.format("%26s %-2d vs ", equipe1.nom, butE1) +
                        highLight(String.format("%2d %26s",butE2, equipe2.nom), "green");
                
            }
            else{
                return String.format("%26s %2d vs %-2d %-26s", equipe1.nom, butE1 , butE2, equipe2.nom);
                
            }
        }
        else{
            return String.format("%20s vs %-20s", equipe1.nom, equipe2.nom);
        }
    }
    public String highLight(String msg, String couleur){
        switch (couleur) {
            case "red":
                return "\u001B[41m" + msg + "\u001B[0m";
            case "green":
                return "\u001B[42m" + msg + "\u001B[0m";
            default:
                return msg;
        }
    }
    
}