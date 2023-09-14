package driver;

public class Televicion  implements ElectronicDriver{
    private int volumen = 0;
    private String name;

    public Televicion(String name){
        this.name = name;
    }

    @Override
    public void on() {
        System.out.println(name + "Televicion es on");
    }

    @Override
    public void off() {
        System.out.println( name + "Televicion es off");
    }

    @Override
    public void volumen() {
        volumen++;
        System.out.println( name + "Televicion volumen" + volumen);
    }

    @Override
    public void volumenDown() {
        volumen--;
        System.out.println( name + "Televicion volumen Donw" + volumen);
    }
    
}
