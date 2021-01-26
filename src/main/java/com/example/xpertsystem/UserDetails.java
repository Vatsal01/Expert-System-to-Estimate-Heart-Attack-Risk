package com.example.xpertsystem;

public class UserDetails {
	
	private String Fname;
	private String Lname;
	private byte Gender;
	
	private int Age;
	private double Weight ;
	private double Height ;
	private double Chol;
	private int BSL;
	private double BPL;
	private byte Diabetes;
	private byte Exercise;
	private byte Smoke;
	private byte Symptoms;
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public byte getGender() {
		return Gender;
	}
	public void setGender(byte gender) {
		Gender = gender;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public double getChol() {
		return Chol;
	}
	public void setChol(double chol) {
		Chol = chol;
	}
	public int getBSL() {
		return BSL;
	}
	public void setBSL(int bSL) {
		BSL = bSL;
	}
	public double getBPL() {
		return BPL;
	}
	public void setBPL(double bPL) {
		BPL = bPL;
	}
	public byte getDiabetes() {
		return Diabetes;
	}
	public void setDiabetes(byte diabetes) {
		Diabetes = diabetes;
	}
	public byte getExercise() {
		return Exercise;
	}
	public void setExercise(byte exercise) {
		Exercise = exercise;
	}
	public byte getSmoke() {
		return Smoke;
	}
	public void setSmoke(byte smoke) {
		Smoke = smoke;
	}
	public double getWeight() {
		return Weight;
	}
	public void setWeight(double weight) {
		Weight = weight;
	}
	public double getHeight() {
		return Height;
	}
	public void setHeight(double height) {
		Height = height;
	}
	public byte getSymptoms() {
		return Symptoms;
	}
	public void setSymptoms(byte symptoms) {
		Symptoms = symptoms;
	}

}
