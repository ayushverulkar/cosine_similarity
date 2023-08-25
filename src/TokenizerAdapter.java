public class TokenizerAdapter {
    public static Tokenizer selectTokenizer(String name){
        if(name=="stopwords"){
            TokenizerStopWords tokenizer = new TokenizerStopWords();
            return tokenizer;
        }
        else{
            TokenizerBasic tokenizer = new TokenizerBasic();
            return tokenizer;
        }
    }
}
