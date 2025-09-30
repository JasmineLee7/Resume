// Jasmine Lee 2025
package state;
/**
 * OrderedState means the package has been placed but not shipped yet.  
 * It starts with a small wait time, and 20% of the time gets delayed. 
 */
public class OrderedState extends State{
    private int days = 2;

    /**
     * Makes an OrderedState for a package.  
     * @param pkg the package connected to this state
     */
    public OrderedState(Package pkg){
        super(pkg);
    }

    /**
     * Shows that the package is ordered.  
     * @return status string
     */
    public String getStatus(){
        return ("the "+pkg.getName()+pkg.getVerb(" is","s are")+" ordered");
    }

    /**
     * Gives the ETA for shipping time  
     * There’s a 20% chance it gets delayed by 1–3 days.  
     * @return ETA string, with delay info if it happens
     */
    public String getETA(){
        int delayChance = random.nextInt(10);
        int delayLength = random.nextInt(3)+1;
        
        // 20% chance
        if(delayChance<=1){
            days = days+delayLength;
            String delayMessage = ("The "+pkg.getName()+pkg.getVerb(" has","s have")+" experienced a slight delay in manufacturing.");
            String message = ("The "+pkg.getName()+pkg.getVerb("","s")+" will be shipped within "+days+" business days");
            return (delayMessage+"\n"+message);
        }
        else{
            return ("The "+pkg.getName()+pkg.getVerb("","s")+" will be shipped within "+days+" business days");
        }
    }
}
