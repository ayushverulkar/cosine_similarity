import java.util.Map;

public abstract class Tokenizer implements ITokenizer{
    @Override
    public abstract  Map<String, Integer> tokenize(String inputString);
}
