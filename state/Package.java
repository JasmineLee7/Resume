// Jasmine Lee 2025
package state;
/**
* Package represents something being mailed.  
* It can be in different states: ordered, in transit, or delivered.  
* Each method here just shows the current status and ETA. 
*/
public class Package {
    private String name;
    private int quantity;
    OrderedState orderedState;
    InTransitState inTransitState;
    DeliveredState deliveredState;

    /**
     * Makes a new Package.  
     * @param name name of the item being shipped
     * @param quantity how many items are in the package
     */
    public Package(String name, int quantity){
        this.quantity = quantity;
        this.name = name;

        orderedState = new OrderedState(this);
        deliveredState = new DeliveredState(this);
        inTransitState = new InTransitState(this);
    }

    /**
     * Shows what happens when the package is ordered.  
     * @return status + ETA string
     */
    public String order(){
        return (orderedState.getStatus()+"\n"+orderedState.getETA());
    }

    /**
     * Shows what happens when the package is mailed.  
     * @return status + ETA string
     */
    public String mail(){
        return (inTransitState.getStatus()+"\n"+inTransitState.getETA());
    }
    
    public String received(){
        return (deliveredState.getStatus()+"\n"+deliveredState.getETA());
    }

    public void setState(State state){}

    /**
     * Gets the name of this package.  
     * @return the package’s name
     */
    public String getName(){
        return name;
    }

    /**
     * Picks between singular and plural depending on quantity.  
     * @param singular the word if there’s 1 item
     * @param plural the word if there’s more than 1
     * @return the right word based on quantity
     */
    public String getVerb(String singular, String plural){
        if(quantity==1){
            return singular;
        }
        else{
            return plural;
        }
    }
}
