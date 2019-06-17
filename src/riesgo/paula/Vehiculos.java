package riesgo.paula;
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

}
