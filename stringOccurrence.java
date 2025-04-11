import java.util.*;

public class stringOccurrence {

    public static int first = -1;
    public static int last = -1; // Correct last occurrence initialization

    public static void occur(int index, String str, char element) {
        if (index == str.length()) {
            System.out.println("First Occurrence: " + first);
            System.out.println("Last Occurrence: " + last);
            return;
        }

        char currChar = str.charAt(index);

        if (currChar == element) {
            if (first == -1) {
                first = index; // Set first occurrence if not set
            }
            last = index; // Always update last occurrence
        }

        occur(index + 1, str, element);
    }

    public static void main(String[] args) {
        String str = "abaaeofnsabaadaaf";
        occur(0, str, 'a'); // Pass 'a' as a character, not a string
    }
}