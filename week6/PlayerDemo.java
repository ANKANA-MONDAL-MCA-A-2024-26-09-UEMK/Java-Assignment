package week6;

interface Player {
    void play();
}

class Kid implements Player {
    public void play() {
        System.out.println("Kid plays with toys.");
    }
}

class Instrumentalist implements Player {
    public void play() {
        System.out.println("Instrumentalist plays instruments.");
    }
}

class Performer implements Player {
    public void play() {
        System.out.println("Performer plays a role in drama.");
    }
}

public class PlayerDemo {
    public static void main(String[] args) {
        Player c = new Kid();
        Player m = new Instrumentalist();
        Player a = new Performer();

        c.play();
        m.play();
        a.play();
    }
}
