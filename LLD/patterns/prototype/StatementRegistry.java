package LLD.patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class StatementRegistry {

    private Map<String, BankStatement> statementRegistry = new HashMap<>();

    public void loadTemplate() {
        BankStatement base = new BankStatement();
        base.addTransaction("Initial setup txn");
        statementRegistry.put("BASE", base);

    }

    public BankStatement getStatement(String type) {
        return statementRegistry.get(type).cloneObject();
    }

}
