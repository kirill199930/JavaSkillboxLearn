package Algorithm;

public class Fac {
    public static long factrial(int n){
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }


    public static long factrial2(int n, long[] arr){
        if (arr[n] != -1)
            return arr[n];
        if(n <= 1)
            return n;
        long result = factrial2(n - 1, arr) + factrial2(n - 2, arr);
        arr[n] = result;
        return result;
    }
}
