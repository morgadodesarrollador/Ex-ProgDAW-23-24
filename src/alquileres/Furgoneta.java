package alquileres;

public class Furgoneta extends Vehiculo {

    public int precioKm = 1;
    public Furgoneta(String mat, String marca, int km){
        super (mat, marca);
        this.km = km;
        this.precioKm = km;
    }
    @Override
    public int importeAlquiler(int kmTotales) {
        
        return this.precioKm * kmTotales;
    }
    @Override
    public String toString() {
        String linea = "F-"+ this.matricula + " - " + this.marca + " - " + this.km;
        return linea;
    }
}