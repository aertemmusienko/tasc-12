class BankAccount {
    private String accountNumber;
    private double balance;
    private boolean isBlocked;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.isBlocked = false;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void deposit(double amount) {
        if (isBlocked) {
            System.out.println("Рахунок заблоковано. Операція неможлива.");
            return;
        }
        if (amount > 0) {
            balance += amount;
            System.out.println("Поповнення: +" + amount + ". Новий баланс: " + balance);
        } else {
            System.out.println("Сума поповнення має бути більше нуля.");
        }
    }

    public void withdraw(double amount) {
        if (isBlocked) {
            System.out.println("Рахунок заблоковано. Операція неможлива.");
            return;
        }
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Знято: -" + amount + ". Новий баланс: " + balance);
        } else {
            System.out.println("Недостатньо коштів або неправильна сума.");
        }
    }

    public void transfer(BankAccount recipient, double amount) {
        if (isBlocked || recipient.isBlocked()) {
            System.out.println("Один із рахунків заблоковано. Операція неможлива.");
            return;
        }
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            recipient.balance += amount;
            System.out.println("Переведено: " + amount + " на рахунок " + recipient.getAccountNumber());
        } else {
            System.out.println("Недостатньо коштів або неправильна сума.");
        }
    }

    public void blockAccount() {
        isBlocked = true;
        System.out.println("Рахунок " + accountNumber + " заблоковано.");
    }

    public void unblockAccount() {
        isBlocked = false;
        System.out.println("Рахунок " + accountNumber + " розблоковано.");
    }
}
