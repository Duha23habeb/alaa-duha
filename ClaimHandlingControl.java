package shieldcare;
public class ClaimHandlingControl {
    private static final double VEHICLE_DAMAGE_THRESHOLD = 20000.0;
    public void verifyAndAssign(Claim claim, Policy policy, boolean documentsComplete){
        if(!policy.isActive()){ claim.setStatus("Rejected"); return; }
        if(!documentsComplete){ claim.setStatus("Waiting for Documents"); return; }
        if(claim.isUrgent()) claim.setStatus("Priority - Coordinator Assigned");
        else claim.setStatus("Coordinator Assigned");
        if(claim.requiresAppraiser(VEHICLE_DAMAGE_THRESHOLD)) claim.setStatus("Waiting for Appraiser");
    }
    public void suspendClaim(Claim claim){ claim.setStatus("Suspended"); }
    public void reactivateClaim(Claim claim){ claim.setStatus("Under Claim Review"); }
}
