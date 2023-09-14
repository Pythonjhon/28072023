package animales;

public class Empleado {
     //Atributos
    private String nombre, email;
    private int edad, id;

    //Metodo
    public void mostrarNombre(){
    System.out.println(nombre + " " +   email + " " + edad + " " + id );
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
