import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main (String[] args){
        Food meat = new Meat(5,100);
        Food apple = new Apple(10,50, Colour.RED);
        Food green = new Apple(8, 60, Colour.GREEN);
        Food[] food = {meat, apple,green};
        ShoppingCart cart = new ShoppingCart(food);
        System.out.println(cart.getAmountWithoutDiscount());
        System.out.println(cart.getAmountWithDiscount());
        System.out.println(cart.getAmountVegitarian());
    }
}
