/**
 * Created by RyanHarper on 9/25/17.
 */
    // public = anyone has access to this class/attribute/function
    // private = no-one can see this class/attribute/function. Kinda like in the real world.
    // should the user be able to change it? What can the user use out of this object?
    // We start thinking about a client and a server. The client is an object that calls a method on another object.
// and the server is an object that does an operation on behalf of another object. We've been doing this already:

    // objects talk to each other and collaborate! like System.out.println. or PrintStream out = System.out.
// Scanner and System are the server (service to help me do something)... and I'm the client
    //

    // how do you want the client to use this class?
public class PersonLecture {
// (Remember, we use block scope in Java. These variables are available within the inheritance.Person code block.)
    private String firstName; // local variable.
    private String lastName;
    public static int population = 0; //shared

    //constructor method showing use of both a ".this" or an "aSomething"
    public /* no return type */ PersonLecture /* the same as the class name */(String firstName, String aLastName) {
        this.firstName = firstName;
        lastName = aLastName; // using ".this", this.firstName = firstName, makes it so the constructor knows that it's the firstName from the inheritance.Person class.
        // But some Java developers will declare aFirstName, aLastName to mitigate using ".this"
        // ".this" should only be used when the parameters are the same as the class variables, as seen above
        population++;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }
}

