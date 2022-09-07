package com.java.oops.thirdex;


class Branch  {
	int branch_id;
	String branch_name, branch_address;
	public int getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getBranch_address() {
		return branch_address;
	}
	public void setBranch_address(String branch_address) {
		this.branch_address = branch_address;
	}
	
	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Branch(int branch_id, String branch_name, String branch_address) {
		super();
		this.branch_id = branch_id;
		this.branch_name = branch_name;
		this.branch_address = branch_address;
	}
	@Override
	public String toString() {
		return "Branch [branch_id=" + branch_id + ", branch_name=" + branch_name + ", branch_address=" + branch_address
				+ "]";
	}
	
	
		
	}
class Customer extends Branch{
	int CustId, accountno;
	String custname, cust_address, cust_dob, cust_account_opening_date; 
	Branch Branch_Obj;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int branch_id, String branch_name, String branch_address) {
		super(branch_id, branch_name, branch_address);
		// TODO Auto-generated constructor stub
	}
	public Customer(int custId, int accountno, String custname, String cust_address, String cust_dob,
			String cust_account_opening_date, Branch branch_Obj) {
		super();
		CustId = custId;
		this.accountno = accountno;
		this.custname = custname;
		this.cust_address = cust_address;
		this.cust_dob = cust_dob;
		this.cust_account_opening_date = cust_account_opening_date;
		Branch_Obj = branch_Obj;
	}
	public int getCustId() {
		return CustId;
	}
	public void setCustId(int custId) {
		CustId = custId;
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCust_address() {
		return cust_address;
	}
	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}
	public String getCust_dob() {
		return cust_dob;
	}
	public void setCust_dob(String cust_dob) {
		this.cust_dob = cust_dob;
	}
	public String getCust_account_opening_date() {
		return cust_account_opening_date;
	}
	public void setCust_account_opening_date(String cust_account_opening_date) {
		this.cust_account_opening_date = cust_account_opening_date;
	}
	public Branch getBranch_Obj() {
		return Branch_Obj;
	}
	public void setBranch_Obj(Branch branch_Obj) {
		Branch_Obj = branch_Obj;
	}
	@Override
	public String toString() {
		return "Customer [CustId=" + CustId + ", accountno=" + accountno + ", custname=" + custname + ", cust_address="
				+ cust_address + ", cust_dob=" + cust_dob + ", cust_account_opening_date=" + cust_account_opening_date
				+ ", Branch_Obj=" + Branch_Obj + "]";
	}

	


	
	
}

class Customer_Account_Statement extends Customer{
	int CAID;
	Customer c;

	double amount, deposit_withdrawl;
	String deposit_date;

	
	public Customer_Account_Statement(int custId, int accountno, String custname, String cust_address, String cust_dob,
			String cust_account_opening_date, Branch branch_Obj, int cAID, Customer c, double amount,
			double deposit_withdrawl, String deposit_date) {
		super(custId, accountno, custname, cust_address, cust_dob, cust_account_opening_date, branch_Obj);
		CAID = cAID;
		this.c = c;
		this.amount = amount;
		this.deposit_withdrawl = deposit_withdrawl;
		this.deposit_date = deposit_date;
	}

	public Customer_Account_Statement(int cAID, Customer c, double amount, double deposit_withdrawl,
			String deposit_date) {
		super();
		CAID = cAID;
		this.c = c;
		this.amount = amount;
		this.deposit_withdrawl = deposit_withdrawl;
		this.deposit_date = deposit_date;
	}

	// display current balance in account
	public static double displayBalance(double amount) {
		System.out.println("Current Balance : " + amount);
		System.out.println();
		return amount;
	}

	//withdrawing and update the balance
	public static double amountWithdrawing(double amount, double deposit_withdrawl) {
		System.out.println("Withdrawl Operation:");
		System.out.println("Withdrawing Amount : " + deposit_withdrawl);
		if (amount >= deposit_withdrawl) {
			amount = amount - deposit_withdrawl;
			System.out.println("Please collect your money and collect the card");
			displayBalance(amount);
		} else {
			System.out.println("Sorry! Insufficient Funds");
			System.out.println();
		}
		return amount;
	}
	
	// Deposit amount and update the balance
		public static double amountDepositing(double amount,  double deposit_withdrawl) {
			System.out.println("Deposit Operation:");
			System.out.println("Deposite Amount : " + deposit_withdrawl);
			 amount = amount + deposit_withdrawl;
			System.out.println("Your Money has been successfully deposited");
			displayBalance(amount);
			return amount;
		}

		@Override
		public String toString() {
			return "Customer_Account_Statement [CAID=" + CAID + ", c=" + c + ", amount=" + amount
					+ ", deposit_withdrawl=" + deposit_withdrawl + ", deposit_date=" + deposit_date + "]";
		}
		
}

public class BankStatement{

	
	public static void main(String[] args) {
		
		
		Branch b=new Branch(1,"science","pune");
		Customer c1=new Customer(10,123465,"abc","pune","1/2/1990","2/3/2020",b);

		double amount = 8000.0;
	double deposit_withdrawl = 4000.0;
		

		
		
	Customer_Account_Statement cas = new Customer_Account_Statement(101,c1,amount,deposit_withdrawl,"2/3/2020");
		double camount=cas.displayBalance(amount);
		double Damount=cas.amountDepositing(camount, deposit_withdrawl);
		cas.amountWithdrawing(Damount, deposit_withdrawl);
		
System.out.println(cas);
	}

}

