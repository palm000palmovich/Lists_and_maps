import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println(nechet(nums));

        System.out.println(chet(nums));


    }

    //Метод ищет и выводит четные и нечетные
    public static List<Integer> nechet(List<Integer> nums){
        List<Integer> nechets = new ArrayList<>();
        for (final int element: nums) {
            if (element % 2 != 0){
                nechets.add(element);
            }
        }
        return nechets;
    }

    //Только четные элементы в единственном экземпляре
    public static Set<Integer> chet(List<Integer> nums){
        Set<Integer> chets = new HashSet<>();
        for (final int element: nums) {
            if (element % 2 == 0){
                chets.add(element);
            }
        }
        return chets;
    }
}
