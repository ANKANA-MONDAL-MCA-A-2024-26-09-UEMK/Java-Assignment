package week5;

class StopOverridding {
    final void sound() {
        System.out.println("Animal makes a sound");
    }

    public static void main(String[] args) {
        StopOverridding animal = new StopOverridding();
        animal.sound();
    }
}
