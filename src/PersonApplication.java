/**
 * Created by RyanHarper on 9/25/17.
 */
public class PersonApplication {
    public static void main(String[] args) {

        Person person = new Person("Ryan", "Harper"); // new Person() is a default constructor for every class definition you create.

//        person.firstName = "Ryan"; If the Person class has private variables, these two aren't valid anymore.
//        person.lastName = "Harper";

        System.out.println(Person.population);
        Person zach = new Person("Zach", "Guilde");
        System.out.println(Person.population);

        // API = Application Programming Interface
        // REST API - Remote Program
        // Object API. Every time you create an object you're creating an API, defining how your users will use an object.
        // Any public attribute/method.

        // I don't need to create an instance of Arithmetic because the method is class level or static (I don't need a state, so I don't need an object)
        System.out.println(Arithmetic.addition(6, 89)); // function.
        System.out.println(Arithmetic.subtract(6, 89));

        Student student = new Student("Fernando");
        Student enrolledStudent = new Student("Justin", "Redwood");

        // 2 types of messages: questions and commands.
        // a question: are you enrolled?
        if (student.isEnrolled()) {
            // a command: get me your cohort.
            System.out.println(student.getCohort());
        }

        if (enrolledStudent.isEnrolled()) {
            System.out.println(enrolledStudent.getCohort());
        }

    }
}
