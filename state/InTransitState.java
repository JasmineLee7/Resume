// Jasmine Lee 2025
package state;
/**
 * InTransitState means the package has shipped and is on the way.  
 * It usually takes a few days but can also face shipping delays. 
 */
public class InTransitState extends State{
    private int days = 5;

    /**
     * Makes an InTransitState for a package.  
     * @param pkg the package connected to this state
     */
    public InTransitState(Package pkg){
        super(pkg);
    }

    /**
     * Shows that the package is in transit.  
     * @return status string
     */
    public String getStatus(){
        return ("The "+pkg.getName()+pkg.getVerb(" is","s are")+" in transit");
    }

    /**
     * Gives the ETA for arrival.  
     * There’s a 30% chance it gets delayed by 1–7 days.  
     * @return ETA string, with delay updates if it happens
     */
    public String getETA(){
        int delayChance = random.nextInt(10);
        int delayLength = random.nextInt(7)+1;
       
        // 30% chance
        if(delayChance<=2){
            days = days+delayLength;
            String delayMessage = ("The "+pkg.getName()+pkg.getVerb(" has","s have")+" experienced a delay in shipping");
            String message = ("The "+pkg.getName()+pkg.getVerb("","s")+" should arrive within "+days+" business days.");
            return (delayMessage+"\n"+message);
        }
        else{
            return ("The "+pkg.getName()+pkg.getVerb("","s")+" will arrive within "+days+" business days");
        }
    }
}
