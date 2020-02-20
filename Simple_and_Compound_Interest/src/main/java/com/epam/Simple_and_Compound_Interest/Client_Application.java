package com.epam.Simple_and_Compound_Interest;
import java.util.*;
public class Client_Application
{
    public static void main( String[] args )
    {
    	//principle=Principle amount, time=Time in months, rate=Rate percent.
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter your choice to calculate 1.Simple Interest 2.Compound Interest:");
       int choice=scan.nextInt();
       System.out.println("Enter the Principle amount:");
        float principle=scan.nextInt();
       System.out.println("Enter the Time in months:");
       float time=scan.nextInt();
       System.out.println("Enter the Rate percent:");
       float rate=scan.nextInt();
        Services_Layer_Interest_Estimation c=new Services_Layer_Interest_Estimation(principle,time,rate);
       if(choice==1)
       {
    	   System.out.println("Simple Interest is:"+c.Calculate_Simple_Interest(c));
       }
       else if(choice==2)
       {
    	   System.out.println("Compound Interest is:"+c.Calculate_Compound_Interest(c));
       }
       else
    	   System.out.println("Enter Invalid choice");
    }
  
}
