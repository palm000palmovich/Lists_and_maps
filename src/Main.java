import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 4, 3, 4, 2, 5, 5, 6, 7));
        System.out.println(nechet(nums));

        System.out.println(chet(nums));

        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        System.out.println(uniqueWords(strings));

        //Количество повторений
        Set<String> ws = uniqueWords(strings);
        for (final String elem: ws){
            if (strings.contains(elem)){
                System.out.println(Collections.frequency(strings,elem));
            }
        }
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
        Set<Integer> chets = new TreeSet<>();
        for (final int element: nums) {
            if (element % 2 == 0){
                chets.add(element);
            }
        }
        return chets;
    }

    //Вывод уникальных слов
    public static Set<String> uniqueWords(List<String> strings){
        Set<String> unWrds = new LinkedHashSet<>();
        for (final String word: strings){
            unWrds.add(word);
        }
        return unWrds;
    }

}