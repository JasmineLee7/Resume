// Jasmine Lee 2025
package state;

import java.util.Random;
/**
 * State is the abstract base for all the package states.  
 * Each state (ordered, in transit, delivered) will extend this class.  
 * It holds the package reference and a random number generator for delays. 
 */
public abstract class State {
    protected Package pkg;
    protected Random random;

    /**
     * Makes a State tied to a specific package.  
     * Also sets up a random number generator to use for ETA and delays.  
     * @param pkg the package this state belongs to
     */
    public State(Package pkg){
        this.pkg = pkg;
        this.random = new Random();
    }

    public abstract String getStatus();


    public abstract String getETA();
}
