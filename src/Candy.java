/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nate_Messenger
 */
public class Candy extends DessertItem {

    private double weight;
    private int pricePerLbs;

    public Candy(String name, double weight, int pricePerLbs) {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    public String toString() {
        String p = getCost() +"" ;
        String output = weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(pricePerLbs) + " /Lb." + "\n";
        output += super.getName();
        int spaces = DessertShoppe.RECEIPT_WIDTH - (super.getName().length() + p.length());
        for (int i = 0; i < spaces -1 ; i++) {
            output += " ";
        }
        output += DessertShoppe.cents2dollarsAndCents(getCost());

        return output;
    }

    @Override
    public int getCost() {
        double cost = weight * pricePerLbs;

        cost = Math.round(cost);
        return (int) cost;

    }

}
