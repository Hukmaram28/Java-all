import java.util.*;

public class Occurences {
    public static HashMap occurencesstring(String string) {
        String[] str = string.replaceAll("[^a-zA-Z]", " ").split("\\s+");
        List<String> list = new ArrayList<>();
        for(String a:str){
            list.add(a.trim());
        }
        Set<String> set = new HashSet<String>();
        for (String a : list) {
            set.add(a);
        }
        Map<String, Integer> map = new HashMap<>();
        for (String a : set) {
            map.put(a, Collections.frequency(list,a));
        }
        return (HashMap) map;
    }
}

