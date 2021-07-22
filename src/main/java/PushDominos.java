import java.util.Arrays;

public class PushDominos {

    private char getState(char prev,char current,char next){
        char newChar = current ;
        if(current == '.'){
            if(prev == 'R' && next == 'L') ;
            else if(prev == 'R') newChar = 'R';
            else if(next == 'L')  newChar = 'L';
        }
        return newChar;
    }

    private char getState(int i,char current, char other){
        if(current == '.'){
            if(i==0){
                if(other == 'L'){
                    return 'L';
                }
                return current;
            }
            else {
                if(other=='R') return 'R';
                return current;
            }
        }
        else return current;

    }

    public char[] mainSolve(char[] pattern){
        char[] newPattern = new char[pattern.length];
        char newChar;
        for(int i=0;i<pattern.length;i++){
            if(i==0){
                newChar = getState(0,pattern[i],pattern[i+1]);
            }
            else if(i==pattern.length-1){
                newChar = getState(1,pattern[pattern.length-1],pattern[pattern.length-2]);
            }
            else{
                newChar = getState(pattern[i-1],pattern[i],pattern[i+1]);
            }
            newPattern[i] = newChar;
        }
        if(Arrays.equals(pattern,newPattern)) return newPattern;
        else return mainSolve(newPattern);
    }

    public String solution(String input){
        char[] letters = input.toCharArray();
        char[] output = mainSolve(letters);
        return String.valueOf(output);
    }
}
