package LLD.patterns.prototype;

public class Main {
    public static void main(String[] args) {
        StatementRegistry registry = new StatementRegistry();
        StatementService service = new StatementService(registry);
        BankStatement statement1 = service.generateBankStatement("customer transaction 1 ..");
        BankStatement statement2 = service.generateBankStatement("customer transaction 2 ..");
        statement1.show();
        statement2.show();
    }
}
