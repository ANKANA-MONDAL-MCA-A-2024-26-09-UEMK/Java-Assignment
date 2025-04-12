package week6;

class AnimalSound {
    String sound = "Animal sound";

    void displaySound() {
        System.out.println("Animal makes sound");
    }
}

class DogSound extends AnimalSound {
    String sound = "Bark";

    void show() {
        System.out.println("Dog sound: " + sound);
        System.out.println("Animal sound (from parent): " + super.sound);
        super.displaySound();
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        DogSound obj = new DogSound();
        obj.show();
    }
}
