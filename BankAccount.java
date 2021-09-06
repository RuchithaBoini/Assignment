package project;

public class BankAccount {
	String name;
	int accountnumber;
	int accountbalance;
	//BankAccount(){
		
	//}
	void BankAccoount(String n,int anum,int abalance){
		name=n;
		accountnumber=anum;
		accountbalance=abalance;
	}

}
class newaccount extends BankAccount{
	newaccount(String n,int anum,int abalance){
		name=n;
		accountnumber=anum;
		accountbalance=abalance;
	}
	newaccount(){
		super();
	}
	void insert(String n,int anum,String type) {
		name=n;
		accountnumber=anum;
		accountbalance=0;
	}
	void display() {
		System.out.println("Customer name"+name);
		System.out.println("Account number:"+accountnumber);
		System.out.println("Account balance:"+accountbalance);
	}
	void deposit(int accountnumber,int money) {
		accountbalance=money;
	}
	int withdraw(int withdraw) {
		accountbalance=accountbalance-withdraw;
		return accountbalance;
	}
}
