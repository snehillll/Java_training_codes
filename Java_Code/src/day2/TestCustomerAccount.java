package day2;

public class TestCustomerAccount {
	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setcId(101);
		c1.setName("Jam");
		Account account =c1.getAccount();
		account.setAnumber(112233);
		account.setBalance(5000000);
		System.out.println(c1.getcId()+" "+c1.getName()+" "+c1.getAccount().getAnumber());
	}
	

}
