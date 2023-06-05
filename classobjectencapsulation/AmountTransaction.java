package classobjectencapsulation;

public class AmountTransaction {
	private String id;
	private String name;
	private int balance = 0;
	
	public AmountTransaction(String id, String name) {
        this.id = id;
        this.name = name;
    }
	public AmountTransaction(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	public int credit(int amount) {
		return (amount + balance);
	}
	public int debit(int amount) {
		if (amount <= balance) {
			balance = (balance - amount);
			return balance;
		} else
			System.out.println("Amount exceeded balance,your balance is ");
		return balance;
	}

}

public class DriverClassAccount {

	public static void main(String[] args) {
		AmountTransaction new1 = new AmountTransaction("Prajwal1234", "Prajwal", 25000);
		System.out.println(new1);
		System.out.println(new1.credit(1500));
		System.out.println(new1);
		System.out.println(new1.debit(3900));
		System.out.println(new1);
	}
}