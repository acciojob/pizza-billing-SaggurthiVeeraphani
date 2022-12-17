package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill ;

    private int ExtraCheese = 80;
    private int Takeaway = 20;
    private int Veg_pizza_base_price = 300;
    private int Non_Veg_pizza_base_price = 400;
    private int VegTopping = 70;
    private int Non_VegTopping = 120;

    boolean addExtraCheese = false;
    boolean addExtraToppings = false;
    boolean getBill = false;
    boolean takeaway = false;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg == true){
            this.price = this.price + Veg_pizza_base_price;
        }
        else{
            this.price = this.price + Non_Veg_pizza_base_price;
        }
        this.bill = "Base Price Of The Pizza: " + price + "\n";
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
     if(addExtraCheese == false){
         price = price + ExtraCheese;
         addExtraCheese = true;
     }
    }

    public void addExtraToppings(){
        if(addExtraToppings==false){
            if(isVeg==true)
                 price = price+ VegTopping;
            else
                price = price + Non_VegTopping;
            addExtraToppings = true;
        }
    }

    public void addTakeaway(){
        if(takeaway == false) {
            price = price + Takeaway;
            takeaway = true;
        }
    }

    public String getBill(){
        if(getBill == false){
            if(addExtraCheese == true)
                this.bill = this.bill + "Extra Cheese Added: " + ExtraCheese +"\n";
            if(addExtraToppings == true){
                if(isVeg==true)
                    this.bill = this.bill + "Extra Toppings Added: " + VegTopping + "\n";
                else
                    this.bill = this.bill + "Extra Toppings Added: " + Non_VegTopping + "\n";
            }
            if(takeaway == true)
                this.bill = this.bill + "Paperbag Added: " + Takeaway + "\n";
            this.bill = this.bill + "Total Price: " + price + "\n";
            getBill = true;
        }
        return this.bill;
    }
}
