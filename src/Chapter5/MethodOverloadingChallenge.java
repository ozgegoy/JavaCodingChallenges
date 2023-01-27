package Chapter5;

public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5,8));
        System.out.println(convertToCentimeters(68));
    }

    public static double convertToCentimeters(int inches) {
        double convertInchCm = inches * (2.54);
        return convertInchCm;
    }

//    public static double convertToCentimeters(int feet, int inches){
//        double convertFtInchCm = ((feet * 12) + inches) * 2.54;
//        return convertFtInchCm;
//    }

    public static double convertToCentimeters(int feet, int inches){
        double convertFtInchCm = convertToCentimeters((feet * 12) + inches);
        return convertFtInchCm;
    }
}
