package fileHandling;

import validator.FileHandler;
import validator.Validator;
import java.util.List;
/**
 * Created by RyanHarper on 10/4/17.
 */
public class ContactsTestApp {

    private static Validator validator = new Validator();
    private static FileHandler fileHandler = new FileHandler("data", "contacts.txt");
    private static List<String> contacts = fileHandler.retrieveFileContents();

    public static void main(String[] args) {

        do {
            showMainMenu();
        } while (validator.yesNo("Main Menu? Y/N"));
        fileHandler.writeToFile(contacts);
        System.out.println("Goodbye.");
    }

    // ============================================== METHODS ==========================================================

    private static void showMainMenu() {

        System.out.println("[1] View contacts");
        System.out.println("[2] Add a new contact");
        System.out.println("[3] Search a contact by name.");
        System.out.println("[4] Delete an existing contact.");
        System.out.println("[5] Exit.");

        int userInput = validator.getIntWithinRange("Enter an option (1, 2, 3, 4 or 5):", 1, 5);

        switch (userInput) {
            case (1):
                viewAllContacts(contacts);
                break;
            case (2):
                addNewContact(contacts, validator);
                break;
            case (3):
                searchByName(contacts, validator);
                break;
            case (4):
                deleteContact(contacts, validator);
                break;
            case (5):
                fileHandler.writeToFile(contacts);
                System.out.println("Goodbye.");
                System.exit(0);
            default:
                break;
        }
    }

    private static void viewAllContacts(List<String> contacts) {

        System.out.println("Viewing All Contacts");
        System.out.println("Name | Phone Number");
        System.out.println("-------------------");
        for (String contact : contacts) {
            System.out.println(contact);
        }
    }

    private static void addNewContact(List<String> contacts, Validator validator) {

        do {
            String contactName = validator.getString("Add Contact Name (\"exit\" to cancel): ");
            if (contactName.equalsIgnoreCase("exit")) {
                showMainMenu();
                break;
            }
            String contactPhoneNumber = validator.getPhoneNumber("Add Phone Number for Contact(xxx)xxx-xxxx:");
            contacts.add(contactName + " | " + contactPhoneNumber.replaceFirst("(\\d{3})(\\d{3})(\\d{4})", "($1) $2-$3"));
            System.out.println(contactName + " | " + contactPhoneNumber.replaceFirst("(\\d{3})(\\d{3})(\\d{4})", "($1) $2-$3"));

        } while (validator.yesNo("Add another contact? Y/N"));
    }

    private static void searchByName(List<String> contacts, Validator validator) {

        do {
            String contactName = validator.getString("Enter contact name to search (\"exit\" to cancel): ");
            if (contactName.equalsIgnoreCase("exit")) {
                showMainMenu();
            }
            for (String contact : contacts) {
                if (contact.contains(contactName)) {
                    System.out.println(contact);
                }
            }
        } while (validator.yesNo("Search another contact? Y/N"));
    }

    private static void deleteContact(List<String> contacts, Validator validator) {

        do {
            String contactName = validator.getString("Enter contact name (\"exit\" to cancel):");
            if (contactName.equalsIgnoreCase("exit")) {
                showMainMenu();
                break;
            }
//            for (String contact : contacts) {
//                if (!contact.contains(contactName)) {
//                    System.out.println("There is no contact with name: " + contactName);
//                    deleteContact(contacts, validator);
//                }
//                break;
//            }
            contacts.removeIf(contact -> {
                if (contact.contains(contactName) && validator.yesNo("Delete " + contact + ", Y/N?")) {
                    System.out.println("The contact, " + contact + " has been deleted.");
                    return true;
                } else {
                    return false;
                }
            });
        } while (validator.yesNo("Delete another contact? Y/N"));

    }
}

//============================================ Initial Instructions ====================================================
//    Contacts Manager

//    We will be building a command line application for keeping track of "contacts", a name and phone number combination.

//        The application should be able to:
//
//        Show all your contacts
//        Add a new contact
//        Search a contact by her name
//        Delete an existing contact
//        The application should keep its data in a file named contacts.txt so that the information persists between runs of the application.
//
//        How you implement the above functionality is ultimately up to you, but here are a few thoughts to get you started.
//
//        The text file should contain one contact per line
//        When the application starts, the contact list should be read from the file.
//        Before the application exits, the contacts file should be rewritten.
//        The user interface for your application should include a main menu like the following, where the user will need to enter a number between 1 and 5.
//
//        1. View contacts.
//        2. Add a new contact.
//        3. Search a contact by name.
//        4. Delete an existing contact.
//        5. Exit.
//        Enter an option (1, 2, 3, 4 or 5):
//        The contacts information should be shown using the following format
//
//        Name | Phone number
//        ---------------
//        Jack Blank | 1231231234
//        Jane Doe | 2342342345
//        Sam Space | 3453453456
//        Here is what the code for your application might look like:
//
//        Load all of the contacts by calling a method that returns a List of Contact objects.
//        Call a method that shows the user the main menu and returns their choice of action.
//        Using the user's choice from the previous step, call a method that performs that action (modifying the contents of the List of Contact objects if applicable).
//        Keep calling the method from step two until the user chooses to exit.
//        Once the user chooses to exit, re-write the contents of the contacts.txt file using the List of Contact objects.
//        Bonus
//
//        Format the phone numbers using dashes
//        So instead of 8675309, your output should display 867-5309
//        Allow formatting phone numbers with different lengths. For example, phone numbers can have 10 or 7 digits. You can be even more creative here and allow international phone numbers.
//        Warn the user when she tries to enter a contact with an existing name.
//
//        There's already a contact named Jane Doe. Do you want to overwrite it? (Yes/No)
//        If the answer is No allow the user to enter the information again.
//
//        Format the output of the contacts, so that all of the columns have the same width.
//
//        Name       | Phone number |
//        ---------------------------
//        Jack Blank | 210-567-8923 |
//        Jane Doe   | 789-8902     |
//        Sam Space  | 210-581-8123 |
//        Hint: you can use format strings with the System.our.printf or String.format methods to ensure the columns have the same width.

// deleteMethod(): alternative?
//       contacts.removeIf(contact -> contact.contains(contactName) && validator.yesNo("Delete " + contact + ", Y/N?"));
//       System.out.println("The contact, " + contactName  + ", has been removed.");
//       fw.writeToFile(contacts); // couple this with removeIf()