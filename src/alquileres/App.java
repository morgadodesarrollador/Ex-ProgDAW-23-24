package src.alquileres;

public class App {
    public String rutavehiculos = "data/vehiculos.json";
    public String rutaAlquiler = "data/alquiler.json";

    public void menu(){
        boolean entra = false;
        while (!entra) {
            System.out.println("""
                    Menú Principal
                    ******************
                    1-. Cargar datos
                    2-. Listar la Flota
                    3-. Listar Alquileres
                    4-. Alquileres de un vehículo
                    5-. Añadir un vehículo
                    6-. Añadir un alquiler
                    7-. Vehículo más rentable
                    8-. Vehículo más demandado     
                    0-. Finaliza
                        """);
            System.out.print("Opción:");
            int opcion = this.scan.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("fin del programa");
                    break;
                case 1:
                    this.loadData();
                    break;
                case 2:
                    this.listarFlota();
                    break;
                case 3:
                    this.listarAlquileres();
                    break;
                case 4:
                    this.alquilerVehiculo();
                    break;
            }
        }
    }
}
