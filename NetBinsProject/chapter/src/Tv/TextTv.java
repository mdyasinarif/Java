package Tv;

public class TextTv {

    public static void main(String[] args) {
        Tv tv1 = new Tv();
        tv1.turnOn();
        tv1.setChanal(30);
        tv1.setVolume(3);

        Tv tv2 = new Tv();
        tv2.turnOn();
        tv2.channalUp();
        tv2.channalUp();
        tv2.volumeUp();
        System.out.println("tv1's channel is "+tv1.channel+" and volume level is "+tv1.volumeLevel);
        System.out.println("tv2's channel is "+tv2.channel+" and volume level is "+tv2.volumeLevel);
    }
}
