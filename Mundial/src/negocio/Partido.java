package negocio;

public class Partido 
{
private String Nombre;
private int res1;
private int res2;

    public Partido() {
    }

    public Partido(String Nombre, int res1, int res2) {
        this.Nombre = Nombre;
        this.res1 = res1;
        this.res2 = res2;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getRes1() {
        return res1;
    }

    public void setRes1(int res1) {
        this.res1 = res1;
    }

    public int getRes2() {
        return res2;
    }

    public void setRes2(int res2) {
        this.res2 = res2;
    }

    public String toString()
    {
        return this.Nombre + "," + this.res1 + "," + this.res2;
    }
}
