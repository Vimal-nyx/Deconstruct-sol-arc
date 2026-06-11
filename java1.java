import java.util.*;

public class java1 {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";

        char[] a = s1.toCharArray();
        Arrays.sort(a);
        String x = new String(a);

        boolean found = false;

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            String sub = s2.substring(i, i + s1.length());

            char[] b = sub.toCharArray();
            Arrays.sort(b);

            if (x.equals(new String(b))) {
                found = true;
                break;
            }
        }

        System.out.println(found);
    }
}