package riesgo.paula ;

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
    ArrayList <ArrayList<String>> vehiculos = new ArrayList<>();

    public Vehiculos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<ArrayList<String>> getVehiculos() {
        
        vehiculos.add(new ArrayList<String>());
        vehiculos.get(0).add(0, "Motocicleta");
        vehiculos.get(0).add(1,"1230ABD");
        vehiculos.get(0).add(2,"Honda");
        vehiculos.get(0).add(3,"Super sport");
        vehiculos.get(0).add(4,"120 CV");
        vehiculos.get(0).add(5,"negra");
        vehiculos.get(0).add(6,"2004");
        vehiculos.get(0).add(7,"1200 km ");
        vehiculos.get(0).add(8,"9000 euros");
        vehiculos.get(0).add(9,"sport");
        vehiculos.get(0).add(10,"50 cm3");
        
        
        
        vehiculos.get(1).add(0, "Motocicleta");
        vehiculos.get(1).add(1,"3222NJM");
        vehiculos.get(1).add(2,"Honda");
        vehiculos.get(1).add(3,"Sport touring");
        vehiculos.get(1).add(4,"90 CV");
        vehiculos.get(1).add(5,"roja");
        vehiculos.get(1).add(6,"2016");
        vehiculos.get(1).add(7,"2000");
        vehiculos.get(1).add(8,"6000");
        vehiculos.get(1).add(9,"sport");
        vehiculos.get(1).add(10,"40cm3");
        
        
        vehiculos.get(2).add(0, "Motocicleta");
        vehiculos.get(2).add(1,"7423STR");
        vehiculos.get(2).add(2,"BMW");
        vehiculos.get(2).add(3,"HP4 Race");
        vehiculos.get(2).add(4,"110 CV");
        vehiculos.get(2).add(5,"blanca");
        vehiculos.get(2).add(6, "2017");
        vehiculos.get(2).add(7,"1702 ");
        vehiculos.get(2).add(8,"1200 ");
        vehiculos.get(2).add(9,"sport");
        vehiculos.get(2).add(10,"30 cm3");
        
        
        vehiculos.get(3).add(0, "Motocicleta");
        vehiculos.get(3).add(1,"5932GBK");
        vehiculos.get(3).add(2,"BMW");
        vehiculos.get(3).add(3,"S 100 RR");
        vehiculos.get(3).add(4,"100 CV");
        vehiculos.get(3).add(5,"negra");
        vehiculos.get(3).add(6,"2018");
        vehiculos.get(3).add(7,"1400 ");
        vehiculos.get(3).add(8,"5000 ");
        vehiculos.get(3).add(9,"sport");
        vehiculos.get(3).add(10,"40 cm3");
        
        vehiculos.get(4).add(0, "Automovil");
        vehiculos.get(4).add(1, "6327FBH");
        vehiculos.get(4).add(2, "KIA");
        vehiculos.get(4).add(3, "Picanto");
        vehiculos.get(4).add(4, "120 CV");
        vehiculos.get(4).add(5, "gris");
        vehiculos.get(4).add(6, "2015");
        vehiculos.get(4).add(7, "2000 ");
        vehiculos.get(4).add(8, "12000 ");
        vehiculos.get(4).add(9, "diesel");
        vehiculos.get(4).add(10, "manual");
        vehiculos.get(4).add(11, "5");
        vehiculos.get(4).add(12, "5");
        
        vehiculos.get(5).add(0, "Automovil");//tipo
        vehiculos.get(5).add(1, "2819GBH");//matricula
        vehiculos.get(5).add(2, "KIA");// marca
        vehiculos.get(5).add(3, "Rio");// modelo
        vehiculos.get(5).add(4, "80 CV");// Potencia
        vehiculos.get(5).add(5, "azul"); // color
        vehiculos.get(5).add(6, "2014"); //matricula
        vehiculos.get(5).add(7, "2670 "); //km
        vehiculos.get(5).add(8, "15000 ");// euro
        vehiculos.get(5).add(9, "gasolina");// combustible
        vehiculos.get(5).add(10, "manual");// cambio
        vehiculos.get(5).add(11, "5");//num plazas
        vehiculos.get(5).add(12, "5");//num puertas
        
         vehiculos.get(6).add(0, "Automovil");
        vehiculos.get(6).add(1, "6753JNH");
        vehiculos.get(6).add(2, "FIAT");
        vehiculos.get(6).add(3, "500");
        vehiculos.get(6).add(4, "150 CV");
        vehiculos.get(6).add(5, "blanco");
        vehiculos.get(6).add(6, "2016");
        vehiculos.get(6).add(7, "1002 ");
        vehiculos.get(6).add(8, "1800 ");
        vehiculos.get(6).add(9, "electrico");
        vehiculos.get(6).add(10, "automatico");
        vehiculos.get(6).add(11, "5");
        vehiculos.get(6).add(12, "3");
        
        vehiculos.get(7).add(0, "Automovil");
        vehiculos.get(7).add(1, "8392TGH");
        vehiculos.get(7).add(2, "FIAT");
        vehiculos.get(7).add(3, "500 C");
        vehiculos.get(7).add(4, "90 CV");
        vehiculos.get(7).add(5, "negro");
        vehiculos.get(7).add(6, "2012");
        vehiculos.get(7).add(7, "3000 ");
        vehiculos.get(7).add(8, "11500 ");
        vehiculos.get(7).add(9, "hibrido");
        vehiculos.get(7).add(10, "manual");
        vehiculos.get(7).add(11, "5");
        vehiculos.get(7).add(12, "5");
        
        vehiculos.get(8).add(0, "Automovil");
        vehiculos.get(8).add(1, "5327GSA");
        vehiculos.get(8).add(2, "Toyota");
        vehiculos.get(8).add(3, "RAV 4");
        vehiculos.get(8).add(4, "112 CV");
        vehiculos.get(8).add(5, "gris");
        vehiculos.get(8).add(6, "2014");
        vehiculos.get(8).add(7, "2500 ");
        vehiculos.get(8).add(8, "13000 ");
        vehiculos.get(8).add(9, "diesel");
        vehiculos.get(8).add(10, "automatico");
        vehiculos.get(8).add(11, "5");
        vehiculos.get(8).add(12, "4x2");
        
         vehiculos.get(9).add(0, "Automovil");
        vehiculos.get(9).add(1, "1928GUH");
        vehiculos.get(9).add(2, "Toyota");
        vehiculos.get(9).add(3, "Land cruiser");
        vehiculos.get(9).add(4, "80 CV");
        vehiculos.get(9).add(5, "azul");
        vehiculos.get(9).add(6, "2017");
        vehiculos.get(9).add(7, "3450 ");
        vehiculos.get(9).add(8, "7000 ");
        vehiculos.get(9).add(9, "diesel");
        vehiculos.get(9).add(10, "manual");
        vehiculos.get(9).add(11, "5");
        vehiculos.get(9).add(12, "4x4");
        
        return vehiculos;
    }

    public void setVehiculos(ArrayList<ArrayList<String>> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Vehiculos(String Matricula, String Marca, String Modelo, String Potencia, String Color, String FechaMatriculacion, int KilometrosRecorridos, int Precio) {
        this.Matricula = Matricula;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Potencia = Potencia;
        this.Color = Color;
        this.FechaMatriculacion = FechaMatriculacion;
        this.KilometrosRecorridos = KilometrosRecorridos;
        this.Precio = Precio;
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
