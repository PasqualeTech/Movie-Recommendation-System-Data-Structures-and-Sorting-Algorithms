import java.util.*;

public class MovieRecommendationApp {
    public static void main(String[] args) {
        // Database dei film raggruppati per genere
        Map<String, List<String>> movieDatabase = new HashMap<>();

        movieDatabase.put("Azione", Arrays.asList("Mad Max", "John Wick", "Inception"));
        movieDatabase.put("Commedia", Arrays.asList("Una notte da leoni", "The Mask", "Quasi Amici"));
        movieDatabase.put("Drammatico", Arrays.asList("Forrest Gump", "Il Gladiatore", "The Whale"));

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== MOVIE RECOMMENDATION SYSTEM ===");
        System.out.println("Generi disponibili: Azione, Commedia, Drammatico");
        System.out.print("Quale genere preferisci oggi? ");
        String choice = sc.nextLine();

        // Logica di raccomandazione
        if (movieDatabase.containsKey(choice)) {
            List<String> movies = movieDatabase.get(choice);
            String recommendation = movies.get(random.nextInt(movies.size()));
            
            System.out.println("\n--- Suggerimento per te ---");
            System.out.println("Ti consigliamo di vedere: " + recommendation);
            System.out.println("Speriamo ti piaccia!");
        } else {
            System.out.println("Spiacente, genere non trovato nel nostro database.");
        }

        sc.close();
    }
}
