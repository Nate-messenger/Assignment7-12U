/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nate_Messenger
 */
public class Sundae extends IceCream {

    private String topName;
    private int toppingCost;

    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        super(icName, icCost);
        this.topName = toppingName;
        this.toppingCost = toppingCost;
    }

    public String toString() {
        String fromIC = topName + " Sundae" + " with" + "\n";
        fromIC += super.getName();
        String totalC = super.cost + toppingCost + "";
        for (int i = 0; i < DessertShoppe.RECEIPT_WIDTH - (super.getName().length() + (totalC.length())) - 1; i++) {
            fromIC += " ";
        }
        fromIC += DessertShoppe.cents2dollarsAndCents(getCost());
        return fromIC;
    }
    
    public int getCost(){
        int cost = super.cost + toppingCost;
        return cost;
    }

}
