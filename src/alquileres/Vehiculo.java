package src.alquileres;

public class Vehiculo {
    public String matricula = "";
    public String marca = "";
    public int km = 0;
    
    public Vehiculo(String mat, String marca){
        this.matricula = mat;
        this.marca = marca;
    }
    public abstract int importeAlquiler(int n);
}
