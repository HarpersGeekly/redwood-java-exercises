package DiceRolling;

/**
 * Created by RyanHarper on 1/9/17.
 */
public class Die {
    //The die class is a blueprint for all dice.
    //the die class should hae variables that represent the data for each individual die.
    //class should have the behavior (methods) that a single die can do

    public int numberOfSides;
    public int currentFaceValue;

    //create a die constructor, same name as Class, should only be named with a capital letter => best practice).
    public Die(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    // roll the die
    public int roll() {
        // generate a random number between 1 and this die's number of sides
        currentFaceValue = (int) Math.ceil(Math.random() * numberOfSides);
        //return that random roll
        return currentFaceValue;
    }
}
