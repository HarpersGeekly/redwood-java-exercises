import java.util.Scanner;

/**
 * Created by RyanHarper on 9/28/17.
 */
public class Developer extends Employee implements WritesCode, QA {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override // taking that method and overriding the actions.
    public void work() {
        System.out.println("Code code code");
    }

    // ============= From WritesCode Interface ==============
    @Override
    public Scanner[] writeCode(int numberOfLines) {
        System.out.println("Writes...");
        return new Scanner[0];
    }

    @Override
    public boolean debug(Scanner bug) {
        System.out.println("Kill bugs...");
        return false;
    }
    // ========== From QA Interface =========================
     @Override
    public boolean test(String code) {
        return false;
    }
}
