package com.example.xpertsystem;

public class Prediction {

	public double calcresult (UserDetails obj) {
		
		// Calling function BMI with para height and weight
		double bmi = bmi(obj.getWeight(), obj.getHeight()) ;
		
		double res = 0;
        double point, q1, q2, q3,q4,q5,q6,q7,q8,q9;
        q6=q8=q9 = 0 ;
        
        q1 = age(obj.getAge());
        System.out.println("Age :" + q1);
        q3= bsl(obj.getBSL());
        System.out.println("BSL :" + q3);
        q5 = chol(obj.getChol()); 
        System.out.println("chol :" + q5);
        q4= bpl(obj.getBPL()) ;
        System.out.println("BPL :" + q4);
        
        //Assigning points based on BMI
        if(bmi>=25 && bmi<=29.9)
        	q2=1.5 ;
        else if(bmi>29.9)
        	q2=2.5 ;
        else
        	q2=0;
        System.out.println("BMI value :" + bmi);
        System.out.println("BMI :" + q2);
        //Points based on smoke habit
        if(obj.getSmoke()==1)
        	q6=2.5 ;
        
        if(obj.getExercise()==2)
        	q7=2.5;
        else
        	q7= -1 ;
        
        if(obj.getDiabetes()==1)
        	q8=2.5 ;
        
        if(obj.getSymptoms()==1)
        	q9=2.5 ;
		
        //Adding all the points
        System.out.println("Smoke:" + q6);
        System.out.println("Exercise :" + q7);
        System.out.println("Diabetes :" + q8);
        System.out.println("Symptoms :" + q9);
        
        point = q1 + q2 + q3 + q4 + q5 + q6 + q7 + q8 + q9 ; // Total of all points gained based on questions
        
        System.out.println(point);
        
        res = (point/22.5)* 100 ;             // Calculating Percentage
        
        res=Math.round(res* 100.0) / 100.0;  //Rounding off to two decimal places
        
		return res ;
	}
	
	
	//Calculate BMI
	public double bmi(double w, double h)
	{
		double m, res = 0 ;
		m = h/100 ;
		 System.out.println(" m:" + m);
		m=m*m ;
		 System.out.println("meter square :" + m);
		res=w/m ;
		 System.out.println("BMI result :" + res);
		 
		 res=Math.round(res* 100.0) / 100.0;
		return res ;
		
	}
	
	public double age(int a)
	{
		double p=0 ;
		if(a<20)
			return p ;
		else if(a>=20 && a<45)
			p=1.5;
		else p = 2.5;
		
		return p;
	}
	
	public double bsl(int a)
	{
		double p=0 ;
		if(a<100)
			return p ;
		else if(a>=100 && a<160)
			p=1.5;
		else p = 2.5;
		
		return p;
	}
	
	public double chol(double a)
	{
		double p=0 ;
		if(a<200)
			return p ;
		else if(a>=200 && a<240)
			p=1.5;
		else p = 2.5;	
		return p;
	}
	
	public double bpl(double a)
	{
		double p=0 ;
		if(a<130 )
			return p ;
		else if(a>=130)
			p=2.5;
	
	return p ;
	}
}
