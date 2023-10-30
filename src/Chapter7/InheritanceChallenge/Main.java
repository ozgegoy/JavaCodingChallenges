package Chapter7.InheritanceChallenge;

public class Main {
    public static void main(String[] args) {
        Employee ozge = new Employee("Özge", "17/02/1997",
                "11/07/2023");
        System.out.println(ozge);
        System.out.println("Age: " + ozge.getAge());
        System.out.println("Pay: " + ozge.collectPay());

        Employee joe = new Employee("Joe", "11/11/1990",
                "03/03/2020");
        System.out.println(joe);

        SalariedEmployee joe2 = new SalariedEmployee("Joe", "11/11/1990",
                "03/03/2020", 35000);
        System.out.println(joe2);
        System.out.println("Joe's Paycheck = $" + joe2.collectPay());
        joe2.retire();
        System.out.println("Joe's Pension check = $" + joe2.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970",
                "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }
}
