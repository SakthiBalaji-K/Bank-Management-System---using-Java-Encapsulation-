package BankDetails;
import java.util.*;
class Customer {
	private	String Name;
	private long Ph;
	private long AccNo;
	private int Balance;
	private int Credit;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getPh() {
		return Ph;
	}
	public void setPh(long ph) {
		Ph = ph;
	}
	public long getAccNo() {
		return AccNo;
	}
	public void setAccNo(long accNo) {
		AccNo = accNo;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	public int getCredit() {
		return Credit;
	}
	public void setCredit(int credit) {
		Credit = credit;
	}
	
	
	public void Withdraw(int amount) {
		if(amount<0) {
			System.out.println("Invalid Amount");
			System.out.println();
		}
		else if(amount<=Balance) {
			Balance -=amount;
			System.out.println("Withdrawn Successfull");
			System.out.println();
		}
		else {
			System.out.println("Insufficient Balance");
			System.out.println();
		}
	}
	
	public void Deposit(int amount) {
		System.out.println();
		Balance = Balance + amount;
		System.out.println("Successfully Depostited !");
		System.out.println("Current Balance Amount : " + Balance);
		System.out.println();
	}
}

class CreateUser {
	private String Name;
	private int Age;
	private long Phno;
	private long Accno;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public long getPhno() {
		return Phno;
	}
	public void setPhno(long phno) {
		Phno = phno;
	}
	public long getAccno() {
		return Accno;
	}
	public void setAccno(long accno) {
		Accno = accno;
	}
	
}

class Bank{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String passwd = "Admin@123";
		CreateUser newUser = new CreateUser();
		System.out.println("1. Admin");
		System.out.println("2. User");
		System.out.print("Enter the Choice : ");
		int userchoice = sc.nextInt();
		switch(userchoice){
		case 1:
			System.out.print("Enter your Admin Password : ");
			sc.nextLine();
			String userpasswd = sc.nextLine();
			if(passwd.equals(userpasswd)) {
				System.out.println("Password Matched.");
				
				System.out.print("Enter the Name of the User : ");
				String name = sc.nextLine();
				newUser.setName(name);
			
				System.out.print("Enter the Age : ");
				int age = sc.nextInt();
				if(age>=18) {
					newUser.setAge(age);
				}
				else {
					System.out.println("Unable to Create Account");
					return;
				}
				System.out.print("Enter the Contact Number : ");
				long phno = sc.nextInt();
				newUser.setPhno(phno);
				System.out.print("Enter the Account Number : ");
				long accno = sc.nextInt();
				newUser.setAccno(accno);
				
				System.out.println("Account Successfully Created.");
				break;
				
				
			}
			else {
				System.out.println("Wrong Password.");
				break;
				
			}
			
		case 2:
			Customer c1 = new Customer();
			System.out.print("Name of the Account Holder : ");
			String name = sc.nextLine();
			c1.setName(name);
			sc.nextLine();
			System.out.print("Contact Number : ");
			long phnum = sc.nextLong();
			c1.setPh(phnum);
			System.out.print("Account Number : ");
			long accno = sc.nextLong();
			c1.setAccNo(accno);
			c1.setBalance(0);
			
			System.out.println();
			boolean isvalid = true;
			while(isvalid) {
				
			System.out.println("1. Withdrawal Amount");
			System.out.println("2. Deposit Amount");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.print("Enter your Choice : ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println();
				System.out.print("Enter the Amount to be Withdrawl : ");
				int withdrawlAmount = sc.nextInt();
				c1.Withdraw(withdrawlAmount);
				break;
			
			case 2:
				System.out.println();
				System.out.print("Enter the Amount to Deposited : ");
				int depAmount = sc.nextInt();
				c1.Deposit(depAmount);
				break;
				
			case 3:
				System.out.println();
				System.out.println("Balance Amount : " + c1.getBalance());
				System.out.println();
				break;
				
			case 4 :
				isvalid = false;
				System.out.println("Thank You!!!");
			
			}
			
		}
		
		}
			
		
	}
}
