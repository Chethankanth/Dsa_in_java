public class PlaceTiles {

    public static int countWays(int n, int m){
        if(n==m ){
            return 2;
        }
        if(n <  m ){
            return 1; // Not enough space to place a tile
        }

        int vertical = countWays(n-1,m);

        int horizontal = countWays(n-m, m);

        return vertical + horizontal;

        

    }

    public static void main(String[] args) {
        int n = 20;
        int m = 4;
        
        int result = countWays(n, m);
        System.out.println("Number of ways to place tiles: " + result);
    }

    
}
