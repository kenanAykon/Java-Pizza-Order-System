import java.util.ArrayList;
import java.util.Arrays;

public class HazirPizzalar {
    public static ArrayList<Pizza> getHazirPizzaListesi() {
        ArrayList<Pizza> pizzalar = new ArrayList<>();

        pizzalar.add(new Pizza(
                "Extravaganza",
                new ArrayList<>(Arrays.asList("Sucuk", "Mantar", "Zeytin", "Peynir")),
                85.0
        ));

        pizzalar.add(new Pizza(
                "Italiano",
                new ArrayList<>(Arrays.asList("Mozzarella", "Domates", "Feslegen")),
                75.0
        ));

        pizzalar.add(new Pizza(
                "Turkish Pizza",
                new ArrayList<>(Arrays.asList("Sucuk", "Pastirma", "Yesil Biber")),
                90.0
        ));

        return pizzalar;
    }
}

