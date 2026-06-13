package LLD.patterns.builder;

public class Report {

    private String header;
    private String body;
    private String footer;

    public void setHeader(String header) {
        this.header = header;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    @Override
    public String toString() {
        return "Report [header=" + header + ", body=" + body + ", footer=" + footer + "]";
    }

}
