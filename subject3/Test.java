import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("A");
        lst.add("B");
        lst.add("C");
        lst.add("A");
        String s= "pwwkew";
        System.out.println(s.substring(2));
        StringBuilder sb = new StringBuilder();
        sb.append("C");
        sb.append("D");
        sb.append("A");
        System.out.println(sb.substring(3));
        sb.delete(0,2);
        System.out.println(sb);

        int[] arr = new int[128];
        arr[0] = 98;
        System.out.println(arr[98]);

    }
}
