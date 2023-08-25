import java.util.*;

public class TokenizerStopWords extends Tokenizer{
    Set<String> stopWords = new HashSet<>(Arrays.asList(
            "a", "an", "and", "are", "as", "at", "for", "from",
            "has", "have", "in", "is", "it", "of", "on", "the", "to", "with"
    ));
    public Map<String, Integer> tokenize(String input) {
        Map<String, Integer> tokenFrequency = new HashMap<>();

        StringTokenizer tokenizer = new StringTokenizer(input);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken().toLowerCase();
            if(!stopWords.contains(token)){
                tokenFrequency.put(token,tokenFrequency.getOrDefault(token,0)+1);

            }
        }

        return tokenFrequency;
    }

}
