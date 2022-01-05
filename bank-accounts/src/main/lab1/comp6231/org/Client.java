package lab1.comp6231.org;

import java.util.ArrayList;

import lab1.comp6231.org.BankAccount;
import lab1.comp6231.org.CheckingAccount;
import lab1.comp6231.org.SavingsAccount;

public class Client {

	public static void main(String args[]) {

	// TODO: create 3 account objects (one checking and two saving accounts): ca, sa1, sa2
	BankAccount ca=new CheckingAccount();
	BankAccount sa1=new SavingsAccount();
	BankAccount sa2=new SavingsAccount();

	//TODO: create a generic list called: accounts
	ArrayList accounts = new ArrayList();

	//TODO: add all the three acounts to the list "accounts"
	accounts.add(ca);
	accounts.add(sa1);
	accounts.add(sa2);

	//TODO: print the information of all the three accounts
	for (int i = 0; i < accounts.size(); i++)
	    System.out.println(accounts.get(i).toString());

		
	}
}
