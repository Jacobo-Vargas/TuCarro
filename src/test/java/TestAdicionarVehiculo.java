import model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAdicionarVehiculo {
    @Test
    public void test01() throws Exception {// test al nuevo metodo de registrar heviculo
        var tuCarro=new TuCarro();
        var combustible=new Combustible(true,13f,20);

        var vehiculo=new Vehiculo("IZG95F", EstadoVehiculo.NUEVO,"mazda",2006,4,
                1300,250,combustible);
        tuCarro.registrarVehiculo(vehiculo);
        Assertions.assertEquals(1,tuCarro.getListaVehiculos().size());
        Assertions.assertEquals(vehiculo,tuCarro.getListaVehiculos().get(0));
    }

    @Test
    public void test02() throws Exception {// test al nuevo metodo de registrar si hay vehiculos repetidos
        var tuCarro=new TuCarro();
        var combustible=new Combustible(true,13f,20);
        var vehiculo=new Vehiculo("IZG95F", EstadoVehiculo.NUEVO,"mazda",2006,4,
                1300,250,combustible  );
        tuCarro.registrarVehiculo(vehiculo);
        tuCarro.registrarVehiculo(new Vehiculo("IZG95F", EstadoVehiculo.NUEVO,"mazda",2006,4,
                1300,250,combustible));
        Assertions.assertEquals(1,tuCarro.getListaVehiculos().size());
    }
    @Test
    public void test03() throws Exception {// test al nuevo metodo de registrar si hay vehiculos repetidos
        var tuCarro=new TuCarro();
        var cliente= new Cliente("1094883247","juan");
        var cliente2= new Cliente("1094883248","juan");
        tuCarro.registrarCliente(cliente);
        tuCarro.registrarCliente(cliente2);
        System.out.println(tuCarro.getListaClientes().size());
        tuCarro.borrarCliente("1094883247");
        System.out.println(tuCarro.getListaClientes().size());

    }

}

