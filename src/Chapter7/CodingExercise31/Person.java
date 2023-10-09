package Chapter7.CodingExercise31;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    /*public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }*/

    public void setAge(int age) {
        // if(age<0 || age>100) this.age=0;
        // this.age=age;
        this.age = (age < 0 || age > 100) ? 0 : age; // ternary operator
    }

    public boolean isTeen() {
        return age < 20 && age > 12;
    }

    /*public String getFullName() {
        if (getFirstName().isEmpty() && getLastName().isEmpty()) {
            return "";
        } else if (getLastName().isEmpty()) {
            return getFirstName();
        } else if (getFirstName().isEmpty()) {
            return getLastName();
        } else {
            return firstName + " " + lastName;
        }
    }*/

    public String getFullName() {
        // if(firstName.isEmpty() && lastName.isEmpty()) return "";
        // if(firstName.isEmpty()) return lastName;
        // if(lastName.isEmpty()) return firstName;
        // return firstName + " " + lastName;
        return (firstName.isEmpty() && lastName.isEmpty()) ? "" : (firstName.isEmpty()) ? lastName : (lastName.isEmpty()) ? firstName : firstName + " " + lastName; // ternary operator
    }
}
