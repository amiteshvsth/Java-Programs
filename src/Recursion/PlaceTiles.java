package Recursion;

public class PlaceTiles {
    public static int placeTiles(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vertPlaced=placeTiles(n-m, m);

        int horiPlaced=placeTiles(n-1,m);

        return vertPlaced+ horiPlaced;
    }

    public static void main(String[] args) {
        int n=4, m=2;
        System.out.println(placeTiles(n,m));
    }
}
