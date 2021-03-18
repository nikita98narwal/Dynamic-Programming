import java.util.*;
    import java.io.*;
    class balpal { 
    static long binomialCoeff(int n, int k) 
    { 
        long res = 1; 
        if (k > n - k) 
            k = n - k; 
        for (int i = 0; i < k; ++i) { 
            res *= (n - i); 
            res /= (i + 1); 
        } 

        return res; 
    } 
    static long catalan(int n) 
    { 
        long c = binomialCoeff(2 * n, n); 
        return c / (n + 1); 
    } 
    static long findWays(int n) 
    { 
        if ((n & 1) != 0) 
            return 0; 
        return catalan(n / 2); 
    } 
    public static void main(String[] args) 
    { 
       Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0 ){
            int n = sc.nextInt();
        System.out.println(findWays(n));} 
    } 
    } 
