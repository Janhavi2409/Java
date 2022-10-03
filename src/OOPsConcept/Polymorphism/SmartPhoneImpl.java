package OOPsConcept.Polymorphism;

interface Camera {
    void takeSnap();

    void recordVideo();

    //default method
    default void Selfie() {
        System.out.println("taking selfie...");
    }
}

interface GPS {

    void liveLocation();

    void currentLocation();
}

interface mediaPlayer {
    void playMusic();
}

interface WiFi {
    void connectToNetworks(String getNetworks);

}

class cellPhone {
    public void Calling(long phoneNo) {
        System.out.println("Calling " + phoneNo + "...");
    }
}

class smartPhone extends cellPhone implements Camera, GPS, mediaPlayer, WiFi {

    @Override
    public void takeSnap() {
        System.out.println("taking snap...");
    }

    @Override
    public void recordVideo() {
        System.out.println("recording video...");
    }

    @Override
    public void liveLocation() {
        System.out.println("Sharing live location");
    }

    @Override
    public void currentLocation() {
        System.out.println("sharing current location");
    }

    @Override
    public void playMusic() {
        System.out.println("playing music");
    }

    @Override
    public void connectToNetworks(String getNetworks) {
        System.out.println("Connecting to network: " + getNetworks);
    }

    @Override
    public void Calling(long phoneNo) {
        super.Calling(phoneNo);
    }

    @Override
    public void Selfie() {
        // Camera.super.Selfie();
        System.out.println("Taking Selfie(overridden default method)");
    }
}

public class SmartPhoneImpl {
    public static void main(String[] args) {
        Camera camera = new smartPhone();
        GPS gps = new smartPhone();
        mediaPlayer mp = new smartPhone();
        WiFi wiFi = new smartPhone();
        cellPhone cP = new smartPhone();
        camera.takeSnap();
        camera.recordVideo();
        camera.Selfie();
        gps.liveLocation();
        gps.currentLocation();
        mp.playMusic();
        wiFi.connectToNetworks("janhaviD");
        cP.Calling(7972336615l);
    }
}
