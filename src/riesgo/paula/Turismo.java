package riesgo.paula;
public class Turismo extends Automoviles {

    public Turismo(int NumeroPuertas, String Combustible, String Cambio, int NumeroPlazas, String Matricula, String Marca, String Modelo, String Potencia, String Color, String FechaMatriculacion, int KilometrosRecorridos, int Precio) {
        super(Combustible, Cambio, NumeroPlazas, Matricula, Marca, Modelo, Potencia, Color, FechaMatriculacion, KilometrosRecorridos, Precio);
        this.NumeroPuertas = NumeroPuertas;
    }
    
    
    private int NumeroPuertas;

    public int getNumeroPuertas() {
        return NumeroPuertas;
    }

    public void setNumeroPuertas(int NumeroPuertas) {
        this.NumeroPuertas = NumeroPuertas;
    }

    
    
}
