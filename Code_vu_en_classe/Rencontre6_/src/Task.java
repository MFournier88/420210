public class Task {
    /**
     * Attributs
     */
    // Attributs de classe (static)

    // Attribut d'instance
    String description;
    Status status = Status.NOT_STARTED;
    int duration;

    // Constructeurs
    // Constructeur sans params
    public Task() {}
    // Constructeurs avec params
    public Task(String description, int duration) {
        // Assignier les valeurs en paramètres aux attributs d'instance
        this.description = description;
        this.duration = duration;
    }
    // Methodes de class (static)

    /**
     * Convert Status to string representing the status
     * @param status
     * @return A string representing the status value
     */
    public static String statusToString(Status status) {
        switch(status) {
            case Status.NOT_STARTED:
                return "not started";
            case Status.IN_PROGRESS:
                return "in progress";
            case Status.DONE:
                return "Done";
            default:
                return "";
        }
    }

    // Methodes d'instance

    /**
     *
     * @return
     */
    public String toString() {
        return description + " " + statusToString(status) + " " + duration + " h";
    }

}
