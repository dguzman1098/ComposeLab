package composepc;

public class PC {
    private Case pc_case;
    private Monitor monitor;
    private MotherBoard motherboard;

    public PC(Case pc_case, Monitor monitor, MotherBoard motherboard) {
        this.pc_case = pc_case;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private void drawLogo(){
        monitor.drawPixel(5,5, "white"); // 5x5 white pixel

    }

    public void description(){
        System.out.println("Welcome to worst buy below is the description of the pc on sale today");
        System.out.println(this);
    }

    public void powerUp(){
        pc_case.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("windows");
    }


    @Override
    public String toString() {
        return "PC{" +
                "pc_case=" + pc_case +
                ", monitor=" + monitor +
                ", motherboard=" + motherboard +
                '}';
    }
}
