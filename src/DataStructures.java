import java.util.*;

public class DataStructures {

    public static String fiveCats() {

        int count = 0;

        List<String> cats = new ArrayList<>();

        cats.add("cat1");
        cats.add("cat2");
        cats.add("cat3");
        cats.add("cat4");
        cats.add("cat5");

        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }

        return fiveCats();
    }

    public static int mostFrequent(int arr[], int n) {
        Arrays.sort(arr);

        int maxCount = 1;
        int res = arr[0];
        int currentCount = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                currentCount++;
            } else if (currentCount > maxCount) {
                maxCount = currentCount;
                res = arr[i - 1];
            }
            currentCount = 1;
        }
        if (currentCount > maxCount) {
            maxCount = currentCount;
            res = arr[n - 1];
        }
        return res;
    }

    public static String groupMap() {
        Map<Integer, String> teamMapping = new HashMap<>();

        teamMapping.put(1, "Chelsea");
        teamMapping.put(2, "Marly");
        teamMapping.put(3, "Khaing");
        teamMapping.put(4, "Gregg");

        for (Integer i : teamMapping.keySet()) {
            System.out.println(i + " : " + teamMapping.get(i));
        }

        return groupMap();
    }

    public static List wordsWithoutList(String[] words, int length) {

        List result = new ArrayList();

        for (String word : words) {
            if (word.length() != length) {
                result.add(word);
            }
        }
        return result;
    }

    public static int countClumps(int[] nums) {
        boolean check = false;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && !check) {
                check = true;
                count++;
            } else if (nums[i] != nums[i + 1]) {
                check = false;
            }
        }
        return count;
    }

    public static String sortSentences(List<String> str) {
        String s = "This is just a sentence for this exercise";
        String[] words = s.split(" ");
        List<String> wordList = new ArrayList();
        for (String a : words) {
            wordList.add(a);
        }
        return sortSentences(str);
    }

    public static void main(String args[]) {

        countClumps(new int[]{1, 22, 55});


    }
}
