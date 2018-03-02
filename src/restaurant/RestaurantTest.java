package restaurant;

public class RestaurantTest {

    public static void main(String[] args) {

        RestaurantDish dish = new RestaurantDish();
        RestaurantDish dish2 = new RestaurantDish(10, "cheapDish", false );

        dish.setNameOfDish("delishDish");
        dish.setWouldRecommend(false);
        dish.setCostInCents(50);

        System.out.println("cost: " + dish.getCostInCents() + " cents...");
        System.out.println("name: " + dish.getNameOfDish());
        System.out.println("Would recommend? " + dish.isWouldRecommend());
        dish.eat();
    }


}
