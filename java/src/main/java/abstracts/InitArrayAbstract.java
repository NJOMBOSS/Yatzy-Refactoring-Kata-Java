package abstracts;

import java.util.List;

public abstract class InitArrayAbstract {
    /*Création de la méthode  initCountsArray
 qui nous retourne un tableau initailisé */
    protected int[] initCountsArray(List<Integer> numbers) {
        return numbers.stream()
            .map(die -> die - 1)
            .filter(index -> index >= 0 && index < 7)
            .collect(() -> new int[6], ((arr, index) -> arr[index]++), ((arr1, arr2) -> {
            }));
    }
}
