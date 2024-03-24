package encapsulation;

public class bankacc {
	
	private int balance;
	private int accno;
	
	public void setbalance (int balance) {
		this.balance=balance;
	}
	public void setaccno (int accno) {
		this.accno=accno;
	}
	public int getbalance() {
		return balance;
	}
	public int getaccno () {
		return accno;
		}
	
	public static void main(String[] args) {
		bankacc a=new bankacc();
		a.setbalance(50000);
		a.setaccno(25);
		
		 System.out.println(a.getbalance());
         System.out.println(a.getaccno());
         

	}

}
