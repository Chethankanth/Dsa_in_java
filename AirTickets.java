import java.util.*;
public class AirTickets {

    public static String showRout(HashMap<String,String> tick){
        HashMap<String,String> revMap = new HashMap<>();

        for(String key:tick.keySet()){
            revMap.put(tick.get(key),key);
        }

        for(String key:tick.keySet()){

            if(!revMap.containsKey(key)){
                return key;
            }
           
        }
        return null;

    }

    public static void main (String []args){
        HashMap<String,String> tkt = new HashMap<>();
        tkt.put("chennai","bangalore");
        tkt.put("mumbai","delhi");
        tkt.put("goa","chennai");
        tkt.put("delhi","goa");

        String start = showRout(tkt);
        while(tkt.containsKey(start)){
            System.out.printf(start+" -> ");
            start = tkt.get(start);
        }
        System.out.println(start);
    }
    
}
