import modelo.Persona;
public class App 
    public static void main(String[] args) throws Exception {

Persona p1 = new Persona();
Persona p2 = new Persona();
p1.setNombre("Juan");
p1.setApellido("Gonzalez");
p2.setNombre("Luiz");
p2.setApellido("Gomez");



//p1.Nombre = ″Juan″;
//p1.Apellidos = ″Gonzalez″;
//p2.Nombre = ″Luis″;
//p2.Apellidos = ″Gómez″;
p1.mostrarNombre();
p2.mostrarNombre();

public class Cuenta {
private double saldo,  limiteCredito;
private static final double LIMITE = 500;
public Cuenta() {
this.balance = 0;
this.limiteCredito = LIMITE;
}
public Cuenta(double limiteCredito) {
this.balance = 0;
this.limiteCredito = limiteCredito;
}
}
    

