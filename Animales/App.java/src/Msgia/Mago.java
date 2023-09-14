package Msgia;

public class Mago {
    private String nombre;
    private Mascota complice;

    public void mostrarDatos(){

         System.out.println("El mago se llama: " + nombre + " " + " Tiene de mascota un(a)" + complice.getTipoAnimal() + " llamado(a)" + complice.getNombre());

    }
    public Mago(String nombre,  Mascota complice){
        this.nombre = nombre;
        this.complice = complice;
    }
    public String getNombre(){
    return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public Mascota getcomplice(){
        return complice;
    }
    public void setcomplice(Mascota complice){
        this.complice = complice;
    }

    
}
