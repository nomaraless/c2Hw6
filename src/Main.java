import java.util.*;

public class Main {
    public static void main(String[] args) {
        //task1
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer i : nums) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        System.out.println();
        //task2
        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        HashSet<Integer> hashSet1 = new HashSet<Integer>(nums1);
        for (Integer i : hashSet1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
        //task3
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        HashSet<String> hashSet2 = new HashSet<>(strings);
        for (String s : hashSet2) {
            System.out.println(s);
        }
        System.out.println();
        //task4
        List<String> strings1 = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        for (String word : strings1) {
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
    }
