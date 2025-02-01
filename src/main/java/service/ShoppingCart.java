package service;
import model.Food;

public class ShoppingCart{
    Food[] food;
    public ShoppingCart(Food[] food){
        this.food=food;
    }

    public double getAmountWithoutDiscount() {
        double result = 0;
        for (int i = 0; i< food.length; i++)
        {
            result=result+food[i].getAmount()*food[i].getPrice();
        }
        return result;
    }

    public double getAmountWithDiscount(){
        double result=0;
        for (int i = 0; i< food.length; i++)
        {
            if (food[i].getDiscount()==0) {
                result = result+food[i].getAmount() * food[i].getPrice();
            }
            else result = result+food[i].getAmount()*food[i].getPrice()-food[i].getAmount()*food[i].getPrice()*food[i].getDiscount()/100;
        }
        return result;
    }

    public double getAmountVegitarian(){
        double result=0;
        for (int i=0; i<food.length;i++){
            if(food[i].getIsVegetarian()){
                result= food[i].getAmount()*food[i].getPrice();
            }
        }
        return result;
    }
}
