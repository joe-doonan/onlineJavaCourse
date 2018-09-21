package Constructors;

public class Main {
	
	public static void main(String[] args) {
		
		Account bobsAccount = new Account(); //"12345", 0.00, "Joe Doonan", "jdoonan965@gmail.com", "07581147644");
		
		bobsAccount.withdrawal(100.0);
		
		bobsAccount.deposit(50);
		bobsAccount.withdrawal(100);
		
		bobsAccount.deposit(51);
		bobsAccount.withdrawal(100);
		
		Account timsAccount = new Account("Tim", "time@email.com", "12345");
		System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());
		
		VipPerson person1 = new VipPerson();
		System.out.println(person1.getName());
		
		VipPerson person2 = new VipPerson("Bob", 25000.00);
		System.out.println(person2.getName());
		
		VipPerson person3 = new VipPerson("Tim", 100.00, "tim@email.com");
		System.out.println(person3.getName());
	}
}
