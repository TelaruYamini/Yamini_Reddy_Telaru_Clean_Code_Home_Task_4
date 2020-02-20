package com.epam.House_Construction;

public class Services_Layer_Cost_Estimation {
	//standmat=Standard material, constcost=Construction cost, totarea=Total area, fullauto=Fully automated home
		static int standmat,totarea;
		static boolean fullauto;
		Services_Layer_Cost_Estimation(int standmat,int totarea,boolean fullauto)
		{
			this.standmat=standmat;
			this.totarea=totarea;
			
			this.fullauto=fullauto;
		}
     public int estimatecost(Services_Layer_Cost_Estimation c)
     {
    	 if(c.standmat==3 && c.fullauto==true)
    	 {
    		 return c.totarea*2500;
    	 }
    	 else
    	 {
    		 if(c.standmat==3)
    			 return c.totarea*1800;
    		 else if(c.standmat==2)
    			 return c.totarea*1500;
    		 else if(c.standmat==1)
    			 return c.totarea*1200;
    		 else
    			 System.out.println("Enter the correct standard material");
    	 }
		return 0;
     }
}
