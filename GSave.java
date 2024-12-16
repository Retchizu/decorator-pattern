public class GSave implements BankAccountDecorator {
    private SavingsAccount savingsAccount;

    public GSave(SavingsAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public Double getInterestRate() {
        return 0.025;
    }

    @Override
    public Double getBalance() {
        return savingsAccount.getBalance();
    }

    @Override
    public Double computeBalanceWithInterest() {
        return getBalance() + (getBalance() * getInterestRate());
    }

    @Override
    public String showInfo() {

        return ("Account number: " + savingsAccount.getAccountNumber() + "\n"
                + "Account name: " + savingsAccount.getAccountName() + "\n"
                + "Balance: " + savingsAccount.getBalance());
    }

    @Override
    public void setBankAccount() {
        setBankAccount(savingsAccount);
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account, GCash Transfer";
    }

    public SavingsAccount getBankAccount() {
        return savingsAccount;
    }

    public void setBankAccount(SavingsAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

}
