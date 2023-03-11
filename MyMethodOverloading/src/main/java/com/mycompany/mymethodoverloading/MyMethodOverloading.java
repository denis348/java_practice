
package com.mycompany.mymethodoverloading;
import java.util.Scanner;

public class MyMethodOverloading {
    
    static int myArea(int height,int length,int width){
        int  boxVolume=height*length*width;
        return boxVolume;
        }
   static int myArea(int height,int length){
            int boxArea=height*length;
        return boxArea;
    }
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Box height:");
        int myheight=scan.nextInt();
        System.out.print("Enter Box length:");
        int mylength=scan.nextInt();
        System.out.print("Enter Box width:");
        int mywidth=scan.nextInt();
        System.out.println("The box volume is:" + MyMethodOverloading.myArea(myheight, mylength, mywidth));
        System.out.println("The box area is:"+MyMethodOverloading.myArea(myheight, mylength));
       
    }
} 
