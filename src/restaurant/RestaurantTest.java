package restaurant;

public class RestaurantTest {

    public static void main(String[] args) {

        RestaurantDish dish = new RestaurantDish(25, "cheap dish", false);

        System.out.println("cost: " + dish.getCostInCents() + " cents...");
        System.out.println("name: " + dish.getNameOfDish());
        System.out.println("Would recommend? " + dish.isWouldRecommend());
        dish.eat();
    }
}
