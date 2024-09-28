import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println(nechet(nums));;


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

    //Только

}
