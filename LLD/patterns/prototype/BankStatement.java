package LLD.patterns.prototype;

import java.util.ArrayList;

public class BankStatement implements StatementPrototype {

    private String bankName;
    private String headerTemplate;
    private ArrayList<String> transactions = new ArrayList<>();

    public BankStatement() {
        this.bankName = "HDFC Bank";
        this.headerTemplate = "---------BANK STATEMENT--------";
        System.out.println("Expensive object created");
    }

    public void addTransaction(String transaction) {
        transactions.add(transaction);
    }

    public void show() {
        System.out.println(this.bankName + "\n " + this.headerTemplate + "\n" + this.transactions);
    }

    @Override
    public BankStatement cloneObject() {

        BankStatement copyBankStatement = new BankStatement();
        copyBankStatement.bankName = this.bankName;
        copyBankStatement.headerTemplate = this.headerTemplate;
        copyBankStatement.transactions = new ArrayList<>(this.transactions);
        return copyBankStatement;
    }

}
