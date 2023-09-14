package driver;

public class Radio implements ElectronicDriver {
    private int volumen = 0;
    private String name;

    public Radio(String name){
        this.name = name;
    }
    @Override
    public void on(){
        System.out.println(name + "RAdio es on");
    }
    @Override
    public void off(){
       System.out.println( name + "Radio es off");
    }
    @Override
    public void volumen(){
        volumen++;
        System.out.println( name + "Radio volumen" + volumen);
    }
    @Override
    public void volumenDown() {
        volumen--;
        System.out.println( name + "Radio volumen Donw" + volumen);
    }
}
