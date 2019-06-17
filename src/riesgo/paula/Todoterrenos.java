package riesgo.paula;
public class Todoterrenos extends Automoviles {

    public Todoterrenos(int Tracción, String Combustible, String Cambio, int NumeroPlazas, String Matricula, String Marca, String Modelo, String Potencia, String Color, String FechaMatriculacion, int KilometrosRecorridos, int Precio) {
        super(Combustible, Cambio, NumeroPlazas, Matricula, Marca, Modelo, Potencia, Color, FechaMatriculacion, KilometrosRecorridos, Precio);
        this.Tracción = Tracción;
    }
    
    private int Tracción;

    public int getTracción() {
        return Tracción;
    }

    public void setTracción(int Tracción) {
        this.Tracción = Tracción;
    }

}
