package hw4JavaVariables;

public class AboutMe {
// variables initialized
	public String name;
	public byte age = 26;
	public short myHouseMortgage;
	public int myYearlySalary;
	public long myBankBalance;
	public float myWeight;
	public double myGrade;
	public char Sex;
	public boolean usCitizen;

// Constructor declared

	public AboutMe() {
		System.out.println("This is all about me: \n");

	}

	public void Aboutme() {
		System.out.println("My Name: " + name + "\nMy Age: " + age + "\nMy Mortgage: " + myHouseMortgage
				+ "\nMy Salary: " + myYearlySalary + "\nMy Bank Balance: " + myBankBalance + "\nMy Weight: " + myWeight
				+ "\nMy Grade: " + myGrade + "\nMy Sex: " + Sex + "\nMy Citizen Status: " + usCitizen);

	}
}
