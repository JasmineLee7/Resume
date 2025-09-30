// Jasmine Lee 2025
package state;
/*
 * The delivered state class extends from the state class
 * "delivered" is a state that a package can be in, in this state the status
 * is sent as "arrived" and the getETA is not neccesary as it has arrived but
 * another display of getVerb method, and is described in the assignment details and UML.
 */
public class DeliveredState extends State {
    
    /**
     * Makes a DeliveredState for a package.  
     * @param pkg the package tied to this state
     */
    public DeliveredState(Package pkg){
        super(pkg);
    }

    /**
     * Shows that the package has been delivered.  
     * @return status string
     */
    public String getStatus(){
        return ("The "+pkg.getName()+pkg.getVerb(" has","s have")+" arrived");
    }

    /**
     * As mentioned in the assignment video, this method is not neccesary, but since its included in the UML and Assignment info
     * it is bring included and called, as another exacmple of the getVerb method.   
     * @return ETA message confirming arrival
     */
    public String getETA(){
        return ("The "+pkg.getName()+pkg.getVerb(" is","s are")+" here");
    }
}
