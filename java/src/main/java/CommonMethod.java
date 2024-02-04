import java.util.List;

public class CommonMethod {
        /* creation d'une mehtode commune qui filtre les élments égaux
      d'une liste et nous retourne la somme de ces éléménts filtrés.*/

    public static int filterAndSum(int filterValue, List<Integer> numbers) {
        return numbers.stream()
            .filter(nombre -> nombre == filterValue)
            .mapToInt(value -> value)
            .sum();
    }
}
