package week6;


class Creature {
    void eat() {
        System.out.println("This creature eats food");
    }
}

class Puppy extends Creature {
    void eat() {
        super.eat(); // calling parent method
        System.out.println("Puppy eats bones");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
    }
}


