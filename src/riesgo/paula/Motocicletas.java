package riesgo.paula;
public class Motocicletas extends Vehiculos {
    
    private String Tipo;
    
    private int Cilandrada;

    public Motocicletas(String Tipo, int Cilandrada, String Matricula, String Marca, String Modelo, String Potencia, String Color, String FechaMatriculacion, int KilometrosRecorridos, int Precio) {
        super(Matricula, Marca, Modelo, Potencia, Color, FechaMatriculacion, KilometrosRecorridos, Precio);
        this.Tipo = Tipo;
        this.Cilandrada = Cilandrada;
    }

    

    public int getCilandrada() {
        return Cilandrada;
    }

    public void setCilandrada(int Cilandrada) {
        this.Cilandrada = Cilandrada;
    }


    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

}
