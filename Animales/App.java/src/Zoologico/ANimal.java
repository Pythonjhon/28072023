package Zoologico;

public class ANimal {
    private String tipoAnimal,nombre;

    public ANimal(String tipoAnimal, String nombre){
        this.tipoAnimal = tipoAnimal;
        this.nombre = nombre;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
