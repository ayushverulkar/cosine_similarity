import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JaccardSimilarity {
    public static double calculateJaccardSimilarity(String text1, String text2) {
        Set<String> set1 = tokenizeToSet(text1);
        Set<String> set2 = tokenizeToSet(text2);

        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);

        if (union.isEmpty()) {
            return 0.0; // Avoid division by zero
        }

        return (double) intersection.size() / union.size();
    }

    public static Set<String> tokenizeToSet(String text) {
        String[] tokens = text.toLowerCase().split("\\s+");
        return new HashSet<>(Arrays.asList(tokens));
    }
}
