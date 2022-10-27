package hw4JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		AboutMe about1 = new AboutMe();// Constructor initialized
		about1.name = "Alexander Talledo";
		about1.age = 26;
		about1.myHouseMortgage = 32567;
		about1.myYearlySalary = 1188772669;
		about1.myBankBalance = 2345678987654323345l;
		about1.myWeight = 1.874345f;
		about1.myGrade = 4.3567788;
		about1.Sex = 'M';
		about1.usCitizen = true;
		about1.Aboutme(); // Method is Initialized
		
		System.out.println("\n---------------------------------\n");
		AboutMe about2 = new AboutMe();
		about2.name = "Alex montero";
		about2.age = 40;
		about2.myHouseMortgage = 30567;
		about2.myYearlySalary = 1188772669;
		about2.myBankBalance = 5445678987654323345l;
		about2.myWeight = 2.874345f;
		about2.myGrade = 6.3567788;
		about2.Sex = 'F';
		about2.usCitizen = false;
		about2.Aboutme();

	}

}
