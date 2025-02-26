class Bank {
    private BankAccount[] accounts;
    private int accountCount;

    public Bank(int size) {
        accounts = new BankAccount[size];
        accountCount = 0;
    }

    public void createAccount(String accountNumber, double initialBalance) {
        if (accountCount < accounts.length) {
            accounts[accountCount++] = new BankAccount(accountNumber, initialBalance);
            System.out.println("Рахунок " + accountNumber + " створено.");
        } else {
            System.out.println("Не можна створити більше рахунків.");
        }
    }

    public BankAccount getAccount(String accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null;
    }

    public void blockAccount(String accountNumber) {
        BankAccount account = getAccount(accountNumber);
        if (account != null) {
            account.blockAccount();
        } else {
            System.out.println("Рахунок не знайдено.");
        }
    }

    public void unblockAccount(String accountNumber) {
        BankAccount account = getAccount(accountNumber);
        if (account != null) {
            account.unblockAccount();
        } else {
            System.out.println("Рахунок не знайдено.");
        }
    }
}
