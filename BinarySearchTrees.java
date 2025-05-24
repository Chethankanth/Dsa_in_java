import java.util.*;
public class BinarySearchTrees {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTrees {
        static int idx = -1;

        public static Node buildTree(int[] node) {
            idx++;
            if (node[idx] == -1) {
                return null;
            }

            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);

            return newNode;
        }

        //the time complexity of the preorder is O(n);
        public static void preOrder(Node root){
            if(root == null){
                return;
            }

            System.out.printf(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void inOrder(Node root){
            if(root == null){
                return;

            }
            inOrder(root.left);
            System.out.printf(root.data+" ");
            inOrder(root.right);
        }

        public static void postOrder(Node root){
            if(root == null){
                return;
            }

            postOrder(root.left);
            postOrder(root.right);
            System.out.printf(root.data+" ");
        }
        public static void levelOrder(Node root){
            Queue<Node> q = new LinkedList<>();

            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }else{
                    System.out.printf(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }

        //calculate nodes
        public static int calculateNodes(Node root){
            if(root == null){
                return 0;
            }

            int lNodes = calculateNodes(root.left);
            int rNodes = calculateNodes(root.right);
            return lNodes+rNodes+1;
        }
        //calculate nodes
        public static int calculateSum(Node root){
            if(root == null){
                return 0;
            }

            int lNodes = calculateSum(root.left);
            int rNodes = calculateSum(root.right);
            return lNodes+rNodes+root.data;
        }
        public static int height(Node root){
            if(root == null){
                return 0;
            }

            int lNodes = height(root.left);
            int rNodes = height(root.right);
            int height = Math.max(lNodes, rNodes)+1;
            return height;

        }
        public static int diameter(Node root){
            if(root == null){
                return 0;
            }

            int dia1 = diameter(root.left);
            int dia2 = diameter(root.right);
            int height = height(root.left)+height(root.right)+1;
            return Math.max(height,Math.max(dia1,dia2));
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] node = {1, 2, 4, -1, 5, -1, -1, 7, -1, 6, -1, -1, -1};
        BinaryTrees bt = new BinaryTrees();
        BinaryTrees.idx = -1;  // Always reset before building

        Node root = bt.buildTree(node);
        // System.out.println(root.data);  // Should print 1
        System.out.println("enter the 1 for preorder,2 for inorder,3 for postorder,4 for level order!..");
        int n = sc.nextInt();
        if(n==1){bt.preOrder(root);}
        else if(n==2){
             System.out.println("the inorder of the tree is: ");
        //calls the inorder
        bt.inOrder(root);//O(n)

        }
        
       else if(n==3){
            System.out.println("the postorder of the tree is: ");
        bt.postOrder(root);//0(n)

       }
       else if(n==4){
        System.out.println("level order: ");
        bt.levelOrder(root);//O(n)
       }
       else if(n==5){
        System.out.println("the number of nodes present in the tree are: ");
        System.out.println(bt.calculateNodes(root));//0(n)

       }
       else{
        System.out.println("wrong choice!..");
       }
       System.out.println("the sum is: ");
       System.out.println(bt.calculateSum(root));
       System.out.println("the height is: ");
       System.out.println(bt.height(root));
       System.out.println("this is the diameter of the tree: ");
       System.out.println(bt.diameter(root));//O(n^2);
    
    }
}