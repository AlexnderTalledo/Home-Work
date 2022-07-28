package hw3JavaVariables;

public class AboutMe {
	public String name = "Alexander Talledo";
	public byte age = 26;
	public short myHouseMortgage = 32567;
	public int myYearlySalary = 1188772669;
	public long myBankBalance = 2345678987654323345l;
	public float myWeight = 1.874345f;
	public double myGrade = 4.3567788;
	public char Sex = 'M';
	public boolean usCitizen = true;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println(aboutMe.name);
		System.out.println(aboutMe.age);
		System.out.println(aboutMe.myHouseMortgage);
		System.out.println(aboutMe.myYearlySalary);
		System.out.println(aboutMe.myBankBalance);
		System.out.println("My Name: " + aboutMe.name + " , My Age: " + aboutMe.age);
		System.out.println("My Name: " + aboutMe.name + " , My Age: " + aboutMe.age + " , My Mortgage: "
				+ aboutMe.myHouseMortgage + ", My Salary: " + aboutMe.myYearlySalary + "\nMy Bank Balance: "
				+ aboutMe.myBankBalance + ", My Weight: " + aboutMe.myWeight + "\nMy Grade: " + aboutMe.myGrade
				+ ", My Sex: " + aboutMe.Sex + ", My Citizen Status: " + aboutMe.usCitizen);

	}

}
