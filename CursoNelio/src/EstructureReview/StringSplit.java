package EstructureReview;

public class StringSplit {
    public static void main(String[] args){
        String s = "potato apple lemon";
        String[] vect = s.split(" "); //declarando vetor em java, objeto[]
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
    }
}
