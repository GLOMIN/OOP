package DogOP;
public class Dog {

    private String name;
    private int old;
    private String gender;
    private int leg ;
    private String color;

    Dog(String name, int old, String gender,int leg, String color) {

        this.name = name;
        this.old = old;
        this.gender = gender;
        this.leg = 4;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

