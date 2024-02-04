import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class CommonMethod {
        /* creation d'une mehtode commune qui filtre les élments égaux
      d'une liste et nous retourne la somme de ces éléménts filtrés.*/

    public static int filterAndSum(int filterValue, List<Integer> numbers) {
        return numbers.stream()
            .filter(nombre -> nombre == filterValue)
            .mapToInt(value -> value)
            .sum();
    }

     /*Création de la méthode  commune permettant de
       filtrer, sommer et doubler le résultat */

    public static int filteredValuesSumAndDouble(int[] counts, int maxSize, int counter) {
        return (IntStream.range(0, 6)
            .filter(index -> counts[index] >= 2)
            .boxed()
            .sorted(Comparator.reverseOrder())
            .limit(maxSize)
            .reduce(Math::addExact)
            .orElse(-1) + counter) * 2;
    }

    /*Création de la méthode  commune permettant de
    rechercher dans un tableau les valeur supérieur à value et effectuer le traitement */
    public static int findFirstIndexWithMinimumCount(int[] tallies, int value) {
        return IntStream.range(0, 6)
            .filter(index -> tallies[index] >= value)
            .map(index -> (index + 1) * value)
            .findFirst()
            .orElse(0);
    }
}
