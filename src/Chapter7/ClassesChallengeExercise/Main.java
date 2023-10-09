package Chapter7.ClassesChallengeExercise;

public class Main {
    public static void main(String[] args) {
        /*Account bobsAccount = new Account("12345", 1000.00,
                "Bob Brown", "myemail@bob.com", "(087) 123-4567");*/

        Account bobsAccount = new Account(); //create instance
        System.out.println(bobsAccount.getAccountNumber()); //call instance method
        System.out.println(bobsAccount.getAccountBalance());
        /*bobsAccount.setAccountNumber("12345");
        bobsAccount.setAccountBalance(1000.00);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setEmail("myemail@bob.com");
        bobsAccount.setPhoneNumber("(087) 123-4567");*/

        bobsAccount.withdrawingFundsAccount(100.0);
        bobsAccount.depositingFundsAccount(250);
        bobsAccount.withdrawingFundsAccount(50);

        bobsAccount.withdrawingFundsAccount(200);

        bobsAccount.depositingFundsAccount(100);
        bobsAccount.withdrawingFundsAccount(45.55);
        bobsAccount.withdrawingFundsAccount(54.46);
        bobsAccount.withdrawingFundsAccount(54.45);

        Account timsAccount = new Account("Tim",
                "tim@email.com", "12345");
        System.out.println("AccountNo: " + timsAccount.getAccountNumber() +
                "; name " + timsAccount.getCustomerName());

        //Reference
        Account ozgeAccount = timsAccount;
        System.out.println("özge " + ozgeAccount.getCustomerName());
        //static method
        hello();
        Account.staticMethod();


    }

    public static void hello(){
        System.out.println("hello");
    }
}
