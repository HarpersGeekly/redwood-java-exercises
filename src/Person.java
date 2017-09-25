/**
 * Created by RyanHarper on 9/25/17.
 */
    // public = anyone has access to this class/attribute/function
    // private = no-one can see this class/attribute/function. Kinda like in the in the real world.
    // should the user be able to change it? What can the user use out of this object?
    // We start thinking about a client and a server. The client is an object that calls a method on another object.
// and the server is an object that does an operation on behalf of another object. We've been doing this already:

    // objects talk to each other and collaborate! like System.out.println. or PrintStream out = System.out.
// Scanner and System are the server (service to help me do something)... and I'm the client
    //

    // how do you want the client to use this class?
public class Person {

// (block scope in Java. These variables are available within the Person code block.)
    private String firstName;
    private String lastName;

    //constructor method:
    public /* no return type */ Person /* the same as the class */(String aFirstName, String aLastName) {
        firstName = aFirstName;
        lastName = aLastName; // using ".this" like this.lastName = lastName, knows that its's the lastName from the Person class.
        // But some Java developers will declare aFirstName, aLastName to mitigate .this
        // ".this" should only be used when the parameters are the same as the class variables.
    }

    public String fullName() {
        return firstName + " " + lastName;
    }
}

