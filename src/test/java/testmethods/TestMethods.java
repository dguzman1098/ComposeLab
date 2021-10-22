package testmethods;

import composepc.*;
import org.junit.Assert;
import org.junit.Test;

public class TestMethods {

    //write a test case for two methods

    @Test
    public void testPCDescription(){

        //given
        Case corsair_case = new Case("Corsair", "Asus powersupply", new Dimension(15,15,15), "E500");
        Monitor asus_monitor = new Monitor(new Resolution(1920, 1080), "Asus", "VH328H");
        MotherBoard msi_mobo = new MotherBoard("MSI-model", "MSI", 4, 4, "BIOS");
        PC computer = new PC(corsair_case, asus_monitor, msi_mobo);
        //expected outcome after calling description method
        String expected = "PC{pc_case=Case{manufacturer='Corsair', powerSupply='Asus powersupply', dimensions=Dimension{width=15, height=15, depth=15}, model='E500'}, monitor=Monitor{resolution=Resolution{height=1920, width=1080}, manufacturer='Asus', model='VH328H'}, motherboard=MotherBoard{model='MSI-model', manufacturer='MSI', ramSlots=4, cardSlots=4, bios='BIOS'}}";
        System.out.println("Expected: " + expected);

        //when
        String actual = computer.toString();
        System.out.println("Actual: " + actual);

        //then
        Assert.assertEquals(expected, actual); //test if toString() matches the expected outcome in the description method.


    }

    @Test
    public void testPCIsNotNull(){
        //given
        Case corsair_case = new Case("Corsair", "Asus powersupply", new Dimension(15,15,15), "E500");
        Monitor asus_monitor = new Monitor(new Resolution(1920, 1080), "Asus", "VH328H");
        MotherBoard msi_mobo = new MotherBoard("MSI-model", "MSI", 4, 4, "BIOS");
        PC computer = new PC(corsair_case, asus_monitor, msi_mobo);

        //when
        Assert.assertNotEquals(null, computer);


    }


}
