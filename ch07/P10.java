package ch07;

public class P10 {
    public static void main(String args[]) {

        MyTv2 t = new MyTv2();

        t.setChannel(10);

        System.out.println("CH:" + t.getChannel());

        t.setChannel(20);

        System.out.println("CH:" + t.getChannel());

        t.gotoPrevChannel();

        System.out.println("CH:" + t.getChannel());

        t.gotoPrevChannel();

        System.out.println("CH:" + t.getChannel());

    }
}
class MyTv2 {

    boolean isPowerOn;

    int channel;

    int volume;

    final int MAX_VOLUME = 100;

    final int MIN_VOLUME = 0;

    final int MAX_CHANNEL = 100;

    final int MIN_CHANNEL = 1;
    private int prevCh;

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }


    public void setVolume(int volume) {
        this.volume = volume;
    }
    /* (1) 알맞은 코드를 넣어 완성하시오. */

    public void setChannel(int channel) {

        if(channel > MAX_CHANNEL || channel < MIN_CHANNEL) return;

        prevCh = this.channel;

        this.channel = channel;

    }

    public void gotoPrevChannel(){


        setChannel(prevCh);

    }

}