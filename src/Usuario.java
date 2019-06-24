
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Usuario {
    String usuarioAdmin= "admin@ocasioncar.com";
    String contraseñaAdmin="admin";
   
    ArrayList <ArrayList<String>> clientesConcesionario = new ArrayList<>();
    
  
    
    public void rellenar(){
        clientesConcesionario.add(new ArrayList<String>());
        clientesConcesionario.get(0).add(0,"Ramon Fernandez");
        clientesConcesionario.get(0).add(1,"9894938L");
        clientesConcesionario.get(0).add(2,"2810");
        clientesConcesionario.get(0).add(3,"ninguna");
        clientesConcesionario.get(0).add(4,"ramonfer@gmail.com");
        clientesConcesionario.get(0).add(5,"678453987");
        
        clientesConcesionario.add(new ArrayList<String>());
        clientesConcesionario.get(1).add(0,"Carla Rodriguez");
        clientesConcesionario.get(1).add(1,"8346239D");
        clientesConcesionario.get(1).add(2,"6543");
        clientesConcesionario.get(1).add(3,"empleado");
        clientesConcesionario.get(1).add(4,"carlarod@gmail.com");
        clientesConcesionario.get(1).add(5,"123098456");
        
         clientesConcesionario.add(new ArrayList<String>());
        clientesConcesionario.get(2).add(0,"Maria Garcia");
        clientesConcesionario.get(2).add(1,"28947389C");
        clientesConcesionario.get(2).add(2,"1234");
        clientesConcesionario.get(2).add(3,"ninguna");
        clientesConcesionario.get(2).add(4,"mariagar@gmail.com");
        clientesConcesionario.get(2).add(5,"433554777");
        
         clientesConcesionario.add(new ArrayList<String>());
        clientesConcesionario.get(3).add(0,"Martin Menedez");
        clientesConcesionario.get(3).add(1,"8977554A");
        clientesConcesionario.get(3).add(2,"3465");
        clientesConcesionario.get(3).add(3,"familiar");
        clientesConcesionario.get(3).add(4,"martinmen@gmail.com");
        clientesConcesionario.get(3).add(5,"543332677");
        
         clientesConcesionario.add(new ArrayList<String>());
        clientesConcesionario.get(4).add(0,"Carlos Gonzalez");
        clientesConcesionario.get(4).add(1,"8877543P");
        clientesConcesionario.get(4).add(2,"9876");
        clientesConcesionario.get(4).add(3,"familiar");
        clientesConcesionario.get(4).add(4,"carlosgon@gmail.com");
        clientesConcesionario.get(4).add(5,"885543567");
    }
       
    public ArrayList<ArrayList<String>> getClientesConcesionario() {
      return clientesConcesionario;
    }

    public void setClientesConcesionario(ArrayList<ArrayList<String>> clientesConcesionario) {
        
        this.clientesConcesionario = clientesConcesionario;
    }    
}
 

 
     