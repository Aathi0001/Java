package test1;

interface Engine97 {
    void startEngine();
}

interface MusicSystem97 {
    void playMusic();
}

class Car97 implements Engine97, MusicSystem97 {
    public void startEngine() {
        System.out.println("Engine started.");
    }

    public void playMusic() {
        System.out.println("Playing music.");
    }

    public void showFeatures() {
        System.out.println("This car has both Engine and Music System.");
    }
}
