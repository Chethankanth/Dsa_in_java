import java.util.*;

public class Backtracking {

    public static void premuTation(String str, String pre, int idx) {
        if (str.length() == 0) {
            System.out.println(pre);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curStr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            premuTation(newStr, pre + curStr, idx + 1);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        String pre = "";

        Backtracking obj = new Backtracking();
        obj.premuTation(str, pre, 0);
    }
}