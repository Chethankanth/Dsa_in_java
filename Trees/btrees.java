import java.util.*;
public class btrees {

    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
class BinaryTree{
        static int idx =-1;
    public  Node buildTree(int arr[]){
         idx++;
         if(arr[idx] ==-1){
            return null;
         }

         Node newNode = new Node(arr[idx]);
         newNode.left = buildTree(arr);
         newNode.right = buildTree(arr);

         return newNode;

         
    }

    public  void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
}

    public static void main(String[] args){
         int arr[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
         btrees bt = new btrees();
        BinaryTree btt = bt.new BinaryTree();
        Node root = btt.buildTree(arr);
         System.out.println("Preorder Traversal: ");
         btt.preOrder(root);

    }
    
}
