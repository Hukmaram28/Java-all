import java.util.ArrayList;

public class UpdateArray {
    public ArrayList<String> update(ArrayList<String> arrayList, String element, int position){
        arrayList.set(position,element);
        return arrayList;
    }
    public ArrayList<String> empty(ArrayList<String>arrayList){
        arrayList.clear();
        return arrayList;
    }
}
