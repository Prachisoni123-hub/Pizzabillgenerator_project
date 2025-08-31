public class Main {
    public static void main(String[] args) {
      // Pizza basePrice = new Pizza(true);
        // asePizza.addExtraToppings


        DeluxPizza dp = new DeluxPizza(false);
        dp.takeAway();
        dp.addExtraCheese();
        dp.addExtraToppings();
        dp.getBill();
    }
}