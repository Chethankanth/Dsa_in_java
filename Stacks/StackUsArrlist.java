import java.util.*;

public class StackUsArrlist {

    static class arrlist{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){

            list.add(data);

        }
        public static int  pop(){
            if(isEmpty()){
                return -1;
            }
            int topdata = list.remove(list.size()-1);
            return topdata;

        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {

        StackUsArrlist.arrlist.push(1);
        StackUsArrlist.arrlist.push(2);
        StackUsArrlist.arrlist.push(3);
        StackUsArrlist.arrlist.push(4);

            arrlist obj = new arrlist();
            while(!obj.isEmpty()){
                System.out.println(obj.peek());
                int pop = obj.pop();

            }

            System.out.println(obj.list.size());

        
    }
    
}
