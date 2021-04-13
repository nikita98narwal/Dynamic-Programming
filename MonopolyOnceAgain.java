import java.util.*;

     class solution{

     static int n, k;

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);

        long dp[][]=new long[101][101];
        long arr[]=new long[101];

             n=sc.nextInt();
             k=sc.nextInt();

            for(int i=0;i<n;i++)
            arr[i]=sc.nextLong();

              for(int i=0;i<dp.length;i++){
              for(int j=0;j<dp[0].length;j++){
              dp[i][j]=-1;
              }
              }

            System.out.println(solve(0,n-1,arr,dp));
       }

     static long solve(int st,int end,long arr[],long dp[][])
     {
    if(dp[st][end]!=-1) 
    return dp[st][end];
    long sz=(end-st+1);
    long diff=n-sz;
    diff=(diff)/k;  //cout<<st<<" "<<end<<endl;
    if(diff%2==0){  
        if(sz<=k){
            long sum=0;
            for(int i=st;i<=end;i++){       
                sum+=arr[i];
                }           
                return dp[st][end]=sum; 
                }       
                else{           
                    long val1=Integer.MIN_VALUE;                        
                    for(int i=0;i<=k;i++){      
                        int cnt1=i,cnt2=k-i;
                        int st1=st,end1=end;
                        long sum=0;         
                        while(cnt1>0){
                            sum+=arr[st1];
                            st1++;
                            --cnt1;
                            }
                            while(cnt2>0){
                                sum+=arr[end1];
                                --end1;     
                                --cnt2;
                                }
                                val1=Math.max(val1,sum+solve(st1,end1,arr,dp)); 
                                }           
                                return dp[st][end]=val1;
                                }   
                                }   
                                else{   
                                    if(sz<=k){
                                        return dp[st][end]=0;
                                        }       
                                        else{       
                                            long val2=Integer.MAX_VALUE;
                                            for(int i=0;i<=k;i++){          
                                           int j=k-i;   
                                        val2=Math.min(val2,solve(st+i,(end-j),arr,dp));
                                     }      
                                 return dp[st][end]=val2;   
                                 }  

                                }
                                }
        }
