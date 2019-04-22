package negocio;

public class Octavos
{
private String code;
private String nombre;
private int goles;
private boolean ganador;


    public Octavos() 
    {
    }

    public Octavos(String code, String nombre, int goles, boolean ganador) 
    {
        this.code = code;
        this.nombre = nombre;
        this.goles = goles;
        this.ganador = ganador;
    }

    public String getCode() {
        return code;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGoles() {
        return goles;
    }

    public boolean isGanador() {
        return ganador;
    }


    public void setCode(String code) {
        this.code = code;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }

    

    

@Override
    public String toString()
    {
        return this.code + "," + this.nombre + "," + this.goles + "," + this.ganador;
    }
}