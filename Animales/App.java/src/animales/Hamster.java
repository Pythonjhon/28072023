package animales;

public class Hamster {
    private String nombre, raza, color;
    private int edad, altura;
    private boolean  Roedeor ;
    
    public Hamster(String nombre , String raza, String color, int edad , int altura , boolean Roedeor){
        this.nombre = nombre;
        this.altura = altura;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.Roedeor = Roedeor;
        
    }
    public void mostrarNombre(){
      System.out.println(nombre + " " +  raza + " " + edad + " " + color + altura + Roedeor);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isRoedeor() {
        return Roedeor;
    }

    public void setRoedeor(boolean roedeor) {
        Roedeor = roedeor;
    }
    
}
