import java.util.ArrayList;

public class CountElements {
//Возвращает массив строк где :(каждая строка) 'элемент' ' сколько раз встречается'
//Всё по порядку    
    public static ArrayList<String> CountElementsM(ArrayList<Integer> arr){
        ArrayList<Integer> d=new ArrayList<>(arr);
        DeleteDuplicatesCollections.deleteDuplicatesInt(d);
        ArrayList<Integer> countDupl=new ArrayList<>();
        for (int i = 0; i <d.size() ; i++) {
            int y=0;
            for (Integer integer : arr) {
                if (d.get(i).equals(integer)) {
                    y++;
                }
            }
            countDupl.add(y);
        }
        ArrayList<String> arrStr=new ArrayList<>();
        for (int i = 0; i <countDupl.size() ; i++) {
            arrStr.add(d.get(i)+" "+countDupl.get(i));
        }
        return arrStr;
    }
}
