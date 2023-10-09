package Chapter7.ConstructorChallenge;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        System.out.println("->Name= " + customer1.getName() +
                " ->Limit= " + customer1.getCreditLimit() +
                " ->Email= " + customer1.getEmail());
        Customer customer2 = new Customer("Oz", "ozge@cn.com");
        System.out.println("->Name= " + customer2.getName() +
                " ->Limit= " + customer2.getCreditLimit() +
                " ->Email= " + customer2.getEmail());
        Customer customer3 = new Customer("Ozg", 333.33, "ozg@cn.com");
        System.out.println("->Name= " + customer3.getName() +
                " ->Limit= " + customer3.getCreditLimit() +
                " ->Email= " + customer3.getEmail());
    }
}
