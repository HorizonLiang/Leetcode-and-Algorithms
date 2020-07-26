import java.util.ArrayList;
import java.util.List;


public class Subject3Solution {
    // 方法一
//    public int lengthOfLongestSubstring(String s) {
//        List<String> lst = new ArrayList();
//        StringBuilder sb = new StringBuilder();
//        int maxLength = 0;
//        if (!s.equals("")) {
//            for (int i = 0; i < s.length(); i++) {
//                if (sb.indexOf(String.valueOf(s.charAt(i))) >= 0) {
//                    sb.delete(0, sb.indexOf(String.valueOf(s.charAt(i))) + 1);
//                    sb.append(String.valueOf(s.charAt(i)));
//                } else {
//                    sb.append(String.valueOf(s.charAt(i)));
//                }
//                maxLength = Math.max(maxLength, sb.length());
//            }
//        }
//        return maxLength;
//    }

    // 方法二
//    public int lengthOfLongestSubstring(String s) {
//        int n = s.length();
//        int result = 0;
//        int[] charIndex = new int[256];
//        for (int left = 0, right = 0; right < n; right++) {
//            char c = s.charAt(right);
//            left = Math.max(charIndex[c], left);
//            result = Math.max(result, right - left + 1);
//            charIndex[c] = right + 1;
//        }
//        return result;
//    }

    // 方法三
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        int result = 0;
        //使用数组替代哈希表，下标为字符所代表的ASCII码值，数组中存储的元素为字符在字符串中最新的位置。
        Integer[] charIndexArray = new Integer[128];

        //快慢指针：快指针指向最新的下标，慢指针指向不重复的最小下标
        int fast = 0;
        int slow = 0;
        while (fast < s.length()) {
            char currValue = s.charAt(fast);
            if (charIndexArray[currValue] != null) {
                slow = Math.max(slow, charIndexArray[currValue] + 1);
            }
            charIndexArray[currValue] = fast;
            result = Math.max(result, fast - slow + 1);
            fast++;
        }
        return result;
    }


    public static void main(String[] args) {
//        System.out.println("pwwkew".indexOf("w"));
        long s = System.currentTimeMillis();
        Subject3Solution solution = new Subject3Solution();
        System.out.println(solution.lengthOfLongestSubstring("aab"));
//        System.out.println((System.currentTimeMillis() - s) / 60);
    }
}
