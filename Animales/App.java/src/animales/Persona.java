package animales;
public class Persona {
    //Atributos
    private String nombre, email;
    private int edad;

    //Metodo
    public void mostrarNombre(){
    System.out.println(nombre + " " +   email + " " + edad );
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
