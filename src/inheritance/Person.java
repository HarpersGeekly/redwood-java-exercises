package inheritance;

/**
 * Created by RyanHarper on 9/25/17.
 */
//    =========================================   Object basics ========================================================

//    Create inheritance.Person class inside of src that has a private name property that is a string.
public class Person {

    private String name;

//      The class should have a constructor that accepts a string value and sets the person's name to the passed string.
//  ============================================== constructor =========================================================

    public Person(String name) {
        this.name = name;
    }

// =================================================  methods ==========================================================
    // a method that returns the person's name

    public String getName() {
        return name;
    }

    // a method that changes the name property to the passed value
    public void setName(String name) {
        this.name = name; // this refers to the property of the object in the scope.
        // reassigning the name parameter.
    }

    // a method that prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("Hello, " + name + ", nice to see you!");
    }

//        Create a main method on the class that creates a new inheritance.Person object and tests the above methods.
//  ========================================== inheritance.Person's Main Method ====================================================

    public static void main(String[] args) {

        Person ryan = new Person("Ryan");

        System.out.println(ryan);
        System.out.println(ryan.getName());
        ryan.setName("Harper");
        ryan.sayHello();
        System.out.println(ryan.getName());
        ryan.setName("Ryan");
        ryan.sayHello();
        System.out.println(ryan.getName());
        System.out.println(ryan);

//  =========================================   Understanding references  ==============================================
//        The following code blocks make use of the inheritance.Person class from the previous exercise. For each code block, think about what the code will output, then copy the code into intellij and run it to see if it matches your expectation.
//
//        inheritance.Person person1 = new inheritance.Person("John");
//        inheritance.Person person2 = new inheritance.Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); //true
//        System.out.println(person1 == person2); // false
//
//        inheritance.Person person1 = new inheritance.Person("John");
//        inheritance.Person person2 = person1;
//        System.out.println(person1 == person2); // true
//
//        inheritance.Person person1 = new inheritance.Person("John");
//        inheritance.Person person2 = person1;

//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName()); // John John Jane Jane

    }
}