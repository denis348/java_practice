
package com.mycompany.myswitch;

public class Mystery {
    public int y;
      static  int x=1;
        static int total=0;
    public static void main(String[]args){
        
        while(x<=10){
            int y=x*x;
            System.out.println(total);
            total +=y;
            ++x;
        }
    }
    
}
