package guru.springframework;

public class Dollar {

	private int amount;
	
	public Dollar(int num)
	{
		this.amount = num;
	}
	
	Dollar times(int num)
	{
		return new Dollar(amount * num);
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
