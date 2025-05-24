import java.util.*;
public class HashingMap {
    public static void main(String []args){

        HashMap<String,Integer> hmap = new HashMap<>();
// insert the values into the hashmap
        hmap.put("SACHIN",9);
        hmap.put("RAME",9);
        hmap.put("pratham",9);
        hmap.put("Chethan",8);
// to remove the value
hmap.remove("pratham");

hmap.containsKey("Chethan");
hmap.containsValue(9);
hmap.get("RAME");// This will get the value of the key

//Iteration;

for(Map.Entry<String,Integer> e:hmap.entrySet()){
    System.out.println(e.getKey());
    System.out.println(e.getValue());
}




    }
    
}
