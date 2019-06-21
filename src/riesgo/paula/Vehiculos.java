package riesgo.paula;

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
    public static void main(String[] args) {
        ArrayList <ArrayList<String>> vehiculos = new ArrayList<>();
        vehiculos.add(new ArrayList<String>());
        vehiculos.get(0).add(0,"1230ABD");
        vehiculos.get(0).add(1,"Honda");
        vehiculos.get(0).add(2,"Super sport");
        vehiculos.get(0).add(3,"120 CV");
        vehiculos.get(0).add(4,"negra");
        vehiculos.get(0).add(5,"2004");
        vehiculos.get(0).add(6,"1200 km ");
        vehiculos.get(0).add(7,"9000 euros");
        vehiculos.get(0).add(8,"sport");
        vehiculos.get(0).add(9,"50 cm3");
        vehiculos.get(0).add(10, "Motocicleta");
        
        
        vehiculos.get(1).add(0,"3222NJM");
        vehiculos.get(1).add(1,"Honda");
        vehiculos.get(1).add(2,"Sport touring");
        vehiculos.get(1).add(3,"90 CV");
        vehiculos.get(1).add(4,"roja");
        vehiculos.get(1).add(5,"2016");
        vehiculos.get(1).add(6,"2000km");
        vehiculos.get(1).add(7,"6000euros");
        vehiculos.get(1).add(8,"sport");
        vehiculos.get(1).add(9,"40cm3");
        vehiculos.get(1).add(10, "Motocicleta");
        
        
        vehiculos.get(2).add(0,"7423STR");
        vehiculos.get(2).add(1,"BMW");
        vehiculos.get(2).add(2,"HP4 Race");
        vehiculos.get(2).add(3,"110 CV");
        vehiculos.get(2).add(4,"blanca");
        vehiculos.get(2).add(5,"2017");
        vehiculos.get(2).add(6,"1702 km");
        vehiculos.get(2).add(7,"1200 euros");
        vehiculos.get(2).add(8,"sport");
        vehiculos.get(2).add(9,"30 cm3");
        vehiculos.get(2).add(10, "Motocicleta");
        
        vehiculos.get(3).add(0,"5932GBK");
        vehiculos.get(3).add(1,"BMW");
        vehiculos.get(3).add(2,"S 100 RR");
        vehiculos.get(3).add(3,"100 CV");
        vehiculos.get(3).add(4,"negra");
        vehiculos.get(3).add(5,"2018");
        vehiculos.get(3).add(6,"1400 km");
        vehiculos.get(3).add(7,"5000 euros");
        vehiculos.get(3).add(8,"sport");
        vehiculos.get(3).add(9,"40 cm3");
        vehiculos.get(3).add(10, "Motocicleta");
        
        vehiculos.get(4).add(0, "6327FBH");
        vehiculos.get(4).add(1, "KIA");
        vehiculos.get(4).add(2, "Picanto");
        vehiculos.get(4).add(3, "120 CV");
        vehiculos.get(4).add(4, "gris");
        vehiculos.get(4).add(5, "2015");
        vehiculos.get(4).add(6, "2000 km");
        vehiculos.get(4).add(7, "12000 euros");
        vehiculos.get(4).add(8, "diesel");
        vehiculos.get(4).add(9, "manual");
        vehiculos.get(4).add(10, "5");
        vehiculos.get(4).add(11, "5");
        
        vehiculos.get(5).add(0, "2819GBH");
        vehiculos.get(5).add(1, "KIA");
        vehiculos.get(5).add(2, "Rio");
        vehiculos.get(5).add(3, "80 CV");
        vehiculos.get(5).add(4, "azul");
        vehiculos.get(5).add(5, "2014");
        vehiculos.get(5).add(6, "2670 km");
        vehiculos.get(5).add(7, "15000 euros");
        vehiculos.get(5).add(8, "gasolina");
        vehiculos.get(5).add(9, "manual");
        vehiculos.get(5).add(10, "5");
        vehiculos.get(5).add(11, "5");
        
        vehiculos.get(6).add(0, "6753JNH");
        vehiculos.get(6).add(1, "FIAT");
        vehiculos.get(6).add(2, "500");
        vehiculos.get(6).add(3, "150 CV");
        vehiculos.get(6).add(4, "blanco");
        vehiculos.get(6).add(5, "2016");
        vehiculos.get(6).add(6, "1002 km");
        vehiculos.get(6).add(7, "1800 euros");
        vehiculos.get(6).add(8, "electrico");
        vehiculos.get(6).add(9, "automatico");
        vehiculos.get(6).add(10, "5");
        vehiculos.get(6).add(11, "3");
        
        vehiculos.get(7).add(0, "8392TGH");
        vehiculos.get(7).add(1, "FIAT");
        vehiculos.get(7).add(2, "500 C");
        vehiculos.get(7).add(3, "90 CV");
        vehiculos.get(7).add(4, "negro");
        vehiculos.get(7).add(5, "2012");
        vehiculos.get(7).add(6, "3000 km");
        vehiculos.get(7).add(7, "11500 euros");
        vehiculos.get(7).add(8, "hibrido");
        vehiculos.get(7).add(9, "manual");
        vehiculos.get(7).add(10, "5");
        vehiculos.get(7).add(11, "5");
        
        vehiculos.get(8).add(0, "5327GSA");
        vehiculos.get(8).add(1, "Toyota");
        vehiculos.get(8).add(2, "RAV 4");
        vehiculos.get(8).add(3, "112 CV");
        vehiculos.get(8).add(4, "gris");
        vehiculos.get(8).add(5, "2014");
        vehiculos.get(8).add(6, "2500 km");
        vehiculos.get(8).add(7, "13000 euros");
        vehiculos.get(8).add(8, "diesel");
        vehiculos.get(8).add(9, "automatico");
        vehiculos.get(8).add(10, "5");
        vehiculos.get(8).add(11, "4x2");
        
        vehiculos.get(9).add(0, "1928GUH");
        vehiculos.get(9).add(1, "Toyota");
        vehiculos.get(9).add(2, "Land cruiser");
        vehiculos.get(9).add(3, "80 CV");
        vehiculos.get(9).add(4, "azul");
        vehiculos.get(9).add(5, "2017");
        vehiculos.get(9).add(6, "3450 km");
        vehiculos.get(9).add(7, "7000 euros");
        vehiculos.get(9).add(8, "diesel");
        vehiculos.get(9).add(9, "manual");
        vehiculos.get(9).add(10, "5");
        vehiculos.get(9).add(11, "4x4");
        
        
       
        
        
        
        
    }

}
