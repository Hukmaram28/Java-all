
    import java.util.*;

    public class SetList6 {
        public ArrayList<String> sort(Set<String> set){
            SortedSet<String> sortedSet=new TreeSet<>();
            sortedSet.addAll(set);
            ArrayList<String> arrayList=new ArrayList<>(sortedSet);
            return arrayList;
        }
    }

