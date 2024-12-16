public class SavingsAccount implements BankAccount {
    private Integer accountNumber;
    private String accountName;
    private Double balance;

    public SavingsAccount() {

    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String showAccountType() {
        return "Savings Account";
    }

    @Override
    public Double getInterestRate() {
        return 0.01;
    }

    @Override
    public Double computeBalanceWithInterest() {
        return this.balance + (this.balance * getInterestRate());
    }

    @Override
    public String showInfo() {
        return ("Account number: " + accountNumber + "\n"
                + "Account name: " + accountName + "\n"
                + "Balance: " + balance);
    }

    @Override
    public String showBenefits() {

        return "Standard Savings Account";
    }

}
