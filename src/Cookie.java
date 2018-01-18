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

    /***
     * constructor
     * @param name name for the super class
     * @param number how many are being bought
     * @param pricePer12 how much the cookies cost per dozen
     */
    public Cookie(String name, int number, int pricePer12) {
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    /***
     * formating
     * @return formating for the receipt
     */
    public String toString() {
        String p = pricePer12 + "";
        int spaces = DessertShoppe.RECEIPT_WIDTH - (super.getName().length() + p.length());
        String output = number + " @ $" + DessertShoppe.cents2dollarsAndCents((int)pricePer12) + " /dz" + "\n";
        output += super.getName();
        for (int i = 0; i < spaces+1; i++) {
            output += " ";
        }
        output += DessertShoppe.cents2dollarsAndCents(getCost());

        return output;
    }

    /***
     * calculations for cost
     * @return the cost of the item in cents
     */
    @Override
    public int getCost() {
        double numberC = pricePer12 / 12;
        double cost = number * numberC;

        cost = Math.ceil(cost);
        return (int) cost;
    }

}
