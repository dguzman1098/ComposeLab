package composepc;

public class Monitor {

    protected Resolution resolution;
    private String manufacturer;
    private String model;

    public Monitor(Resolution resolution, String manufacturer, String model) {
        this.resolution = resolution;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + ", " + y + " in color " + color);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolution=" + resolution +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
