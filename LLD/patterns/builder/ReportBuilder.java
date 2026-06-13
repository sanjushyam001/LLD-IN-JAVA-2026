package LLD.patterns.builder;

public interface ReportBuilder {

    public void headerBuilder(String headerText);

    public void bodyBuilder(String bodyText);

    public void footerBuilder(String footerText);

    public Report getReport();
}
