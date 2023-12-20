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
    public void loadData() {
        this.loadVehiculos();
        this.loadAlquileres();
        System.out.print("Continuar: ....");
        this.scan.next();
    }
    public void loadVehiculos() {
        String matricula = ""; String marca=""; String tipo = ""; int km;
        System.out.println("Carga de vehiculos:");
        try {
            Turismo t; Furgoneta f;
            System.out.println(this.rutavehiculos);
            FileReader vehiculosjson = new FileReader(this.rutavehiculos);
            JSONParser parser = new JSONParser();
            Object objVehiculos = parser.parse(vehiculosjson);
            JSONArray VehiculosJA = (JSONArray) objVehiculos;

            for (int i=0; i<VehiculosJA.size(); i++){

                JSONObject VehiculoObj = (JSONObject) VehiculosJA.get(i);
                matricula = (String) VehiculoObj.get("matricula");
                marca = (String) VehiculoObj.get("marca");
                tipo = (String) VehiculoObj.get("tipo");
                km = Integer.parseInt ((String) VehiculoObj.get("km"));
                //System.out.println(matricula +  marca + tipo +km);
                if (tipo.equals("T")) {
                    t = new Turismo(matricula, marca, km);
                    this.LVehiculos.add(t);
                }else {
                    f = new Furgoneta(matricula, marca, km);
                    this.LVehiculos.add(f);
                }
                
            }

        } catch (Exception e) {
            System.out.println("eror");
        }
    }
}
