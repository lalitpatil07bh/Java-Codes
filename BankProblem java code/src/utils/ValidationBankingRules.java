package utils;

import java.time.LocalDate;
import java.util.HashMap;

import com.banking.AccountType;
import com.banking.BankAccount;

import custom_exception.BankingException;

public class ValidationBankingRules 
{
	public static BankAccount validateAllInputs(int accNo,String custName, String accType, int balance, String creationDate, HashMap<Integer,BankAccount> bankhash) throws BankingException 
	{
		validateDupAcc(accNo ,bankhash);
		AccountType type= parseAccountType(accType);
		LocalDate date=parseAndValidateDate(creationDate);
		validateBal(balance, type);
		
		return new BankAccount(accNo, custName, type, balance,date);
		
	}
	public static int validateDupAcc(int accNo,HashMap<Integer, BankAccount> bankhash) throws BankingException
	{
		if(bankhash.containsKey(accNo))
			throw new BankingException("Account num is alreay exist.......");
		System.out.println("Not duplicate accno...");
		return accNo;
	}
	
	public static AccountType parseAccountType(String accountType)
	{
		return AccountType.valueOf(accountType);
	}
	
	public static LocalDate parseAndValidateDate(String date)
	{
		return LocalDate.parse(date);
	}
	
	public static void validateBal(int bal, AccountType acctype) throws BankingException
	{
		if(bal < acctype.getMinBalance())
			throw new BankingException("Insuffient balance......");
		
		System.out.println("Sufficent balance");
	}
	
	 
}
