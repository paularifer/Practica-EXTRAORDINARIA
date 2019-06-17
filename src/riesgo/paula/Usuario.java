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
        clientesConcesionario.addAll(new ArrayList<String>());
        ArrayList <String[]> clientesConcesionario = new ArrayList<>();
        clientesConcesionario.add(new String []{'1233','Pedro'});
      rows.add(new int[]{1,2});
      rows.add(new int[]{1});

        clientesConcesionario.get(0);
        
        
        
        
        clientesConcesionario.put("25343", "Carlos");
        clientesConcesionario.put("65346", "Maria");
        clientesConcesionario.add ("10283", "Sara");
        
    }
    
    private static void tipoUsuario(String nombre, String clave) {
          String usuarioAdmin= "admin@ocasioncar.com";
          String contraseñaAdmin="admin";
          if (nombre==usuarioAdmin && clave==contraseñaAdmin){
            String res= "administrador";
        }
          
        
    }
        
    
    
    
    }