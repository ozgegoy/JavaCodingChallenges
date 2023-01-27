package Chapter5;

public class CodingExercises3 {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaByte = (kiloBytes / 1024);
            int remainingKiloByte = (kiloBytes % 1024);
            System.out.println(kiloBytes + " KB = " + megaByte + " MB and " + remainingKiloByte + " KB");
        }
    }

}
