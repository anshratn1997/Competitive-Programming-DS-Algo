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
         
        public FastReader()
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

        int digit(int n)
        {
            int d=0;
            while(n>0)
            {n/=10;
                d++;

            }
            return d;
        }
         

    }
public static void main(String[] args) {
        
    
        FastReader s=new FastReader();
        String str=s.next();
        int count=0;
         boolean atmost=false;
         boolean check=false;
         /*
        for(int i=str.length()-2;i>=0;i--)
          {
             if(str.charAt(i)=='V' && str.charAt(i+1)=='K')
             {
                count++;
                i--;
                //System.out.println("ok");
             }
             else if(str.charAt(i)=='V' && str.charAt(i+1)=='V')
             {
                if(atmost==false){
                count++;
                i--;
                atmost=true;
              //System.out.println("ok2");
          }
              
             }
             else if(str.charAt(i)=='K' && str.charAt(i+1)=='K')
           {
            if(atmost==false){
                count++;
                i--;
                atmost=true;
           } 
             }
          }

         System.out.println(count);
         */
         String[] vk=str.split("VK");
         for (String st:vk ) {
             System.out.println(st);
         }
        
        
}
}