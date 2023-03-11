

package com.mycompany.myprincipal;
import java.util.Scanner;//importing Scanner Class
// program to calculate Principal Amount


public class MyPrincipal {
    //declaring class variables 
   double principal;
   double  interest;
   double years;
//creating a class method to calculate the principal amount 
   public double myPrincipallCalc(double p,double i,double t){
    principal=p;
    interest=i;
    years=t;
    double base=  principal*1+interest/12;
    double power=1*years; 
    return Math.pow(base, power);

    
   }
public static void main(String[] args){
    Scanner scan =new Scanner(System.in);//instatiating the Scanner class
    System.out.print("Enter principal Amount:");
  double myPrincipal=scan.nextDouble();      
 while (myPrincipal<10000 | myPrincipal>10000000){ //validating principal Amount from user
     System.out.print("Enter Valid Principal:");
     myPrincipal=scan.nextDouble();
 }
    System.out.print("Enter Interest: ");//validating interest from the user
   double myInterest=scan.nextDouble();
   while (myInterest<1 | myInterest>15){
       System.out.print("Enter valid Interest:");
       myInterest=scan.nextDouble();
   }
    System.out.print("Enter Number of Years:");//validating the number of years from users
    double myYears= scan.nextDouble();
    while (myYears<1 | myYears>30){
        System.out.print("Enter Valid number of years:");
        myYears= scan.nextDouble();
    }
   MyPrincipal principal = new MyPrincipal();
    double myFinalPrincipal1 = principal.myPrincipallCalc(myPrincipal, myInterest, myYears);
   System.out.println("Your Principal Amount is: "+""+ myFinalPrincipal1);
    
}
                                                          
} 

            
                                                               