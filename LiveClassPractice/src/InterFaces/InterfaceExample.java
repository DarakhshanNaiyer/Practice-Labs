package InterFaces;


// interface methods are by default public and abstract
// A class can inherit can inherit one class at a time but multiple inheritance

abstract class ImyAbstract{
	abstract void myfunc();
}
interface IBankAccount{
	    void deposit();
	    void withdraw();
	    void balance();

	}

interface IBankAccountStatus{
	   void openAccount();
	    void closeAccount();
	}



class SavingAccount extends ImyAbstract implements IBankAccount, IBankAccountStatus{

	@Override
	public void deposit() {
      System.out.println("Deposit in Saving Account!!");	
	}

	@Override
	public void withdraw() {
	      System.out.println("Withdraw in Saving Account!!");	
		
	}

	@Override
	public void balance() {
	      System.out.println("balance in Saving Account!!");	
		
	}

	@Override
	public void openAccount() {
           System.out.println("Open Account!");		
	}

	@Override
	public void closeAccount() {
           System.out.println("close Account!");		
		
	}

	@Override
	void myfunc() {
		System.out.println("Abstract extension along with Inheritance");
		
	}
	
	}

class CurrentAccount implements IBankAccount, IBankAccountStatus{

	@Override
	public void deposit() {
	      System.out.println("Deposit in current Account!!");	
		
	}

	@Override
	public void withdraw() {
	      System.out.println("Withdwar is current Account!!");	
		
	}

	@Override
	public void balance() {
	      System.out.println("balance in current Account!!");	
		
	}

	@Override
	public void openAccount() {
          System.out.println("Open Account!");		
		
	}

	@Override
	public void closeAccount() {
          System.out.println("close Account!");		
		
	}
	
}

public class InterfaceExample {

	public static void main(String[] args) {

		SavingAccount saving = new SavingAccount();
		
		saving.deposit();
		saving.balance();
		saving.withdraw();
		saving.openAccount();
		saving.closeAccount();
		saving.myfunc();
		
		System.out.println("--------------------------");
		
		CurrentAccount current = new CurrentAccount();
		
		current.balance();
		current.deposit();
		current.withdraw();
		current.openAccount();
		current.closeAccount();
		
	}

}
