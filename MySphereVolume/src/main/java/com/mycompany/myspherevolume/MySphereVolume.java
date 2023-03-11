
package com.mycompany.myspherevolume;

import java.util.Scanner;
 
public class MySphereVolume {
   final double PI=3.14;
    public double sphereVolume(double radius){
       double myRadius=radius;
       double volume=(4.0/3.0)* PI*Math.pow(PI, myRadius);
        return volume;
    }

    public static void main(String[] args) {
        MySphereVolume myvol=new MySphereVolume();
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Radius:");
        double myRadius=scan.nextDouble();
        System.out.println("The sphere Volume:" +""+myvol.sphereVolume(myRadius) );
    }
}
                                                                                                                                                                                                                                                                                                                