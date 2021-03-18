 import java.util.Scanner;
     import java.util.*;

      class HelloWorld{
     public static void main(String []args){
        Scanner myObj = new Scanner(System.in);
        long [] dp = new long[101];
        dp[1]=0;dp[2]=1;dp[3]=2;dp[4]=4;dp[0]=0;dp[5]=6;dp[6]=9;

        for(int i=7;i<101;i++){
        long mx=-1;
             for(int j=1;j<=i;j++){
                  mx=Math.max(mx,dp[j]*(i-j));
             }
             dp[i]=mx;
        }
        int t=myObj.nextInt();
        while(t-- > 0){
            int n=myObj.nextInt();
            System.out.println(dp[n]);
        }
     }
     }
