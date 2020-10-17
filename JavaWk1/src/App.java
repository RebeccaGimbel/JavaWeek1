
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double itemPrice= 3.10;
		double walletMoney = 25.25;
		int numOfFriends = 5;
		int ageInYears = 21;
		String firstName = "Larry";
		String lastName = "Rogers";
		char middleInitial = 'W';
		boolean currentStudent = true;
		String fullName=firstName+" "+middleInitial+". "+lastName;
		double newWalletMoney=walletMoney-itemPrice;
		int friendsPerYear=ageInYears/numOfFriends;
		
		System.out.println(fullName);
		System.out.println(firstName +" is currently a student: "+ currentStudent);
		System.out.println();
		System.out.println(firstName + " is " + ageInYears + " years old.");
		System.out.println(firstName +" has "+numOfFriends+" friends, which means he averaged making "+friendsPerYear+" friends per year.");
		System.out.println();
		System.out.println(firstName+" had $"+walletMoney+" in his wallet, but purchased an item that costs $"+itemPrice);
		System.out.println("so now he only has $"+newWalletMoney+" in his wallet.");

	}

}
