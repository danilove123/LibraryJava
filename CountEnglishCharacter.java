
import java.util.ArrayList;
//Считает сколько Английских букв в слове
public class CountEnglishCharacter {
    public static void main(String[] args) {
    }
    public static int Count(String name){
        char[] charsAr=name.toCharArray();
        ArrayList<Integer> d=new ArrayList<>();
        for (int i = 0; i <charsAr.length ; i++) {
            d.add((int) charsAr[i]);
        }
        int count =0;
        for (int i = 0; i <d.size() ; i++) {
            int y=d.get(i);
            if(y>=65&y<=90|y>=97&y<=122){
              count++;
            }
        }
        return count;
    }
}
