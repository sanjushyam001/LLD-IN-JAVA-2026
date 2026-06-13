package LLD.patterns.builder;

public class ReportGenerator {

    private ReportBuilder builder;

    public ReportGenerator(ReportBuilder builder) {
        this.builder = builder;
    }

    public Report constructReport(String header, String body, String footer) {

        builder.headerBuilder(header);
        builder.bodyBuilder(body);
        builder.footerBuilder(footer);
        return builder.getReport();
    }

}
