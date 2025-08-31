import java.sql.SQLOutput;

public class Pizza {
    private int price;
    private boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingPrice = 150;
    private int BackPackPrice = 20;
    private  int basePizzaPrice = 20;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedforTakeaway = false;



    public Pizza(boolean veg) {// either pizza is veg or nonveg
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }else{
            this.price = 400;
            // means this has a nonveg pizza
        }
        basePizzaPrice = this.price;
    }
    // for extra toppins
    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        // if extra cheese is added then we have to increase the price by 100rs
        this.price += extraCheesePrice;
    }
    public void addExtraToppings(){
        isExtraToppingsAdded = true;
        this.price += extraToppingPrice;
    }
    public void takeAway(){
        isOptedforTakeaway = true;
        this.price +=BackPackPrice;
    }
public void getBill(){
        String bill = "";
    System.out.println("Pizza" + basePizzaPrice);
    if(isExtraCheeseAdded){
        bill += "Extra cheese added" +extraCheesePrice + "\n";
    }
    if(isExtraToppingsAdded) {
        bill += "Extra Toppings added" + extraToppingPrice + "\n";
    }
    if(isOptedforTakeaway) {
        bill += "Take away" + BackPackPrice + "\n";

    }
    // adding total price of all
    bill +=" Bill : " +this.price+ "\n";
    System.out.println(bill);
    }

}
