import animales.Empleado;
import animales.Persona;
import animales.Perro;
import animales.Gato;
import animales.Hamster;

import Zoologico.ANimal;
import Zoologico.Dueño;


import Msgia.Mago;
import Msgia.Mascota;
public class App {
    public static void main(String[] args) throws Exception {
        //Objetos
        Persona p1 = new Persona();
        Persona p2 = new Persona();

        //Atributos
        p1.setEdad(10);
        p1.setNombre("Manchas");
        p1.setEmail("Manchas@Gmail.com");
        p2.setEdad(15);
        p2.setNombre("Luna");
        p2.setEmail("Luna@Gmail.com");

        p1.mostrarNombre();
        p2.mostrarNombre();

        //Objetos
        Empleado c1 = new Empleado();
        Empleado c2 = new Empleado();

        System.out.println("");
        
       //Atributos
       c1.setEdad(20);
       c1.setEmail("Jhonesteban.@Gmail.com");
       c1.setNombre("Jhon esteban");
       c1.setId(1002520202);

       c2.setEdad(20);
       c2.setEmail("jhonatan.@Gmail.com");
       c2.setNombre("Jhonatan garzon");
       c2.setId(1002520202);

       c1.mostrarNombre();
       c2.mostrarNombre();

       System.out.println("");

       //Objetos
       Perro d1 = new Perro();
       Perro d2 = new Perro();

       // Atributos
       d1.setAltura(60 );
       d1.setColor("Cafe");
       d1.setNombre("Killer");
       d1.setRaza("Rottweiler");
       d1.setEdad(17);
       
       d2.setAltura(50 );
       d2.setColor("Negro");
       d2.setNombre("Luna");
       d2.setRaza("chandoberman");
       d2.setEdad(10);

       d1.mostrarNombre();
       d2.mostrarNombre();

       System.out.println("");

       //objeto
       Gato g1 = new Gato();
       Gato g2 = new Gato();

       //atributos
       g1.setAltura(60);
       g1.setColor("Negro");
       g1.setRaza("Perza");
       g1.setEdad(5);
       g1.setNombre("Luna");

       g2.setAltura(60);
       g2.setColor("Negro");
       g2.setRaza("Perza");
       g2.setEdad(5);
       g2.setNombre("Luna");

       g1.mostrarNombre();
       g2.mostrarNombre();
      
    System.out.println("");

    //Objeto
    Hamster h1 = new Hamster("Copo","raza","color",2,1,true);
    Hamster h2 = new Hamster("nombre2","raza2","color2",3,2,false);
    
    h1.mostrarNombre();
    h2.mostrarNombre();
    //Atributo
    Mascota l1 = new Mascota("Perro","Zeus");

       Mago m1 = new Mago("Esteban", l1);
       m1.mostrarDatos();

       ANimal v1 = new ANimal("gato", "Luna");
       Dueño z1 = new Dueño("Jhon", v1);
       z1.mostrarDatos();

    }
}
