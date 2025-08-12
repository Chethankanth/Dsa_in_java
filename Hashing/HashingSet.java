package Hashing;
import java.util.HashSet;
import java.util.Iterator;
public class HashingSet {

    public static void main(String [] args){

        HashSet<Integer> set = new HashSet<>();
// add() adds the elements;O(1);
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(6);

        // to search the element we use .contains("element");O(1);

        if(set.contains(1)){
            System.out.println("the set contains 1");
        }

        if(!set.contains(7)){
            System.out.println("the set dosent contains the element 7");
        }

        // to delete the element in the set we use .remove("elemnt");O(1);

        set.remove(2);
        if(!set.contains(2)){
            System.out.println("the set doesnt contain 2");
        }

        // gives the size of the Hashset
        System.out.println("the size of the array list is: "+set.size());
        //Prints all the elements iside the set
        System.out.println("prints all the elements in the set prinnted in normal way!");
        System.out.println(set);

        // important concept iterator;
        Iterator it = set.iterator();
        System.out.println("this is printed using iteratior ");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
}
