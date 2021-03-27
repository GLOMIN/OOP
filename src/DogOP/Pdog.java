package DogOP;
public class Pdog {
    
    public static void main(String[] args){

        Dog dogy1 = new Dog("yugy",10,"Male",4,"brown");
        System.out.println("Name Dog : " + dogy1.getName());
        System.out.println("Name Old : " + dogy1.getOld());
        System.out.println("Name Gender : " + dogy1.getGender());
        System.out.println("Name Leg : " + dogy1.getLeg());
    }
}
