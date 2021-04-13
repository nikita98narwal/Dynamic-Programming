import java.util.Scanner;
    import java.util.*;

    class HelloWorld{

    long [][][] dp = new long[101][101][201];
    long [] arr = new long[101];

    long solve(int turn, int ind, int x, int n){
        if(ind==n){
            return 0;
        }
        long tempsum=0, val1=Integer.MIN_VALUE, val2= Integer.MAX_VALUE;

        if(dp[turn][ind][x]!=-1)
            return dp[turn][ind][x];

        for(int i=1;i<=2*x && (ind+i-1)<n;i++){
            tempsum=(tempsum+arr[ind+i-1]);
            if(turn%2==0){
                val1=Math.max(val1,tempsum+solve(turn+1,i+ind,Math.max(x,i),n));
            }
            else{
                val2=Math.min(val2,solve(turn+1,i+ind,Math.max(x,i),n));
            }
        }

        if(turn%2==0){
            return dp[turn][ind][x]=val1;
        }
        else{
            return dp[turn][ind][x]=val2;
        }
    }

    public static void main(String []args){
        Scanner myObj = new Scanner(System.in);
        int n=myObj.nextInt();
        HelloWorld  h = new HelloWorld();
        for(int i=0;i<101;i++)
            for(int j=0;j<101;j++)
                for(int k=0;k<201;k++)
                    h.dp[i][j][k]=-1;
        // Arrays.fill(h.dp, -1);

        for(int i=0;i<n;i++){
            h.arr[i]=myObj.nextLong();
        }
        long res = h.solve(0,0,1,n);
        System.out.print(res);

        // System.out.println("Hello World");
    }
    }
