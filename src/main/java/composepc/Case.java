package composepc;

public class Case {

    private String manufacturer;
    private String powerSupply;
    private Dimension dimensions;
    private String model;

    public Case(String manufacturer, String powerSupply, Dimension dimensions, String model) {
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
        this.model = model;
    }

    public void pressPowerButton(){
        System.out.println("PowerButton pressed");

    }

    @Override
    public String toString() {
        return "Case{" +
                "manufacturer='" + manufacturer + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", dimensions=" + dimensions +
                ", model='" + model + '\'' +
                '}';
    }
}
