import java.io.*;
import java.util.*;
import java.math.*;
import javafx.util.Pair;
//public
 class Main
{

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
         
        public FastReader ()
        {
            
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        
        
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int iint()
        {
            return Integer.parseInt(next());
        }
 
        long ilong()
        {
            return Long.parseLong(next());
        }
 
        double idouble()
        {
            return Double.parseDouble(next());
        }
 
        String readline()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }        
    }
 
 public static void main(String[] args)
    {
        FastReader s=new FastReader();
        int t=s.iint();
        while(t-->0){
           int n=s.iint();
           System.out.println(n);
           for(int i=1;i<=n;i++){
            System.out.println(n);
               for (int j=1;j<=n ;j++ ) {
                    System.out.println(j+" "+i+" "+(i%n+1));
               }

           }
        
        
        }
    }
}