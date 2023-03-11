
package com.mycompany.myswitch;

import java.util.Scanner;
public class MySwitch {
    

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Please enter the number to check:");
         int n=scan.nextInt();
         
      switch(n){
          case 1:
              System.out.println("This is number one");
              break;
          case 2:
              System.out.println("This is number two");
              break;
          case 3:
               System.out.println("This is number three");     
              break;
          case 4:
              System.out.println("This is number four");
              break;
          case 5:
              System.out.println("This is number five");
              break;
          case 6:
              System.out.println("This is number six");
              break;
          case 7:
              System.out.println("This is number seven");
              break;
          case 8:
              System.out.println("This is number eight");
               break;
               
          case 9:
              System.out.println("This is number nine");
                  break;
          case 10:
               System.out.println("This is number ten"
                       + "");
                break;
          default:
                 System.out.println("I cant recognise this number");
      }
       
       
}
}