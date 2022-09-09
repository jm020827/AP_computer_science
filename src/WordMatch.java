public class WordMatch {
    private String secret;

    public WordMatch(String word){
        secret=word;
    }

    public int scoreGuess(String guess){
        int n=0;
        int guessLen = guess.length();
        for(int i=0;i<secret.length()-guessLen+1;i++){
            if(secret.substring(i,i+guessLen).equals(guess)){
                n++;
            }
        }
        return n*guessLen*guessLen;
    }

    public String findBetter(String guess1, String guess2){
        int score1 = scoreGuess(guess1);
        int score2 = scoreGuess(guess2);
        if(score1>score2){
            return guess1;
        }
        else if(score1<score2){
            return guess2;
        }
        else{
            if(guess1.compareTo(guess2)<0){
                return guess2;
            }
            else{
                return guess1;
            }
        }
    }

    public static void main(String[] args) {
        WordMatch a = new WordMatch("concat");
        System.out.println(a.findBetter("con", "ncat"));
    }

}
