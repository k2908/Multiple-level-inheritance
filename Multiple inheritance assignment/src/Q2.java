
public class Q2 {

	public static void main(String[] args) {
		Account_details baba= new Account_details();
		baba.display("chku baba", 225554545, 75, 2000, 500, 6000);
		// TODO Auto-generated method stub

	}

}
class Account{
	String customer_name;
	int account_no;
	public void display(String customername,int acctno){
		this.account_no=acctno;
		this.customer_name=customername;
		System.out.println("i display your name "+customer_name+" and you account number "+ account_no);
	}
	
}
class Saving_Account extends Account{
	int min_bal,saving_bal;
	
	public void display(String customername,int acctno,int min_bal,int sav_bal){
			this.min_bal=min_bal;
		this.account_no=acctno;
		this.customer_name=customername;
		this.saving_bal=sav_bal;
		System.out.println("i display your name "+customer_name+" and your account number "+ account_no+" with your saving balance "+ sav_bal+" and your min balance "+min_bal);
	}
}
class Account_details extends Saving_Account{
	int deposits,withdrawals;
	
	public void display(String customername,int acctno,int min_bal,int sav_bal, int depo,int withdr){
		this.deposits=depo;
		this.withdrawals=withdr;
		this.min_bal=min_bal;
		this.account_no=acctno;
		this.customer_name=customername;
		this.saving_bal=sav_bal;
		System.out.println("i display your name "+customer_name+" and you account number "+ account_no+" with your saving balance "+ sav_bal+" and your min balance "+min_bal+" all together with your deposits "+
		deposits +" and your withdrawals "+ withdrawals);
	}
}