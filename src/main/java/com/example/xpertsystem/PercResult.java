package com.example.xpertsystem;

public class PercResult {

	public String isSafe (double risk)
	{
		String s = " Congratulations, You are not at risk ";
		
		if(risk<20.0)
			return s;
		else
		{
			if(risk>20.0 && risk<45.0)
		s= "You are at Moderate Risk of Heart Attack, follow healthy lifestyle to lower your risk";
		else
		{
			if(risk>45 && risk<75)
				s = " You are at High Risk, Kindly consult a Doctor as soon as possible" ;
			else
			{
				s = "ALERT!! You are at extremely high risk. Consult a doctor immediately";
			}
		}
	}
		return s ;
	}
}
