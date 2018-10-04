import java.io.*;
import java.util.*;
import java.math.*;
//public 
class Main{
    //static variable
    static final int mod = (int) 1e9 + 7;
    static final double eps = 1e-6;
    static final double pi = Math.PI;
    static final long inf = Long.MAX_VALUE / 2;

    // .......static class
  static class Pair{
      int key,value;
      Pair(int key,int value){
        this.key=key;
        this.value=value;
      }
      int Key(){
        return key;
      }
      int Value(){
        return value;
      }
  }
  static class mycomparator implements Comparator<Pair>{
     @Override
     public int compare(Pair o1,Pair o2){
      Integer key1=o1.Key(),key2=o2.Key();
          return key1.compareTo(key2);
     }
  }
    
//.............staic class end.
  
    BufferedReader br;
    PrintWriter out;
    public static void main(String[] args) {
    new Main().main1();
 
  }
  void main1()
  {
    try{
        if (System.getProperty("ONLINE_JUDGE") == null) {
        // Input is a file
        br=new BufferedReader(new FileReader(new File("in.txt")));
        out=new PrintWriter("out.txt");
       } else {
        // Input is System.in
        br=new BufferedReader(new InputStreamReader(System.in));
        out=new PrintWriter(System.out);
      }
      int t=1;
     // t=ii();
      while(t-->0){

        //........solution start
        int n=ii();
        int[][] dick=iim(n,6);
        ArrayList<Set<Integer>> set=new ArrayList<>();
        for (int i=0;i<n ;i++ ) {
            Set<Integer> s=new HashSet<>();
            for (int l=0;l<6 ;l++ ) {
               s.add(dick[i][l]);
            }
            set.add(s);
        }
        
        boolean done=true;
        int num=87;
        while(done){
            int tt=num;
            ArrayList<Integer> dgs=new ArrayList<>();
            while(tt>0){
             dgs.add(tt%10);
             tt/=10;
            }
            int sz=dgs.size();
           for (int i=0;i<n ;i++ ) {
            sz=dgs.size();
             boolean v[]=new boolean[n];
              Arrays.fill(v,false);
              for (int d=0;d<dgs.size() ;d++ ) {
                 int dg=dgs.get(d);
                 
                 for (int m=0;m<n ; m++) {
                    if(set.get(m).contains(dg) && !v[m]){
                      v[m]=true;
                      sz--;
                      out.println("break at i "+m);
                      break;
                    }
                    if(sz==0)
                      break;
                 }
                 if(sz==0)
                  break;
              }
              if(sz==0)
                  break;

           }
           if(sz!=0)
            done=false;
           else
           num++;


        }
        out.println(num);
       


  
        









        //..........solution end.

     }
     out.flush();
     out.close(); 
    }
    catch(Exception e){
        e.printStackTrace();}    
  }


  // ...............required method.




  //................end.
  
  
   //..............input method start. 
    int getmax(int a[]){
      int n=a.length;
      int max=a[0];
      for (int i=1;i<n ;i++ ) {
        max=Math.max(a[i],max);
      }
      return max;
    }
     int getmin(int a[]){
      int n=a.length;
      int min=a[0];
      for (int i=1;i<n ;i++ ) {
        min=Math.min(a[i],min);
      }
      return min;
    }

    int[] iint() throws IOException{
      String line[]=br.readLine().split(" ");
      int[] a=new int[line.length];
      for (int i=0;i<line.length ;i++ ) {
        a[i]=Integer.parseInt(line[i]);
      }
      return a;
    }
    long[] ilong() throws IOException{
      String line[]=br.readLine().split(" ");
      long[] a=new long[line.length];
      for (int i=0;i<line.length ;i++ ) {
        a[i]=Long.parseLong(line[i]);
      }
      return a;
    }
    double[] idouble() throws IOException{
      String line[]=br.readLine().split(" ");
      double[] a=new double[line.length];
      for (int i=0;i<line.length ;i++ ) {
        a[i]=Long.parseLong(line[i]);
      }
      return a;
    }
    long li() throws IOException{
      
      return Long.parseLong(br.readLine());
    }
    int ii() throws IOException{
      
      return Integer.parseInt(br.readLine());
    }
    double di() throws IOException{
      return Double.parseDouble(br.readLine());
    }
    char ci() throws IOException{
      return (char)br.read();
    }
    String si() throws IOException{
       return br.readLine();
    }
    String[] isa(int n) throws IOException{
        String at =si();
        return at.split(" ");
    }

    double[][] idm(int n, int m) throws IOException{
        double a[][] = new double[n][m];
        for (int i = 0; i < n; i++) {
          double[] temp=idouble();
          for (int j = 0; j < m; j++) a[i][j] = temp[j];
        }
        return a;
    }

    int[][] iim(int n, int m) throws IOException{
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
          int[] temp=iint();
          for (int j = 0; j < m; j++) a[i][j] =temp[j];
        }
        return a;
    }
    long[][] ilm(int n, int m) throws IOException{
       long a[][] = new long[n][m];
        for (int i = 0; i < n; i++) {
          long[] temp=ilong();
          for (int j = 0; j < m; j++) a[i][j] =temp[j];
        }
        return a;
    }
    //..............input methods end;
    
} 