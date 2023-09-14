package modelo;

public class Persona {

    //atributos
    private String dni, nombre, apellido;
    private int añonacimiento;


//metodos

public String getDni() {
    return dni;
}


public void setDni(String dni) {
    this.dni = dni;
}


public String getNombre() {
    return nombre;
}


public void setNombre(String nombre) {
    this.nombre = nombre;
}


public String getApellido() {
    return apellido;
}


public void setApellido(String apellido) {
    this.apellido = apellido;
}


public int getAñonacimiento() {
    return añonacimiento;
}


public void setAñonacimiento(int añonacimiento) {
    this.añonacimiento = añonacimiento;
}
public void mostrarNombre() {
    System.out.println (getNombre() + " " + getApellido());

}

}