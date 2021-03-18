 import java.util.*;
     import java.io.*;
     class prepbytes { 
     static int chordCnt(int A) 
     { 
        int n = 2 * A;
        int[] dpArray = new int[n + 1]; 
        dpArray[0] = 1; 
        dpArray[2] = 1; 
        for (int i = 4; i <= n; i += 2) { 
            for (int j = 0; j < i - 1; j += 2)  
            { 
                dpArray[i] += (dpArray[j] *  
                              dpArray[i - 2 - j]); 
            } 
        } 

        // returning the required number 
        return dpArray[n]; 
      } 
      public static void main(String[] args) 
      { Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0 ){
            int n = sc.nextInt();
        System.out.println(chordCnt(n/2)); 
        }
      } 
      } 
