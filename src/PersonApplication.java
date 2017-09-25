/**
 * Created by RyanHarper on 9/25/17.
 */
public class PersonApplication {
    public static void main(String[] args) {

        Person person = new Person("Ryan", "Harper"); // new Person() is a default constructor for every class definition you create.

//        person.firstName = "Ryan"; If the Person class has private variables, these two aren't valid anymore.
//        person.lastName = "Harper";

        System.out.println(person.fullName()); 

        // API = Application Programming Interface
        // REST API - Remote Program
        // Object API. Every time you create an object you're creating an API, defining how your users will use an object.
            // Any public attribute/method.


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
