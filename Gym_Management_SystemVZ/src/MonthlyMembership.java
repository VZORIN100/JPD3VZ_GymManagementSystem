public class MonthlyMembership extends Membership {

    private static final int membershipId = 9;
    private static final int memberId = 0;
    private int price;
    private int duration;

    public MonthlyMembership(int membershipId, int price, int duration) {
        super(membershipId);
        this.price = price;
        this.duration = duration;
    }

    @Override
    public String getCost() {
        return "Cost: " + price * duration + ", Duration: " + duration + " months";
    }
}
