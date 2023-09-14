package animales;

public class Perro {
      //Atributos
    private String nombre, raza, color;
    private int edad, altura;
    
    //Metodo

    public void mostrarNombre(){
      System.out.println(nombre + " " +  raza + " " + edad + " " + color + altura + "cm" );   
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
    
}
