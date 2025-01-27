public class Member {
    private static int id;
    private String name;
    private static int age;

    public Member(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    //@Override
    public String toString() {
        return this.id + ": " + this.name + ", Age: " + this.age;
    }


}




