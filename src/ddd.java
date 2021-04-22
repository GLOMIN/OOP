public class ddd {
    public static void main(String[] args) {
        Artist art = new Artist("Marcus", 20);
        Athlete ath = new Athlete("Danny", 25);

        art.genre = "Trip Hop";
        ath.sport = "Football";

        art.introduce();
        art.playMusic();

        System.out.println();

        ath.introduce();
        ath.playSport();
    }
}

class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("My name is " + name);
    }
}

class Artist extends Person {
    String genre;

    public Artist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void playMusic() {
        System.out.println(name + " is playing " + genre + " music.");
    }
}

class Athlete extends Person {
    String sport;

    public Athlete(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void playSport() {
        System.out.println(name + " is playing " + sport + ".");
    }
}