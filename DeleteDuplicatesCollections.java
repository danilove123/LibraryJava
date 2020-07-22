package TestsProjects;

import java.util.ArrayList;
// Удаляет дубликаты
public class DeleteDuplicatesCollections {
    public static void main(String[] args) {
    }
    public static void deleteDuplicatesInt(ArrayList<Integer> d){
        int y=d.size();
        for (int i = 0; i <y ; i++) {   //Победа********
            for (int j = 0; j <y ; j++) {
                if((j<d.size())&(i<d.size())){
                    if(d.get(i).equals(d.get(j))&i!=j){
                        d.remove(j);
                        j--;
                    }
                }
            }
        }
    }
    public static void deleteDuplicatesStr(ArrayList<String> d){
        int y=d.size();
        for (int i = 0; i <y ; i++) {   //Победа********
            for (int j = 0; j <y ; j++) {
                if((j<d.size())&(i<d.size())){
                    if(d.get(i).equals(d.get(j))&i!=j){
                        d.remove(j);
                        j--;
                    }
                }
            }
        }
    }
}
