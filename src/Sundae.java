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

    /***
     * constructor
     * @param icName name of the Ice cream for the super class
     * @param icCost coat of the Ice cream for the super class
     * @param toppingName name of the toping
     * @param toppingCost coat of the toping
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        super(icName, icCost);
        this.topName = toppingName;
        this.toppingCost = toppingCost;
    }

    /***
     * formating 
     * @return format for the receipt
     */
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
    
    /***
     * calculations for the cost of the sundae
     * @return total cost of sundae in cents
     */
    public int getCost(){
        int cost = super.cost + toppingCost;
        return cost;
    }

}
