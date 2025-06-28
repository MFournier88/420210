package solution_exo.serie1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Exo056V1 {

    // Fonction pour calculer le nombre de jours entre deux dates
    public static long calculerJoursEntreDates(String date1, String date2) {
        // Format de la date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        // Convertir les chaînes de caractères en LocalDate
        LocalDate dateDébut = LocalDate.parse(date1, formatter);
        LocalDate dateFin = LocalDate.parse(date2, formatter);
        
        // Calculer le nombre de jours entre les deux dates, exclusives
        return ChronoUnit.DAYS.between(dateDébut, dateFin) - 1;
    }

    public static void main(String[] args) {
        // Exemple 1
        String date1 = "2024-02-04";
        String date2 = "2024-02-06";
        System.out.println("Il y a " + calculerJoursEntreDates(date1, date2) + " jour entre le " + date1 + " et le " + date2 + " (exclusivement)");

        // Exemple 2
        date1 = "2024-02-04";
        date2 = "2024-03-05";
        System.out.println("Il y a " + calculerJoursEntreDates(date1, date2) + " jours entre le " + date1 + " et le " + date2 + " (exclusivement)");
    }
}
