/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nate_Messenger
 */
public class Cookie extends DessertItem {

    private int number;
    private double pricePer12;

    public Cookie(String name, int number, int pricePer12) {
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    public String toString() {
        String p = pricePer12 + "";
        System.out.println();
        int spaces = DessertShoppe.RECEIPT_WIDTH - (super.getName().length() + p.length());
        String output = number + " @ $" + DessertShoppe.cents2dollarsAndCents((int)pricePer12) + " /dz" + "\n";
        output += super.getName();
        for (int i = 0; i < spaces+1; i++) {
            output += " ";
        }
        output += DessertShoppe.cents2dollarsAndCents(getCost());

        return output;
    }

    @Override
    public int getCost() {
        double numberC = pricePer12 / 12;
        double cost = number * numberC;

        cost = Math.ceil(cost);
        return (int) cost;
    }

}
