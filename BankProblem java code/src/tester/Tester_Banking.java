package tester;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

import com.banking.BankAccount;

import custom_exception.BankingException;

import static utils.ValidationBankingRules.*;
public class Tester_Banking {

	/*
	 * Options
	1. Open new account
	2. Get Account summary
	3. Withdraw/deposit
	4. Transfer Funds
	5. Close Account
	 */
	public static void main(String[] args) throws BankingException 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			HashMap<Integer,BankAccount> bankhash=new HashMap<>();
			boolean exit=false;
			
			while(!exit)
			{
				System.out.println("Options : 1. Open a/c 2. Get a/c summary 3.Withdraw 4.Deposit 5.Fund transfer 6.Close account 7.Display all accounts details 8.Sorting according to account number 9.Sorting by Name 0.Exit");
				switch (sc.nextInt()) {
				case 1://Add account
					
					System.out.println("Enter acc number");
					int accNo=validateDupAcc(sc.nextInt(), bankhash);
					System.out.println("Enter customerName,  acType,  balance,  creationDate");
					BankAccount cus= validateAllInputs(accNo,sc.next(),sc.next(),sc.nextInt(),sc.next(),bankhash);
					bankhash.put(accNo, cus);
					break;
					
				case 2://get account summary
					
					System.out.println("Enter the account Num");
					BankAccount a=bankhash.get(sc.nextInt());
					if(a==null)
						throw new BankingException("Account num not available...");
					System.out.println(a);
					break;
				case 3://Withdraw
					
					System.out.println("Enter the acc No");
					a=bankhash.get(sc.nextInt());
					System.out.println("Enter the amount you want to withdraw ");
					int withdraw=a.withdraw(sc.nextInt());
					System.out.println(withdraw);
					break;
				case 4://Deposit
					
					System.out.println("Enter the acc No");
					a=bankhash.get(sc.nextInt());
					System.out.println("Enter the amount you want to Deposit ");
					int deposit=a.withdraw(sc.nextInt());
					System.out.println(deposit);
					break;
				case 5://transfer
					
					System.out.println("Enter the source accont num");
					a=bankhash.get(sc.nextInt());
					
					if(a==null)
						throw new BankingException("Account number is not valid");
					System.out.println("Enter the destination acc no");
					BankAccount dest = bankhash.get(sc.nextInt());
					
					if(dest==null)
						throw new BankingException("Account number is not valid");
					
					System.out.println("Enter the amount you want to transfer");
					a.transferFunds(sc.nextInt(),dest);
					System.out.println("Amount has beean transfer");
					System.out.println("Source account Balance="+a.getBalance()+" Destionation account balance="+dest.getBalance());
					break;
					
				case 6://Remove the Account
					
					System.out.println("Enter the Account num you want to close");
					a=bankhash.remove(sc.nextInt());
					System.out.println("Account has been Removed");
					break;
					
				case 7:// display all Account
					
					for(BankAccount displayAll :bankhash.values())
						System.out.println(displayAll);
				
				case 8://sorted as per account num
					
					TreeMap<Integer, BankAccount> tree=new TreeMap<>(bankhash);
					for(BankAccount sortAccoNo : tree.values())
						System.out.println(sortAccoNo);
					
				case 9://sort using the name
					TreeMap<Integer, BankAccount> tree1=new TreeMap<>(bankhash);
					for(BankAccount sortName : tree1.values())
						System.out.println(sortName);
					
				case 0:
					exit=true;
						
				}
			}
		}

	}

	

}
