package shieldcare;
public class ReimbursementControl {
    public boolean checkEligibility(Claim claim){
        boolean formsApproved = claim.getForms().stream().allMatch(ClaimForm::isApproved);
        boolean thirdPartyDone = claim.getInteractions().stream().allMatch(ThirdPartyInteraction::isCompleted);
        return formsApproved && thirdPartyDone;
    }
    public void processReimbursement(Claim claim, ReimbursementPayment payment){
        if(!checkEligibility(claim)) { claim.setStatus("Reimbursement Blocked"); return; }
        payment.markProcessed(); claim.setStatus("Done");
    }
}
