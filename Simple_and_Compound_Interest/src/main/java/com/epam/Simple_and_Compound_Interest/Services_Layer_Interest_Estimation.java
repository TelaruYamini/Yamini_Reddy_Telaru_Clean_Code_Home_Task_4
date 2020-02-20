package com.epam.Simple_and_Compound_Interest;
import java.io.*;
import java.util.*;
public class Services_Layer_Interest_Estimation {
	//principle=Principle amount, time=Time in months, rateper=Rate percent.
	static float principle,time,rateper;
	Services_Layer_Interest_Estimation(float principle,float time,float rateper)
	{
		this.principle=principle;
		this.time=time;
		this.rateper=rateper;
	}
	public static double Calculate_Simple_Interest(Services_Layer_Interest_Estimation c)
	{
		double Simple_Interest=(c.principle*c.time*c.rateper)/100;
		return Simple_Interest;
	}
	public static double Calculate_Compound_Interest(Services_Layer_Interest_Estimation c)
	{
		double amount=c.principle*(Math.pow((1+(c.rateper/100)),c.time));
		return Math.round(amount-c.principle);
	}
}
