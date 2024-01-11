package Chapter8.ComputerFactory;

public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27inc Beast", "Acer", 27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        PersonalComputer thePc = new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherboard);

//        thePc.getMonitor().drawPixelAt(10, 10, "red");
//        thePc.getMotherboard().loadProgram("Windows OS");
//        thePc.getComputerCase().pressPowerButton();

        thePc.powerUp();
    }
}
