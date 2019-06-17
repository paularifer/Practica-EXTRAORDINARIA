package riesgo.paula;
public class Automoviles extends Vehiculos {

    public Automoviles(String Combustible, String Cambio, int NumeroPlazas, String Matricula, String Marca, String Modelo, String Potencia, String Color, String FechaMatriculacion, int KilometrosRecorridos, int Precio) {
        super(Matricula, Marca, Modelo, Potencia, Color, FechaMatriculacion, KilometrosRecorridos, Precio);
        this.Combustible = Combustible;
        this.Cambio = Cambio;
        this.NumeroPlazas = NumeroPlazas;
    }
    
    
    private String Combustible;
    
    private String Cambio;
    
    private int NumeroPlazas;
    

    public int getNumeroPlazas() {
        return NumeroPlazas;
    }

    public void setNumeroPlazas(int NumeroPlazas) {
        this.NumeroPlazas = NumeroPlazas;
    }


    public String getCambio() {
        return Cambio;
    }

    public void setCambio(String Cambio) {
        this.Cambio = Cambio;
    }


    public String getCombustible() {
        return Combustible;
    }

    public void setCombustible(String Combustible) {
        this.Combustible = Combustible;
    }

    
}
