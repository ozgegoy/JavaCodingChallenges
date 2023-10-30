package Chapter7.AllAboutStrings;

public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "17/02/1997";
        int startingIndex = birthDate.indexOf("1997");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));
        System.out.println("Month = " + birthDate.substring(3, 5));
        String newDate = String.join("/", "17", "02", "1997");
        System.out.println("newDate = " + newDate);

        newDate = "17";
        newDate = newDate.concat("/");
        newDate = newDate.concat("02");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1997");
        System.out.println("newDate = " + newDate);

        newDate = "17" + "/" + "02" + "/" + "1997";
        System.out.println("newDate = " + newDate);

        newDate = "17".concat("/").concat("02").concat("/")
                .concat("1997");
        System.out.println("newDate = " + newDate);

        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replace("2", "00"));

        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replace("/", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("     ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }
}
