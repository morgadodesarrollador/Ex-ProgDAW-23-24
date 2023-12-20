package alquileres;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
public class Alquiler {
    Vehiculo vehiculo;
    //LocalDate FInicio;
    String FInicio = "";

    int kmTotales;
    int importe;

    public Alquiler(Vehiculo v, String finicio, int kmT, int importe){
        this.vehiculo = v;
        this.FInicio = finicio;
        this.kmTotales = kmT;
        this.importe = importe;
    }
    public void calcularImporte(){

    }

    @Override
    public String toString() {
        //String finicio = this.FInicio.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        return "A - " + this.FInicio + "-"+ this.vehiculo.marca + "("+this.vehiculo.matricula+")"
                + " - " + this.kmTotales + " - " + this.importe;
    }
}