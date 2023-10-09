package Chapter7.POJOAndRecord;

public class Main {
    public static void main(String[] args) {
        /*for (int i = 1; i <= 5; i++) {
            Student s = new Student("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/"+"198"+i, "Java Masterclass");
            System.out.println(s);
        }
        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/"+"198"+i, "Java Masterclass");
            System.out.println(s);
        }*/
        Student pojoStudent = new Student("111", "Özge",
                "17/02/1997", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("222", "Özge 2",
                "17/02/1997", "Java Masterclass");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        //recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");

        System.out.println(pojoStudent.getName()+" is taking " +
                pojoStudent.getClassList());
        System.out.println(recordStudent.name()+" is taking " +
                recordStudent.classList());
    }
}
