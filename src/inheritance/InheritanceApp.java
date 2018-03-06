package inheritance;

/**
 * Created by RyanHarper on 9/27/17.
 */
public class InheritanceApp {

    public static void main(String[] args) {

//        Employee ted = new Employee("ted", 40000); Can't be instantiated because Employee is an abstract method.

        Employee ryan = new Developer("Ryan", 60000);
        ryan.sayHello();
        ryan.work();

        Employee fer = new Accountant("Fer", 100000); // inherited.
        fer.sayHello(); // can use the Person method sayHello();
        fer.work(); /* fer is an Employee, so can use it. */

        Person luis = new Person("Luis"); // <= nothing inherited in this one. It's the superclass.
        luis.sayHello();
//        luis.work();  <= doesn't have access to the Employee method work();
        System.out.println("Luis is a Person who isn't Employed.");

        System.out.println("A baby says:");
        Baby lucy = new Baby("Lucy");
        lucy.cry();

        Superhero theManOfSteel = new Superhero("Clark Kent", "Superman");
        System.out.println(theManOfSteel.getSecretIdentity()); // "Clark Kent"
        System.out.println(theManOfSteel.getName());           // "Superman"

    }

}
