import  java.util.*;
public class AnagramSorter {
    public static List<List<String>> sortAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }
        List<List<String>> result = new ArrayList<>();
        for (List<String> group : map.values()) {
            result.add(group);
        }

        return result;
    }
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat", "tab", "cat"};
        List<List<String>> sortedAnagrams = sortAnagrams(strs);
        for (List<String> group : sortedAnagrams) {
            System.out.println(group);
        }
    }
}
//Time: O(n * logn)
//Space: O(1)