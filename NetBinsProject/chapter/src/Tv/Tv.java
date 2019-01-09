
package Tv;


public class Tv {
    int channel;//defult value 1
    int volumeLevel;//defult value 1
    boolean on = false;
    
    public Tv(){
    }
    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }
    public void setChanal(int newChanel){
        if (on && newChanel >= 1 && newChanel <= 120) {
            channel = newChanel;
        }
    }
    public void setVolume(int newVolumeLevel){
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
            volumeLevel = newVolumeLevel;
        }
    }
    public  void channalUp(){
        if(on && channel <120)
            channel++;
    }
    public  void channalDown(){
        if(on && channel >1)
            channel--;
    }
    public  void volumeUp(){
        if(on && volumeLevel <7)
            volumeLevel++;
    }
    public  void volumeDown(){
        if(on && volumeLevel >1)
            volumeLevel--;
    }
}
