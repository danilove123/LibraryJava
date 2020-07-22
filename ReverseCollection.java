package TestsProjects;

import java.util.ArrayList;

// Изменяет порядок колекции в противоположную сторону
public class ReverseCollection {
    public static void main(String[] args) {
        
    }
    public static void ReverseCollectionInt(ArrayList<Integer> list){
        ArrayList<Integer> arrayList = new ArrayList<>(list);
        for (int i = 0; i <list.size() ; i++) {
            list.set(i,arrayList.get(arrayList.size()-1-i));
        }
    }
    public static void ReverseCollectionStr(ArrayList<String> list){
        ArrayList<String> arrayList = new ArrayList<>(list);
        for (int i = 0; i <list.size() ; i++) {
            list.set(i,arrayList.get(arrayList.size()-1-i));
        }
    }
    public static void ReverseCollectionChar(ArrayList<Character> list){
        ArrayList<Character> arrayList = new ArrayList<>(list);
        for (int i = 0; i <list.size() ; i++) {
            list.set(i,arrayList.get(arrayList.size()-1-i));
        }
    }

}
