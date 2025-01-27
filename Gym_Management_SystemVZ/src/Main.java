public class Main {

    public static void main(String[] args) {
        Member freshMember = new Member(18, "Jurgis", 60);
        System.out.println(freshMember);
        System.out.println("");

        //Membership class (2 points) exercise. Run code bellow:
        //Membership membership = new Membership(5, 9);
        //The compiler should display an error.

        Membership membership = new MonthlyMembership(9, 30, 8);
        System.out.println(membership.getCost());
        System.out.println("");

        GymClass pilates = new GymClass("Pilates", "Tuesday 7PM", "");
        System.out.println(pilates);
        System.out.println("");

        pilates.enroll(new Member(157, "Michael", 55));
        System.out.println(pilates);
        System.out.println("");

//        pilates.enroll(new Member(28, "Ernesto", 81));
//        System.out.println(pilates);
//        System.out.println("");

        GymClass yoga = new GymClass("Yoga", "Friday 7PM", "");
        System.out.println(yoga);
    }

}