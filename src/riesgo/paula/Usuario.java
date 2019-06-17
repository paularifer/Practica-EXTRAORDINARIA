package riesgo.paula;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Usuario {
    String usuarioAdmin= "admin@ocasioncar.com";
    String contraseñaAdmin="admin";
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre = "";
        String clave = "";
      
        System.out.println("\n Introduce el nombre:");
        nombre= entrada.nextLine();
        System.out.println("\n Introduce el clave:");
        clave= entrada.nextLine();
        tipoUsuario(nombre,clave);
        
        ArrayList <ArrayList<String>> clientesConcesionario = new ArrayList<>();
        clientesConcesionario.add(new ArrayList<String>());

        clientesConcesionario.get(0).add("fjfj");
        
        
        
        
        
    }
    
    private static void tipoUsuario(String nombre, String clave) {
          String usuarioAdmin= "admin@ocasioncar.com";
          String contraseñaAdmin="admin";
          if (nombre==usuarioAdmin && clave==contraseñaAdmin){
            String res= "administrador";
        }
          
        
    }
        
    
    
    
    }