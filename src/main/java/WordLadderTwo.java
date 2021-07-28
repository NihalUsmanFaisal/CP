public class WordLadderTwo {
    private boolean adjacentWords(String firstWord, String secondWord){
        char[] firstWordArray = firstWord.toCharArray();
        char[] secondWordArray = secondWord.toCharArray();
        int count=0;
        for(int i=0;i< firstWordArray.length;i++){
            if(count > 1) return false;
            if(firstWordArray[i] == secondWordArray[i]) count++;
        }
        return true;
    }

}
