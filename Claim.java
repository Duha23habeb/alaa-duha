package shieldcare;
import java.util.*;
public class Claim {
    private String claimId;
    private String policyNumber;
    private String incidentType;
    private double damageAmount;
    private String status;
    private final List<ClaimForm> forms = new ArrayList<>();
    private final List<ThirdPartyInteraction> interactions = new ArrayList<>();
    public Claim(String claimId, String policyNumber, String incidentType, double damageAmount) {
        this.claimId = claimId; this.policyNumber = policyNumber; this.incidentType = incidentType; this.damageAmount = damageAmount; this.status = "Initial Claim Request";
    }
    public String getClaimId(){return claimId;}
    public String getPolicyNumber(){return policyNumber;}
    public String getIncidentType(){return incidentType;}
    public double getDamageAmount(){return damageAmount;}
    public String getStatus(){return status;}
    public void setStatus(String status){this.status=status;}
    public boolean isUrgent(){return "Urgent".equalsIgnoreCase(incidentType) || "Casualty".equalsIgnoreCase(incidentType);}
    public boolean requiresAppraiser(double threshold){return "VehicleDamage".equalsIgnoreCase(incidentType) && damageAmount > threshold;}
    public List<ClaimForm> getForms(){return forms;}
    public List<ThirdPartyInteraction> getInteractions(){return interactions;}
}
