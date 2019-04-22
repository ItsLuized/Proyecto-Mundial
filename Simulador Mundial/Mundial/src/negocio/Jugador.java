
package negocioPlantilla;

public class Jugador 
{
    //1. Atributos 
    private String codigo;
    private String nombres;
    private String apellidos;
    private String equipo;
    private String fotocod;
    
    public Jugador ()
    {
        this.codigo = "";
        this.nombres = "";
        this.apellidos = "";
        this.equipo = "";
        this.fotocod= "";
        
    }

    public Jugador(String codigo, String nombres, String apellidos, String equipo, String fotocod) 
    {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.equipo = equipo;
        this.fotocod= fotocod;
    }

    
    
//ANALIZADOR indagar el valor de esa variable y retornar el valor 
    public String getCodigo() {
        return codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEquipo() {
        return equipo;
    }

    public String getFotocod() {
        return fotocod;
    }
    
    
//modificador ================
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombres (String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos (String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEquipo (String equipo) {
        this.equipo = equipo;
    }
    
    //METODO QUE PERMITE VER TODA LA INFROMACION DEL OBJETO

    
    public String toString ()
    {
        return this.codigo+","+this.nombres+","+this.apellidos+","+this.equipo+","+this.fotocod;
    }
    
    
    
}
