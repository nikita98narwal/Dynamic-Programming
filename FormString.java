 import java.util.Scanner;
     import java.util.*;

    class HelloWorld{

    Map<String,Integer> mp=new HashMap<String,Integer>();

    boolean solve(String s){
        if(mp.get(s) != null){
            if(mp.get(s) == 1)
                return true;
        }
        String w = "";
        int fl=2;
        for(int i=0;i<s.length();i++){
            w+=s.charAt(i);
            if(mp.get(w) != null){
                if(mp.get(w)==1 && solve(s.substring(i+1))){
                    mp.put(s,1);
                    return true;
                }
            }
        }
        mp.put(s,2);
        return false;
    }
    public static void main(String []args){
        Scanner myObj = new Scanner(System.in);
        int t=Integer.parseInt(myObj.nextLine());
        HelloWorld  h = new HelloWorld();
        while(t-- > 0){
            h.mp.clear();
            String s=myObj.nextLine();
            int n=Integer.parseInt(myObj.nextLine());
            String st;
            for(int i=0;i<n;i++){
                st=myObj.nextLine();
                h.mp.put(st,1);
            }
            boolean res = h.solve(s);
            System.out.println(res?"Yes":"No");
        }
    }
     }
