public class UpSave implements BankAccountDecorator {
    private SavingsAccount savingsAccount;

    public UpSave(SavingsAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public Double getInterestRate() {
        return 0.04;
    }

    @Override
    public Double getBalance() {
        return savingsAccount.getBalance();
    }

    @Override
    public Double computeBalanceWithInterest() {
        return savingsAccount.getBalance() + (getBalance() * getInterestRate());
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
        return "Standard Savings Account, With Insurance";
    }

    public SavingsAccount getBankAccount() {
        return savingsAccount;
    }

    public void setBankAccount(SavingsAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

}