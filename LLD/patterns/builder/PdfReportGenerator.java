package LLD.patterns.builder;

public class PdfReportGenerator implements ReportBuilder {

    Report report = new Report();

    @Override
    public void headerBuilder(String headerText) {
        headerText += " :: PdfReportGenerator";
        report.setHeader(headerText);
    }

    @Override
    public void bodyBuilder(String bodyText) {
        bodyText += " :: PdfReportGenerator";
        report.setBody(bodyText);
    }

    @Override
    public void footerBuilder(String footerText) {
        footerText += " :: PdfReportGenerator";
        report.setFooter(footerText);
    }

    @Override
    public Report getReport() {
        return report;
    }

}
