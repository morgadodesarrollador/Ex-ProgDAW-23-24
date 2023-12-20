package alquileres;

public class Turismo extends Vehiculo{
    int PrecioDia;
    public Turismo(String mat, String marca,  int km){
        super (mat, marca);
        this.km = km;
        this.PrecioDia = 50;

    }

    public void setPrecioDia(int precioDia) {
        if (this.km > 1000){
            this.PrecioDia = 50; //segunda mano
        }else if (this.km == 0){
            this.PrecioDia = 150; //nuevo
        }else{
            this.PrecioDia = 90; //km0
        }
    }

    @Override
    public int importeAlquiler(int dias) {
        return this.PrecioDia * dias ;
    }

    @Override
    public String toString() {
        String linea = "T-"+ this.matricula + " - " + this.marca + " - " + this.km;
        return linea;
    }
}