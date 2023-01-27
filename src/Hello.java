import java.util.SortedMap;
import java.util.SortedSet;

public class Hello {
    public static void main (String[] args){
//        System.out.println("Hello Ozge");
//
//        int myFirstNumber = (4 + 5) * 6;
//        System.out.println(myFirstNumber);
//
//        int mySecondNumber = 12;
//        int myThirdNumber = 6;
//        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
//        System.out.println(myTotal);
//
//        int myLastOne = 1000 - myTotal;
//        System.out.println(myLastOne);

        boolean isAlien = true;
        if (isAlien==true)
            System.out.println("isAlien");

        int ageOfClient = 17;
        String ageText = ageOfClient >=18 ? "Over Eighteen" : "Still a kid";
        System.out.println("Our client is " + ageText);

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        System.out.println("This is car is domestic...." + isDomestic);


    }
}