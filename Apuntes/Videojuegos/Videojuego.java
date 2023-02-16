package Videojuegos;
public class Videojuego {
    private String nombre;
    private String genero;
    private int edad;
    private Fecha fecha;
    private String empresa;
    private boolean modojuego; //online offline
    private String plataforma;

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){ //nuevo nombre los cambias
        this.nombre = nombre;
    }

    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }

    public int getEdad(){
        return edad;
    }
    

    public Fecha getFecha(){
        return  fecha;
    }
    public String getEmpresa(){
        return empresa;
    }
    public String getPlataforma(){
        return plataforma;
    }
    public boolean getModojuego(){
        return modojuego;
    }


}