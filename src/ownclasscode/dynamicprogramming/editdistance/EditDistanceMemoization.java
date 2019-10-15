package ownclasscode.dynamicprogramming.editdistance;

public class EditDistanceMemoization {

    int numberOfSelfCall = -1;
    int[][] Dist;
    public static void main(String[] args) {

        EditDistanceMemoization e = new EditDistanceMemoization();
        System.out.println(e.editDist("maple", "kale"));
        System.out.println("Number of Self Call: " + e.numberOfSelfCall);
    }

    public int editDist(String x, String y){
        numberOfSelfCall ++;
        int n = isLengthZero(x) ? 0 : x.length();
        int m = isLengthZero(y) ? 0 : y.length();

        if (m == 0)
            return n;
        if (n == 0)
            return m;

        if(numberOfSelfCall == 0) {  //initial call
            Dist = new int[n+1][m+1];
            for(int i = 1; i < x.length() + 1; i++){
                for (int j = 1; j < y.length() + 1; j++){
                    Dist[i][j] = -1;
                }
            }
        }

        if (Dist[n][m] != -1)
            return Dist[n][m];

        if(x.charAt(n-1) == y.charAt(m-1)){
            if(Dist[n-1][m-1] == -1)
                Dist[n-1][m-1] = editDist(x.substring(0, n-1), y.substring(0, m-1));
            Dist[n][m] = Dist[n-1][m-1];
        }

        else {
            if(Dist[n-1][m-1] == -1)
                Dist[n-1][m-1] = editDist(x.substring(0, n-1), y.substring(0, m-1));
            if(Dist[n-1][m] == -1)
                Dist[n-1][m] = editDist(x.substring(0, n-1), y);
            if(Dist[n][m-1] == -1)
                Dist[n][m-1] = editDist(x, y.substring(0, m-1));

            Dist[n][m] = Min.min(Dist[n-1][m-1] + 1,
                    Dist[n-1][m] + 1,
                    Dist[n][m-1] + 1);
        }
        return Dist[n][m];
    }

    private static boolean isLengthZero(String x) {
        return x == null || x.isEmpty();
    }
}