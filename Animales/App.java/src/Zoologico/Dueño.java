package Zoologico;

public class Dueño {
    
    private String nombre;
    private ANimal complice;

    public void mostrarDatos(){

         System.out.println("El mago se llama: " + nombre + " " + " Tiene de mascota un(a)" + complice.getTipoAnimal() + " llamado(a)" + complice.getNombre());

       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ANimal getComplice() {
        return complice;
    }

    public void setComplice(ANimal complice) {
        this.complice = complice;
    }

    public Dueño(String nombre , ANimal complice){
        this.nombre = nombre;
        this.complice = complice;
       }  
}
