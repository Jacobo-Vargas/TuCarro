import org.example.Empleado;
import org.example.TuCarro;
import org.example.Vehiculo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestAdicionarVehiculo {
    @Test
    public void test01() throws Exception {//adicinar carro desde tuCarro
        var tuCarro=new TuCarro();
        var vehiculo=new Vehiculo("IZG95F");
        tuCarro.registrarVehiculo(vehiculo);
        Assertions.assertEquals(1,tuCarro.getListaVehiculos().size());
        Assertions.assertEquals(vehiculo,tuCarro.getListaVehiculos().get(0));
    }
    @Test
    public void test02() throws Exception {//adicinar carro desde Empleado
        var tuCarro=new TuCarro();
        var empleado=new Empleado("1094883247","juan pablo","2435");
        var vehiculo=new Vehiculo("IZG95F");
        empleado.agregarVehiculo(tuCarro,vehiculo);
        Assertions.assertEquals(1,tuCarro.getListaVehiculos().size());
        Assertions.assertEquals(vehiculo,tuCarro.getListaVehiculos().get(0));
    }
    @Test
    public void test03() throws Exception {//verifacar que no se agregen vehiculos repetidos
        var tuCarro=new TuCarro();
        var empleado=new Empleado("1094883247","juan pablo","2435");
        var vehiculo=new Vehiculo("IZG95F");
        var vehiculo2=new Vehiculo("IZG95F");
        tuCarro.registrarVehiculo(vehiculo);
        Assertions.assertThrows(Exception.class,()->empleado.agregarVehiculo(tuCarro,vehiculo2));
    }

}
