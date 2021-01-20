public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        int x= 0;
        double total = 0;
        for(int i = 0; i <mat.length; i++){
            for(int j = 0; j < mat[i].length;j++){
                total = total + mat[i][j];
                x++;
            }
        }
        return total / x;
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        double[] res = new double[mat.length];
        for (int i = 0; i < mat.length; i++) {
            int mid = mat[i].length / 2;
            if (mat[i].length % 2 == 1) {
                res[i] = mat[i][mid];
            } 
            else {
                res[i] = (mat[i][mid - 1] + mat[i][mid]) / 2.0;
            }
        }
        double ans = new double(res);
        return ans;
    }
    


    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
    int val = 0;
    int[] freq = new int[100];
    int large = 0;
    int mode = -1;
    for (int row = 0; row < mat.length; row++) {
        for (int col = 0; col < mat[row].length; col++) {
            val = (int) mat[row][col];
            freq[val]++;
        }
    }
    for (int i = 0; i < 100; i++) {
        if (freq[i] > large) {
            large = freq[i];
            mode = i;
        }  
    }
    return mode;
    }


    public static void main(String[] args) {
        double[][] arr= {{2,4,6},{7,4,9},{3,1,2},{8,4,6},{1,8,9}};
    System.out.print(mode(arr));
    System.out.print(mean(arr));
    System.out.print(median(arr));
    }
}