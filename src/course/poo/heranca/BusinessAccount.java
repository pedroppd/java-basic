package course.poo.heranca;

public class BusinessAccount extends Account {

	private Double loanLimit;

	public void loan(Double amount) {
		if (amount <= loanLimit) {
			deposit(amount);
		}
	}

	public BusinessAccount() {

	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

}
