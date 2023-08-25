import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        long start = System.nanoTime();
        Tokenizer tokenizer = TokenizerAdapter.selectTokenizer("stopwords");

        Map<String,Integer> vectorA = tokenizer.tokenize(a);
        Map<String,Integer> vectorB = tokenizer.tokenize(b);

        double cosineSimilarity = CosineSimilarity.Cosine(vectorA,vectorB);
        System.out.println(cosineSimilarity*100+"%");
//        double jaccardSimilarity= JaccardSimilarity.calculateJaccardSimilarity(a,b);
//        System.out.println(jaccardSimilarity*100+"%");
        long end = System.nanoTime();
        System.out.println("runtime:"+(end-start)/1000000);





    }
}
