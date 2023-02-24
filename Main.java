package act9;

public class Main {

  public static void main(String[] args) {
   Cliente cliente= new Cliente();
   cliente.edad=23;
   cliente.telefono=154226386;
   cliente.nombre="Bruno Gonzalez";
   cliente.credito=10;
   
   System.out.println("mi nombre es "+cliente.nombre);
    System.out.println("tengo " + cliente.edad);
   System.out.println("mi telefono es " +cliente.telefono);
   System.out.println("mi credito es "+cliente.credito);
   
   
   
   Trabajador trabajador= new Trabajador();
   trabajador.edad=23;
   trabajador.telefono=154226386;
   trabajador.nombre="Bruno Gonzalez";
   trabajador.salario=15000;
   
   System.out.println("mi nombre es "+trabajador.nombre);
    System.out.println("tengo " + trabajador.edad);
   System.out.println("mi telefono es " +trabajador.telefono);
   System.out.println("mi salario es "+trabajador.salario);
  
  }
}
class Persona{
  int edad;
  int telefono;
  String nombre;
  }
 class Cliente extends Persona{
   int credito;
 }
class Trabajador extends Persona{
  int salario;
}
//Crea una clase Persona con las siguientes variables:
//La edad
//El nombre
//El teléfono
//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
//Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.