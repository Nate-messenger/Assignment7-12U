/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nate_Messenger
 */
public class IceCream extends DessertItem {

    public int cost;

    public IceCream(String name, int cost) {
        super(name);

        this.cost = cost;
    }

    public String toString() {

        String p = cost + "";
        int spaces = DessertShoppe.RECEIPT_WIDTH - (super.getName().length() + p.length());

        String output = super.getName();
        for (int i = 0; i < spaces - 1; i++) {
            output += " ";
        }
        output += DessertShoppe.cents2dollarsAndCents(getCost());

        return output;

    }

    @Override
    public int getCost() {
        return cost;
    }

}
