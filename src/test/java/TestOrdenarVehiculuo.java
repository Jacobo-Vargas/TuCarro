import org.example.EstadoVehiculo;
import org.example.TuCarro;
import org.example.Vehiculo;
import org.junit.jupiter.api.Test;

public class TestOrdenarVehiculuo {
    @Test
    public void test01() throws Exception {
        var tuCarro=new TuCarro();
        var vehiculo1=new Vehiculo("IZG95F", EstadoVehiculo.USADO,"MUZAN",2023,
                4,100,1500,4,4,"gasolina");

        var vehiculo2=new Vehiculo("WXX30G", EstadoVehiculo.USADO,"MUZAN",2021,
                4,100,1500,4,4,"gasolina");

        var vehiculo3=new Vehiculo("WZS457", EstadoVehiculo.USADO,"MUZAN",1999,
                4,100,1500,4,4,"gasolina");

        var vehiculo4=new Vehiculo("HSR834", EstadoVehiculo.USADO,"MUZAN",2000,
                4,100,1500,4,4,"gasolina");

        var vehiculo5=new Vehiculo("OFK345", EstadoVehiculo.USADO,"MUZAN",2001,
                4,100,1500,4,4,"gasolina");

        tuCarro.registrarVehiculo(vehiculo1);

        tuCarro.registrarVehiculo(vehiculo2);

        tuCarro.registrarVehiculo(vehiculo3);

        tuCarro.registrarVehiculo(vehiculo4);

        tuCarro.registrarVehiculo(vehiculo5);

        tuCarro.getListaVehiculos().forEach(System.out:: println);//Imprime la lista desorganizada

        System.out.println();

        tuCarro.ordenarListaCarroPlaca().forEach(System.out::println); //metodo que ordena la lista
    }
    @Test
    public void test02() throws Exception {
        var tuCarro=new TuCarro();
        var vehiculo1=new Vehiculo("IZG95F", EstadoVehiculo.USADO,"MUZAN",2023,
                4,100,1500,4,4,"gasolina");

        var vehiculo2=new Vehiculo("WXX30G", EstadoVehiculo.USADO,"MUZAN",2021,
                4,100,1500,4,4,"gasolina");

        var vehiculo3=new Vehiculo("WZS457", EstadoVehiculo.USADO,"MUZAN",1999,
                4,100,1500,4,4,"gasolina");

        var vehiculo4=new Vehiculo("HSR834", EstadoVehiculo.USADO,"MUZAN",2000,
                4,100,1500,4,4,"gasolina");

        var vehiculo5=new Vehiculo("OFK345", EstadoVehiculo.USADO,"MUZAN",2001,
                4,100,1500,4,4,"gasolina");

        tuCarro.registrarVehiculo(vehiculo1);

        tuCarro.registrarVehiculo(vehiculo2);

        tuCarro.registrarVehiculo(vehiculo3);

        tuCarro.registrarVehiculo(vehiculo4);

        tuCarro.registrarVehiculo(vehiculo5);

        tuCarro.getListaVehiculos().forEach(System.out:: println);//Imprime la lista desorganizada

        System.out.println("imprimiendo lista ordenada");

        tuCarro.ordenarListaPorModelo().forEach(System.out::println); //metodo que ordena la lista de menor a mayor 
    }


}
