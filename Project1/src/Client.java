import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sapient.pe.model.*;


public class Client {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		BankAccount account_one = null;
		List<BankAccount> list = new ArrayList<>();
		
		//int account_created = 0;
		
		boolean isCompleted = false;
		
		long temp_account;
		int index = -1;
		
		
		while(!isCompleted) {
			System.out.println("Hello there...How can I help you?");
			System.out.println("1 : Create a Bank Account");
			System.out.println("2 : View your account balance");
			System.out.println("3 : Deposit");
			System.out.println("4 : Withdraw");
			System.out.println("5 : Exit");
			int user_option = sc.nextInt();
			
			switch(user_option) {
				case 1 : 
					
					System.out.println("Personal Details");
					System.out.println("-----------------");
					
					System.out.println("Please enter your name : ");
					String name = sc.next();
					
					System.out.println("Please enter your age : ");
					int age = sc.nextInt();
					
					System.out.println("Please enter your mobile number : ");
					String number = sc.next();
					
					System.out.println("Please enter your gender (Male/Female) : ");
					String gender = sc.next();
					
					sc.nextLine();
					
					System.out.println("Please enter your street name : ");
					String street = sc.nextLine();
					
					System.out.println("Please enter your city : ");
					String city = sc.next();
					
					System.out.println("Please enter your state : ");
					String state = sc.next();
					
					System.out.println("Please type one of the following option for opening a bank account: ");
					System.out.println("1 : Savings Account");
					System.out.println("2 : Current Account");
					System.out.println("3 : Salary Account");
					
					int option = sc.nextInt();
					
					if(option == 1) {
						account_one = new SavingsAccount(new Person(name,age,number,gender), BankAccount.Account_Type.SAVINGS_ACCOUNT, new Address(street,city,state));
					}
					else if(option == 2) {
						account_one = new CurrentAccount(new Person(name,age,number,gender), BankAccount.Account_Type.CURRENT_ACCOUNT, new Address(street,city,state));
					}
					else {
						account_one = new SalaryAccount(new Person(name,age,number,gender), BankAccount.Account_Type.SALARY_ACCOUNT, new Address(street,city,state));
					}
					//account_created = 1;
					list.add(account_one);
					System.out.println("Congrats...Your account is created!!!");
					System.out.println("Account Number : " + account_one.getAccount_no());
					break;
				case 2 :
					System.out.println("Enter your account number : ");
					temp_account = sc.nextLong();
					index = -1;
					
					for(BankAccount itr : list) {
						if(itr.getAccount_no() == temp_account) {
							index = list.indexOf(itr);
							break;
						}
					}
					
					if(index!=-1) {
						System.out.println("Balance : " + list.get(index).getBalance());
					}
					else {
						System.out.println("Account Number does not exist!!!");
					}
					break;
				case 3 :
					System.out.println("Enter your account number : ");
					temp_account = sc.nextLong();
					index = -1;
					
					for(BankAccount itr : list) {
						if(itr.getAccount_no() == temp_account) {
							index = list.indexOf(itr);
							break;
						}
					}
					
					if(index!=-1) {
						System.out.println("Please enter the amount you want to deposit :");
						double deposit_amount = sc.nextDouble();
						list.get(index).deposit(deposit_amount);
					}
					else {
						System.out.println("Account Number does not exist!!!");
					}
					break;
				case 4 :
					System.out.println("Enter your account number : ");
					temp_account = sc.nextLong();
					index = -1;
					
					for(BankAccount itr : list) {
						if(itr.getAccount_no() == temp_account) {
							index = list.indexOf(itr);
							break;
						}
					}
					
					if(index!=-1) {
						System.out.println("Please enter the amount you want to withdraw :");
						double withdraw_amount = sc.nextDouble();
						list.get(index).withdraw(withdraw_amount);
					}
					else {
						System.out.println("Account Number does not exist!!!");
					}
					break;
				case 5 :
					isCompleted = true;
					break;
			}
		}
		
		sc.close();
	}

}