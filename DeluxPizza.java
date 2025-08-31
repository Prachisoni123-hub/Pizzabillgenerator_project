// now for the delux pizza

public class DeluxPizza  extends Pizza{
    public DeluxPizza(boolean veg) { // constructor from the pizza class
        super(veg);
        // in this the cheese and toppings are default added there is no option for user
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {

    }

    @Override
    public void addExtraToppings() {

    }
}
