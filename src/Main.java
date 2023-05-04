import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<String, String> krajStolica = new LinkedHashMap<>();
        String key;
        String value;

        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz nazwe kraju oraz stolicy (znak \"/\" przerywa dodawanie do elementow)");

        do {
            key = scan.nextLine();
            value = scan.nextLine();
            krajStolica.put(key, value);
        }
        while (!value.equals("/") || !key.equals("/"));
        System.out.println("Wpisano znak \"/\", zakonczenie dodawania elementow.");
        System.out.println();

        System.out.println("Proszę o wpisanie jednego z wczesniej podanych krajow");

        key = scan.nextLine();
        System.out.println("Kraj: " + " " + key + "\nStolica: " + " " + krajStolica.get(key));
    }
}
