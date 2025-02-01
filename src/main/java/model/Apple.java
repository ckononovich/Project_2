package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food{
    private String color;

    public Apple(int amount, double price, String color){
        this.amount=amount;
        this.price=price;
        this.color=color;
        isVegetarian=true;
    }

    public double getColor(){
        if (color.equals(Colour.RED)){
            return Discount.DISCOUNT;
        }
        return getDiscount();
    }
}
