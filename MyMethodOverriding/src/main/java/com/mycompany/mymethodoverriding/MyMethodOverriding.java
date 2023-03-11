


package com.mycompany.mymethodoverriding;


public class MyMethodOverriding {
    
   public int  myGear(int n){
       int myGears=n;
       System.out.println(myGears);
       return myGears;
   }
}
   class MyBike extends MyMethodOverriding{
           @Override
      public  int myGear(int p){
      
          int myGears2=p;
      System.out.println(myGears2);
      return myGears2;
   }
   }

 


   

