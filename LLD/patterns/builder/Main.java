package LLD.patterns.builder;

public class Main {
    public static void main(String[] args) {

        // User user = User.builder()
        // .firstName("Gagandeep")
        // // .lastName("Singh")
        // .build();
        // System.out.println(user);

        // Enginner engineer = new Enginner(new HouseBuilder());
        // House hosue = engineer.constructHouse("Foundation..", "Walls..");
        // System.out.println("House" + hosue);

        ReportBuilder pdfReportBuilder = new PdfReportGenerator();
        ReportBuilder excelReportBuilder = new ExcelReportGenerator();

        ReportGenerator reportGenerator = new ReportGenerator(excelReportBuilder);

        Report report = reportGenerator.constructReport("HEADER", "BODY", "FOOTER");
        System.out.println(report);

    }
}
