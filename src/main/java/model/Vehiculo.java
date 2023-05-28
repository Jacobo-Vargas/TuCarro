package model;

public class Vehiculo {
    private final String placa;
    private EstadoVehiculo estadoVehiculo;
    private String marca;
    private int modelo;
    private int cambios;
    private float velocidadMaxima;
    private int cilinbraje;
    private Combustible combustible;

    private float precioVehiculo;

    public Vehiculo(String placa, EstadoVehiculo estadoVehiculo, String marca, int modelo, int cambios,
                    float velocidadMaxima, int cilinbraje, float precioVehiculo,Combustible combustible) throws Exception {
        if(placa.isEmpty() || placa.isBlank() || placa.length()!=6){
            throw new Exception("existe un erro en la placa");
        }else{
            this.placa=placa;
        }
        if(estadoVehiculo==null){
            throw new Exception("el estado del vehiculo no puede ser nulo");
        }else{
            this.estadoVehiculo = estadoVehiculo;
        }
        if(marca.isBlank() || marca.isEmpty()){
            throw new Exception("el vehiculo no puede estar vacio");
        }else{
            this.marca = marca;
        }

      if(modelo< 1980 || modelo> 2023 ){
          throw new Exception("el año no puede ser menor a 1980 o mayor a 2023");
      }else{
          this.modelo = modelo;
      }
        if(cambios <=3 ){
            throw new Exception("el numero de marchas no puede ser menor que 3");
        }else {
            this.cambios = cambios;
        }
        if(velocidadMaxima<=0){
            throw new Exception("la velocidad maxima no puede ser menor o igual a cero");
        }else{
            this.velocidadMaxima = velocidadMaxima;
        }
        if (cilinbraje <= 0){
            throw new Exception("el cilindraje no puede menor o igual a cero");
        }else {this.cilinbraje = cilinbraje;
        }if(combustible==null){
            throw new Exception("El tipo de combustible no puede estar vacio");
        }else {
            this.combustible=combustible;
        }
        if(precioVehiculo ==0){
            throw new Exception("El precio del vehiculo no puede ser inferior a cero");
        }else {
            this.precioVehiculo=precioVehiculo;
        }
    }

    public String getPlaca() {
        return placa;
    }

    public EstadoVehiculo getEstadoVehiculo() {
        return estadoVehiculo;
    }

    public void setEstadoVehiculo(EstadoVehiculo estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public float getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(float velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getCilinbraje() {
        return cilinbraje;
    }

    public void setCilinbraje(int cilinbraje) {
        this.cilinbraje = cilinbraje;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public float getPrecioVehiculo() {
        return precioVehiculo;
    }

    public void setPrecioVehiculo(float precioVehiculo) {
        this.precioVehiculo = precioVehiculo;
    }


    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", estadoVehiculo=" + estadoVehiculo +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", cambios=" + cambios +
                ", velocidadMaxima=" + velocidadMaxima +
                ", cilinbraje=" + cilinbraje +


                '}';
    }
}



