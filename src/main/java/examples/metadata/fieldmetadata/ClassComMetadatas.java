package examples.metadata.fieldmetadata;


public class ClassComMetadatas {

    @ToPrint
    private int numerical;

    @ToPrint
    @Prefix("Prof.")
    private String name;

    private double outro;

    public int getNumerical() {
        return numerical;
    }

    public void setNumerical(int numerical) {
        this.numerical = numerical;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOutro() {
        return outro;
    }

    public void setOutro(double outro) {
        this.outro = outro;
    }
}
