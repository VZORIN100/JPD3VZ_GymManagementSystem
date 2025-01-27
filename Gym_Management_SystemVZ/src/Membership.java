abstract public class Membership {

    private int membershipId;
    private int memberId;

    public Membership(int membershipId) {
        this.membershipId = membershipId;
    }


    public abstract String getCost();

//    @Override
//    public int toString() {
//        return memberId + membershipId;
//    }


}