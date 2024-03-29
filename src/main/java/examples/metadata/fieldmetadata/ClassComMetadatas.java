package examples.metadata.fieldmetadata;

@ToPrint
public class ClassComMetadatas implements Mininterface {

    //@ToPrint
    @Sufix("Kg")
    @Prefix("Rupees")
    //@Rupees
    @InterValue(10)
    private int numerical;

    //@ToPrint
    @Prefix("Prof.")
    private String name;

    //@ToPrint
    @Sufix("DAIICT")
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
