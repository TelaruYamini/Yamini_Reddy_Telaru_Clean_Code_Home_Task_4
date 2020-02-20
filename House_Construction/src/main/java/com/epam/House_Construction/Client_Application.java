package com.epam.House_Construction;
import java.util.*;
public class Client_Application 
{

    public static void main( String[] args )
    {
    	//standmat=Standard material, totarea=Total area, fullauto=Fully automated home.
    	 boolean fullauto=false;
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter your Material Standard: 1.Normal standard material 2.Above standard material 3.High standard material");
      int standmat=scan.nextInt();      
      System.out.println("Enter total area of the house:");
      int totarea=scan.nextInt();
      if(standmat==3)
      {  
       System.out.println("Do you want fully automated home:");
      fullauto=scan.nextBoolean();
      }
      Services_Layer_Cost_Estimation c=new Services_Layer_Cost_Estimation(standmat,totarea,fullauto);
      System.out.println("Construction cost for the house is "+c.estimatecost(c));
    }
}
