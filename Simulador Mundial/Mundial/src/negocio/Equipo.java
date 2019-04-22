package negocio;

public class Equipo 
{
private String nombre;
private int puntos;
private int golesAFavor;
private int golesEnContra;
private int difGoles;


    public Equipo() 
    {
    }

    public Equipo(String nombre,  int puntos, int golesAFavor, int golesEnContra, int difGoles) 
    {
        this.nombre = nombre;
        this.golesAFavor = golesAFavor;
        this.golesEnContra = golesEnContra;
        this.puntos = puntos;
        this.difGoles = difGoles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    public void setGolesAFavor(int golesAFavor) {
        this.golesAFavor = golesAFavor;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }

    public void setGolesEnContra(int golesEnContra) {
        this.golesEnContra = golesEnContra;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getDifGoles() {
        return difGoles;
    }

    public void setDifGoles(int difGoles) {
        this.difGoles = difGoles;
    }
    

@Override
    public String toString()
    {
        return this.nombre + "," + this.puntos + "," + this.golesAFavor + "," + this.golesEnContra + "," + this.difGoles;
    }
}
