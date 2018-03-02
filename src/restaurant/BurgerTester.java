package restaurant;

public class BurgerTester {
    public static void main(String[] args) {

        BurgerTools.averageDaysBeforeExpiration = 7;
        BurgerTools.mostPopularTopping = "cheese";
        BurgerTools.temperatureWhenCooked = 400;

        System.out.println(BurgerTools.averageDaysBeforeExpiration);
        System.out.println(BurgerTools.mostPopularTopping);
        System.out.println(BurgerTools.temperatureWhenCooked);
        BurgerTools.grill();
    }
}

//        Create a class called BurgerTester to test assigning and printing property values
//        and testing methods.
//        If you have time, add additional properties and methods.