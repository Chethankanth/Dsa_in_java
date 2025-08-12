public class BoxMovement {
    public static int totalpaths = 0;

    public static int calcBoxMovement(int n, int m, int i, int j){
        if(i>=n || j>=m){
            return 0; // Out of bounds
        }           
        if(i==n-1 && j==m-1){
            return  1;
        }
        int downPaths = calcBoxMovement(n,m,i+1,j);
        int rightPaths = calcBoxMovement(n,m,i,j+1);
        return totalpaths = downPaths + rightPaths;
        
    }
    public static void main(String[] args) {
        int n =3;
        int m =3;

        int sum = calcBoxMovement(n, m, 0, 0);
        System.out.println("final destination can be reached through: "+sum+"paths");
        }
    
}
