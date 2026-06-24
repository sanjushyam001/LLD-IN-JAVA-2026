package LLD.patterns.prototype;

public class StatementService {

    private StatementRegistry statementRegistry;

    public StatementService(StatementRegistry statementRegistry) {
        this.statementRegistry = statementRegistry;
        this.statementRegistry.loadTemplate();
    }

    public BankStatement generateBankStatement(String customerTransaction) {
        BankStatement bankStatement = statementRegistry.getStatement("BASE");
        bankStatement.addTransaction(customerTransaction);
        return bankStatement;
    }

}
