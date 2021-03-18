#include <stdio.h>
      int dp[20];
    int main()
     {
    //write your code 
    dp[1]=1,dp[0]=1;
    for(int i=2;i<12;i++)
    {int s=0;
    for(int j=1;j<=i;j++)
    {
      s+=(dp[j-1]*dp[i-j]);
    }
    dp[i]=s;
    }
    int t;
    scanf("%d",&t);
    while(t--)
    {
    int n;
    scanf("%d",&n);
    printf("%d\n",dp[n]);
    }
    return 0;
    }
