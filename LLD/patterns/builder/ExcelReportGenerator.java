package LLD.patterns.builder;

public class ExcelReportGenerator implements ReportBuilder {

    Report report = new Report();

    @Override
    public void headerBuilder(String headerText) {
        headerText += " :: ExcelReportGenerator";
        report.setHeader(headerText);
    }

    @Override
    public void bodyBuilder(String bodyText) {
        bodyText += " :: ExcelReportGenerator";
        report.setBody(bodyText);
    }

    @Override
    public void footerBuilder(String footerText) {
        footerText += " :: ExcelReportGenerator";
        report.setFooter(footerText);
    }

    @Override
    public Report getReport() {
        return report;
    }

}
