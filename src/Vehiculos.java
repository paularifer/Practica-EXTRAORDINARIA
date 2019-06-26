

import java.util.ArrayList;

public class Vehiculos {
    
    private String Matricula;
    private String Marca;
    private String Modelo;
    private String Potencia;
    private String Color;
    private String FechaMatriculacion;
    private int KilometrosRecorridos;
    private int Precio;
    ArrayList <ArrayList<String>> vehiculosLista = new ArrayList<>();

    public ArrayList<ArrayList<String>> getVehiculosLista() {
        return vehiculosLista;
    }

    public void setVehiculosLista(ArrayList<ArrayList<String>> vehiculosLista) {
        this.vehiculosLista = vehiculosLista;
    }

 

 
    public void rellenarVehiculos(){
     
        
        
        vehiculosLista.add(new ArrayList<String>());
        vehiculosLista.get(0).add(0, "Motocicleta");
        vehiculosLista.get(0).add(1,"3222NJM");
        vehiculosLista.get(0).add(2,"Honda");
        vehiculosLista.get(0).add(3,"Sport touring");
        vehiculosLista.get(0).add(5,"90 CV");
        vehiculosLista.get(0).add(6,"roja");
        vehiculosLista.get(0).add(7,"2016");
        vehiculosLista.get(0).add(8,"2000");
        vehiculosLista.get(0).add(9,"6000");
        vehiculosLista.get(0).add(10,"sport");
        vehiculosLista.get(0).add(11,"40cm3");
           
        
        vehiculosLista.add(new ArrayList<String>());
        vehiculosLista.get(1).add(0, "Motocicleta");
        vehiculosLista.get(1).add(1,"1230ABD");
        vehiculosLista.get(1).add(2,"Honda");
        vehiculosLista.get(1).add(3,"Super sport");
        vehiculosLista.get(1).add(5,"120 CV");
        vehiculosLista.get(1).add(6,"negra");
        vehiculosLista.get(1).add(7,"2004");
        vehiculosLista.get(1).add(8,"1200 km ");
        vehiculosLista.get(1).add(9,"9000 euros");
        vehiculosLista.get(1).add(10,"sport");
        vehiculosLista.get(1).add(11,"50 cm3");
        
        vehiculosLista.add(new ArrayList<String>());
        vehiculosLista.get(2).add(0, "Motocicleta");
        vehiculosLista.get(2).add(1,"7423STR");
        vehiculosLista.get(2).add(2,"BMW");
        vehiculosLista.get(2).add(3,"HP4 Race");
        vehiculosLista.get(2).add(5,"110 CV");
        vehiculosLista.get(2).add(6,"blanca");
        vehiculosLista.get(2).add(7, "2017");
        vehiculosLista.get(2).add(8,"1702 ");
        vehiculosLista.get(2).add(9,"1200 ");
        vehiculosLista.get(2).add(10,"sport");
        vehiculosLista.get(2).add(11,"30 cm3");
        
        vehiculosLista.add(new ArrayList<String>());
        vehiculosLista.get(3).add(0, "Motocicleta");
        vehiculosLista.get(3).add(1,"5932GBK");
        vehiculosLista.get(3).add(2,"BMW");
        vehiculosLista.get(3).add(3,"S 100 RR");
        vehiculosLista.get(3).add(5,"100 CV");
        vehiculosLista.get(3).add(6,"negra");
        vehiculosLista.get(3).add(7,"2018");
        vehiculosLista.get(3).add(8,"1400 ");
        vehiculosLista.get(3).add(9,"5000 ");
        vehiculosLista.get(3).add(10,"sport");
        vehiculosLista.get(3).add(11,"40 cm3");
        
        
        vehiculosLista.add(new ArrayList<String>());
        vehiculosLista.get(4).add(0, "Automovil");
        vehiculosLista.get(4).add(1, "6327FBH");
        vehiculosLista.get(4).add(2, "KIA");
        vehiculosLista.get(4).add(3, "Picanto");
        vehiculosLista.get(4).add(4, "120 CV");
        vehiculosLista.get(4).add(5, "gris");
        vehiculosLista.get(4).add(6, "2015");
        vehiculosLista.get(4).add(7, "2000 ");
        vehiculosLista.get(4).add(8, "12000 ");
        vehiculosLista.get(4).add(9, "Turismo");
        vehiculosLista.get(4).add(10, "diesel");
        vehiculosLista.get(4).add(11, "manual");
        vehiculosLista.get(4).add(12, "5");
        vehiculosLista.get(4).add(13, "5");
        
        vehiculosLista.add(new ArrayList<String>());
        vehiculosLista.get(5).add(0, "Automovil");//tipo
        
        vehiculosLista.get(5).add(1, "2819GBH");//matricula
        vehiculosLista.get(5).add(2, "KIA");// marca
        vehiculosLista.get(5).add(3, "Rio");// modelo
        vehiculosLista.get(5).add(4, "80 CV");// Potencia
        vehiculosLista.get(5).add(5, "azul"); // color
        vehiculosLista.get(5).add(6, "2014"); //matriculacion
        vehiculosLista.get(5).add(7, "2670 "); //km
        vehiculosLista.get(5).add(8, "15000 ");// euro
        vehiculosLista.get(5).add(9, "Turismo");// tipo automovil
        vehiculosLista.get(5).add(10, "gasolina");// combustible
        vehiculosLista.get(5).add(11, "manual");// cambio
        vehiculosLista.get(5).add(12, "5");//num plazas
        vehiculosLista.get(5).add(13, "5");//num puertas
        
        vehiculosLista.add(new ArrayList<String>());
        vehiculosLista.get(6).add(0, "Automovil");
        vehiculosLista.get(6).add(1, "6753JNH");
        vehiculosLista.get(6).add(2, "FIAT");
        vehiculosLista.get(6).add(3, "500");
        vehiculosLista.get(6).add(4, "150 CV");
        vehiculosLista.get(6).add(5, "blanco");
        vehiculosLista.get(6).add(6, "2016");
        vehiculosLista.get(6).add(7, "1002 ");
        vehiculosLista.get(6).add(8, "1800 ");
        vehiculosLista.get(6).add(9, "Turismo");// tipo automovil
        vehiculosLista.get(6).add(10, "electrico");
        vehiculosLista.get(6).add(11, "automatico");
        vehiculosLista.get(6).add(12, "5");
        vehiculosLista.get(6).add(13, "3");
        
       vehiculosLista.add(new ArrayList<String>());
       vehiculosLista.get(7).add(0, "Automovil");
       vehiculosLista.get(7).add(1, "8392TGH");
       vehiculosLista.get(7).add(2, "FIAT");
       vehiculosLista.get(7).add(3, "500 CV");
       vehiculosLista.get(7).add(4, "90 CV");
       vehiculosLista.get(7).add(5, "negro");
       vehiculosLista.get(7).add(6, "2012");
       vehiculosLista.get(7).add(7, "3000 ");
       vehiculosLista.get(7).add(8, "11500 ");
       vehiculosLista.get(7).add(9, "Turismo");// tipo automovil
       vehiculosLista.get(7).add(10, "hibrido");
       vehiculosLista.get(7).add(11, "manual");
       vehiculosLista.get(7).add(12, "5");
       vehiculosLista.get(7).add(13, "5");
        
        vehiculosLista.add(new ArrayList<String>());
        vehiculosLista.get(8).add(0, "Automovil");
        vehiculosLista.get(8).add(1, "5327GSA");
        vehiculosLista.get(8).add(2, "Toyota");
        vehiculosLista.get(8).add(3, "RAV 4");
        vehiculosLista.get(8).add(4, "112 CV");
        vehiculosLista.get(8).add(5, "gris");
        vehiculosLista.get(8).add(6, "2014");
        vehiculosLista.get(8).add(7, "2500 ");
        vehiculosLista.get(8).add(8, "13000 ");
        vehiculosLista.get(8).add(9, "Todoterreno");// tipo automovil
        vehiculosLista.get(8).add(10, "diesel");
        vehiculosLista.get(8).add(11, "automatico");
        vehiculosLista.get(8).add(12, "5");
        vehiculosLista.get(8).add(13, "4x2");
        
        vehiculosLista.add(new ArrayList<String>());
        vehiculosLista.get(9).add(0, "Automovil");
        vehiculosLista.get(9).add(1, "1928GUH");
        vehiculosLista.get(9).add(2, "Toyota");
        vehiculosLista.get(9).add(3, "Land cruiser");
        vehiculosLista.get(9).add(4, "80 CV");
        vehiculosLista.get(9).add(5, "azul");
        vehiculosLista.get(9).add(6, "2017");
        vehiculosLista.get(9).add(7, "3450 ");
        vehiculosLista.get(9).add(8, "7000 ");
        vehiculosLista.get(9).add(9, "Todoterreno");// tipo automovil
        vehiculosLista.get(9).add(10, "diesel");
        vehiculosLista.get(9).add(11, "manual");
        vehiculosLista.get(9).add(12, "5");
        vehiculosLista.get(9).add(13, "4x4");
        
    }
  
   

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }


    public int getKilometrosRecorridos() {
        return KilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int KilometrosRecorridos) {
        this.KilometrosRecorridos = KilometrosRecorridos;
    }


    public String getFechaMatriculacion() {
        return FechaMatriculacion;
    }

    public void setFechaMatriculacion(String FechaMatriculacion) {
        this.FechaMatriculacion = FechaMatriculacion;
    }

    

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }


    public String getPotencia() {
        return Potencia;
    }

    public void setPotencia(String Potencia) {
        this.Potencia = Potencia;
    }


    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }


    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }
 

}
