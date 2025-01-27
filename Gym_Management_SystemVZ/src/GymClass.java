public class GymClass {
    private String className;
    private String schedule;
    private String enrolledMembers;

    public GymClass(String className, String schedule, String enrolledMembers) {
        this.className = className;
        this.schedule = schedule;
        this.enrolledMembers = enrolledMembers;
    }

    @Override
    public String toString() {
        return this.className + " (" + this.schedule + "): " + this.enrolledMembers;

    }

    //@Override
    public String enroll(Member Michael) {
        return this.className + " (" + this.schedule + ") :" + this.enrolledMembers;
    }
}
