import java.util.Map;

import static java.lang.Math.sqrt;

public class CosineSimilarity {


    public static double Cosine(Map<String,Integer> vectorA, Map<String,Integer> vectorB){
        double dotProduct = 0;
        for(String token:vectorA.keySet()){
            if(vectorB.containsKey(token)){
                dotProduct+=vectorA.get(token)*vectorB.get(token);
            }
        }
        double magnitudeFirst = magnitude(vectorA);
        double magnitudeSecond = magnitude(vectorB);
        if(magnitudeFirst!=0 && magnitudeSecond!=0){
            double cosineSimilarity = dotProduct/(magnitudeFirst*magnitudeSecond);

            return cosineSimilarity;
        }else{
            return 0;
        }
    }



    public static double magnitude(Map<String,Integer> vector){
        double magnitude = 0;
        for(int freq:vector.values()){
            magnitude+=freq*freq;


        }
        return Math.sqrt(magnitude);
    }
}