/**
 * Created by RyanHarper on 9/27/17.
 */
// change Employee from a public class to an abstract class and make an abstract method
abstract class Employee extends Person {

    private double salary;

    public Employee(String name, double salary) {
        // super(name) calls the superclass constructor Person. But employee is different because it has a salary.
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    abstract public void work(); // I know employees work. But each employee does something different. Developer and Accountant for example
//    {
//        System.out.println(super.getName() + " says, I work");
//    }

    public void sayHello() {
        System.out.println("Hello, " + super.getName() + ", sappenin?");
//        System.out.println("test!");
    }

}

