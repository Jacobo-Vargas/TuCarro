import org.example.Empleado;
import org.example.EstadoVehiculo;
import org.example.TuCarro;
import org.example.Vehiculo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.*;

public class TestAdicionarVehiculo {
    @Test
    public void test01() throws Exception {// test al nuevo metodo de registrar heviculo
        var tuCarro=new TuCarro();
        var vehiculo=new Vehiculo("IZG95F", EstadoVehiculo.NUEVO,"mazda",2006,4,
                1300,250,4,4,"gasolina");
        tuCarro.registrarVehiculo(vehiculo);
        Assertions.assertEquals(1,tuCarro.getListaVehiculos().size());
        Assertions.assertEquals(vehiculo,tuCarro.getListaVehiculos().get(0));
    }

    @Test
    public void test02() throws Exception {// test al nuevo metodo de registrar si hay vehiculos repetidos
        var tuCarro=new TuCarro();
        var vehiculo=new Vehiculo("IZG95F", EstadoVehiculo.NUEVO,"mazda",2006,4,
                1300,250,4,4,"gasolina");
        tuCarro.registrarVehiculo(vehiculo);
        tuCarro.registrarVehiculo(new Vehiculo("IZG95F", EstadoVehiculo.NUEVO,"mazda",2006,4,
                1300,250,4,4,"gasolina"));
        Assertions.assertEquals(1,tuCarro.getListaVehiculos().size());
    }

}

