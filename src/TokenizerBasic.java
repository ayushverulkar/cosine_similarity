import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class TokenizerBasic extends Tokenizer{
    public Map<String,Integer> tokenize(String inputString){
        Map<String,Integer> tokenFreq = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(inputString);
        while(tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken().toLowerCase();
            tokenFreq.put(token,tokenFreq.getOrDefault(token,0)+1);

        }
        return tokenFreq;
    }
}
