
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paula
 */
public class Ventas {
    String fecha;
    String vehiculo;
    String cliente;
    
    ArrayList <ArrayList<String>> ventas = new ArrayList<>();

    public void setVentas(ArrayList<ArrayList<String>> ventas) {
        this.ventas = ventas;
    }
    public void rellenarVentas(){
        ventas.add(new ArrayList<String>());
        ventas.get(0).add(0,"6/2018");
        ventas.get(0).add(0,"500");
        ventas.get(0).add(0,"9894938L");
    }

    public ArrayList<ArrayList<String>> getVentas() {
        return ventas;
    }

   

   

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
}
