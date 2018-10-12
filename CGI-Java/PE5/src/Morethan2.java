import java.util.*;

public class Morethan2 {
    public Map check(String[] string){
        List<String> list = new ArrayList<>();
        for(String a:string){
            list.add(a);
        }
        Set<String> set = new HashSet<>();
        for(String a : list){
            set.add(a);
        }
        Map<String, Boolean> map = new HashMap<>();
        for(String a:set){
            if(Collections.frequency(list,a)>=2){
                map.put(a,true);
            }
            else{
                map.put(a,false);
            }
        }
        return map;
    }
}
