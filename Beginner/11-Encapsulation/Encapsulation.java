package Beginner;

import Beginner.AccessControl;

public class Encapsulation {

    public static void main(String[] args) {

        // Encapsulation = 	attributes of a class will be hidden or private,
        //					Can be accessed only through methods (getters & setters)
        //					You should make attributes private if you don't have a reason to make them public/protected

        AccessControl car = new AccessControl("Chevrolet","Corvette",2021); // Args to fill for manufacturer, model and year
        AccessControl car2 = new AccessControl("Toyota","Supra",1998);

        car.setYear(2022); // This allows you to change the value through the setter

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}
