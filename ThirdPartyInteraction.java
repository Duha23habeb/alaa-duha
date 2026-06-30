package shieldcare;
public class ThirdPartyInteraction {
    private String interactionId;
    private String partyType;
    private String status;
    public ThirdPartyInteraction(String interactionId, String partyType, String status){this.interactionId=interactionId; this.partyType=partyType; this.status=status;}
    public boolean isCompleted(){return "completed".equalsIgnoreCase(status);}
}
