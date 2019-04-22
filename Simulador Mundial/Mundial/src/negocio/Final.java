package negocio;

public class Final
{
private String code;
private String nombre;
private int goles;


    public Final() 
    {
    }

    public Final(String code, String nombre,int goles) 
    {
        this.code = code;
        this.nombre = nombre;
        this.goles = goles;
    }

    public String getCode() {
        return code;
    }

    public String getNombre() {
        return nombre;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    
    @Override
    public String toString()
    {
        return this.code + "," + this.nombre + "," + this.goles;
    }
}
