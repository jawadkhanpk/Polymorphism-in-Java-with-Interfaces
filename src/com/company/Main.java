package com.company;

// polymorphism is the capability of a method to do different things based on one object
// polymorphism means 1 thing different forms
// Enginner -> software engineer, electrical engineer, Freelancer, Programmer, Developer etc


interface Camera{
    void takeSnap();
    void recordVideo();

    default void record4kvideo(){       // this is default method we created after and also defined here
        System.out.println("Recording in 4k!");
    }

}
interface Wifi{
    String[] getNetworks();
    void connectNetwork(String network);
}
class CellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling"+ phoneNumber);
    }
    void Pickcall(int phoneNumber){
        System.out.println("Connecting..."+ phoneNumber);
    }

}
class SmartPhone extends CellPhone implements Wifi, Camera{     // inheritance
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Recording Video...");
    }
    public void record4kvideo(){
        System.out.println("Taking snap and Recording Video in 4k...");     // we can also override the method and if we execute in this state is prints this by override
    }
    public String[] getNetworks(){
        System.out.println("Getting the list of Networks...");
        String[] networkList = {"Zong", "Jazz", "Ufone", "Telenor"};
        return networkList;
    }
    public void connectNetwork(String network){
        System.out.println("Connecting to..."+network);
    }


}
public class Main {

    public static void main(String[] args) {
        // write your code here
        Camera obj = new SmartPhone();  // this is a smartphone but use it as a camera
        obj.record4kvideo();

        SmartPhone obj2 = new SmartPhone();
        obj2.takeSnap();
        obj2.recordVideo();
        obj2.record4kvideo();
        obj2.connectNetwork("Jazz");
        obj2.callNumber(313);
        obj2.Pickcall(3432);
        obj2.getNetworks();



        }
    }

