package shapes;

import java.text.DecimalFormat;

/**
 * Created by RyanHarper on 9/25/17.
 */
// =================================================  Circle class  ====================================================

public class Circle {

    private double radius;
    public static int numberOfCirclesMade;

    // ======= Constructor Method ======================

    public Circle(double radius){
        this.radius = radius;
        numberOfCirclesMade++;
    }

    //========== Methods ===============================

    public double getArea() {
        return Math.PI * (radius * radius);
    }

    public double getAreaWithoutFormat(double x) {
        return Math.PI * (x * x);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String formatNumber(double number) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(number);
    }

    public String getFormattedCircumference() {
        return formatNumber(getCircumference());
    }

    public String getFormattedArea() {
        return formatNumber(getArea());
    }
}


