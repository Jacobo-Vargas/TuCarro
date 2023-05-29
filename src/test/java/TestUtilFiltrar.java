import model.*;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

public class TestUtilFiltrar {
    @Test
    public void test01() throws Exception {//prueba para buscar una placa en especifico
        var tuCarro=new TuCarro();
        var combustible=new Combustible(true,13f,20);
        var combustible2=new Combustible(true,true,true);
        var combustible3=new Combustible(true,true,true);
        var combustible4=new Combustible(true,true,true);
        var combustible5=new Combustible(true,true,true);
        var vehiculo1=new Vehiculo("IZG95F", EstadoVehiculo.USADO,"MUZAN",2023,
                4,100,1500,combustible);

        var vehiculo2=new Vehiculo("WXX30G", EstadoVehiculo.USADO,"MUZAN",2021,
                4,100,1500,combustible2 );

        var vehiculo3=new Vehiculo("WZS457", EstadoVehiculo.USADO,"MUZAN",1999,
                4,100,1500, combustible3);

        var vehiculo4=new Vehiculo("HSR834", EstadoVehiculo.USADO,"MUZAN",2000,
                4,100,1500, combustible4);

        var vehiculo5=new Vehiculo("OFK345", EstadoVehiculo.USADO,"MUZAN",2001,
                4,100,1500, combustible5);

        tuCarro.registrarVehiculo(vehiculo1);

        tuCarro.registrarVehiculo(vehiculo2);

        tuCarro.registrarVehiculo(vehiculo3);

        tuCarro.registrarVehiculo(vehiculo4);

        tuCarro.registrarVehiculo(vehiculo5);

        var resultado=tuCarro.getListaVehiculos().stream().filter(UtilFiltrar.filtrar("IZG95F",null,null,
                0,0,0,0,0,0,null))
                .collect(Collectors.toList());
        resultado.forEach(System.out::println);
    }
    @Test
    public void test02() throws Exception {//prueba para filtrar por nuevo o usado
        var tuCarro=new TuCarro();
        var combustible=new Combustible(true,13f,20);
        var combustible2=new Combustible(true,true,true);
        var combustible3=new Combustible(true,true,true);
        var combustible4=new Combustible(true,true,true);
        var combustible5=new Combustible(true,true,true);
        var vehiculo1=new Vehiculo("IZG95F", EstadoVehiculo.USADO,"MUZAN",2023,
                4,100,1500,combustible );

        var vehiculo2=new Vehiculo("WXX30G", EstadoVehiculo.NUEVO,"MUZAN",2021,
                4,100,1500, combustible2);

        var vehiculo3=new Vehiculo("WZS457", EstadoVehiculo.NUEVO,"MUZAN",1999,
                4,100,1500, combustible3);

        var vehiculo4=new Vehiculo("HSR834", EstadoVehiculo.USADO,"MUZAN",2000,
                4,100,1500, combustible4);

        var vehiculo5=new Vehiculo("OFK345", EstadoVehiculo.USADO,"MUZAN",2001,
                4,100,1500, combustible5);

        tuCarro.registrarVehiculo(vehiculo1);

        tuCarro.registrarVehiculo(vehiculo2);

        tuCarro.registrarVehiculo(vehiculo3);

        tuCarro.registrarVehiculo(vehiculo4);

        tuCarro.registrarVehiculo(vehiculo5);

        var resultado=tuCarro.getListaVehiculos().stream().filter(UtilFiltrar.filtrar(null,EstadoVehiculo.USADO,null,
                        0,0,0,0,0,0,null))
                .collect(Collectors.toList());
        resultado.forEach(System.out::println);
        System.out.println("separar ");

        var resultado2=tuCarro.getListaVehiculos().stream().filter(UtilFiltrar.filtrar(null,EstadoVehiculo.NUEVO,null,
                        0,0,0,0,0,0,null))
                .collect(Collectors.toList());
        resultado2.forEach(System.out::println);
    }
    @Test
    public void test03() throws Exception {//prueba para filtrar por marca del vehiculo
        var tuCarro=new TuCarro();
        var combustible=new Combustible(true,13f,20);
        var combustible2=new Combustible(true,true,true);
        var combustible3=new Combustible(true,true,true);
        var combustible4=new Combustible(true,true,true);
        var combustible5=new Combustible(true,true,true);
        var vehiculo1=new Vehiculo("IZG95F", EstadoVehiculo.USADO,"MUZAN",2023,
                4,100,1500, combustible);

        var vehiculo2=new Vehiculo("WXX30G", EstadoVehiculo.NUEVO,"mazda",2021,
                4,100,1500, combustible2);

        var vehiculo3=new Vehiculo("WZS457", EstadoVehiculo.NUEVO,"akt",1999,
                4,100,1500, combustible3);

        var vehiculo4=new Vehiculo("HSR834", EstadoVehiculo.USADO,"bmw",2000,
                4,100,1500, combustible4);

        var vehiculo5=new Vehiculo("OFK345", EstadoVehiculo.USADO,"MUZAN",2001,
                4,100,1500, combustible5);

        tuCarro.registrarVehiculo(vehiculo1);

        tuCarro.registrarVehiculo(vehiculo2);

        tuCarro.registrarVehiculo(vehiculo3);

        tuCarro.registrarVehiculo(vehiculo4);

        tuCarro.registrarVehiculo(vehiculo5);

        var resultado=tuCarro.getListaVehiculos().stream().filter(UtilFiltrar.filtrar(null,null,"MUZAN",
                        0,0,0,0,0,0,null))
                .collect(Collectors.toList());
        resultado.forEach(System.out::println);
    }
    @Test
    public void test04() throws Exception {//prueba para filtrar por modelo del vehiculo
        var tuCarro=new TuCarro();
        var combustible=new Combustible(true,13f,20);
        var combustible2=new Combustible(true,true,true);
        var combustible3=new Combustible(true,true,true);
        var combustible4=new Combustible(true,true,true);
        var combustible5=new Combustible(true,true,true);
        var vehiculo1=new Vehiculo("IZG95F", EstadoVehiculo.USADO,"MUZAN",2023,
                4,100,1500,combustible );

        var vehiculo2=new Vehiculo("WXX30G", EstadoVehiculo.NUEVO,"MUZAN",2021,
                4,100,1500, combustible2);

        var vehiculo3=new Vehiculo("WZS457", EstadoVehiculo.NUEVO,"MUZAN",1999,
                4,100,1500, combustible3);

        var vehiculo4=new Vehiculo("HSR834", EstadoVehiculo.USADO,"MUZAN",2000,
                4,100,1500, combustible4);

        var vehiculo5=new Vehiculo("OFK345", EstadoVehiculo.USADO,"MUZAN",2023,
                4,100,1500, combustible5);

        tuCarro.registrarVehiculo(vehiculo1);

        tuCarro.registrarVehiculo(vehiculo2);

        tuCarro.registrarVehiculo(vehiculo3);

        tuCarro.registrarVehiculo(vehiculo4);

        tuCarro.registrarVehiculo(vehiculo5);

        var resultado=tuCarro.getListaVehiculos().stream().filter(UtilFiltrar.filtrar(null,null,null,
                        2023,0,0,0,0,0,null))
                .collect(Collectors.toList());
        resultado.forEach(System.out::println);
        System.out.println("separar ");

    }
    @Test
    public void test05() throws Exception {//prueba para filtrar por numero de cambios o marchas 
        var tuCarro=new TuCarro();
        var combustible=new Combustible(true,13f,20);
        var combustible2=new Combustible(true,true,true);
        var combustible3=new Combustible(true,true,true);
        var combustible4=new Combustible(true,true,true);
        var combustible5=new Combustible(true,true,true);
        var vehiculo1=new Vehiculo("IZG95F", EstadoVehiculo.USADO,"MUZAN",2023,
                4,100,1500,combustible );

        var vehiculo2=new Vehiculo("WXX30G", EstadoVehiculo.NUEVO,"MUZAN",2021,
                4,100,1500, combustible2);

        var vehiculo3=new Vehiculo("WZS457", EstadoVehiculo.NUEVO,"MUZAN",1999,
                5,100,1500, combustible3);

        var vehiculo4=new Vehiculo("HSR834", EstadoVehiculo.USADO,"MUZAN",2000,
                6,100,1500, combustible4);

        var vehiculo5=new Vehiculo("OFK345", EstadoVehiculo.USADO,"MUZAN",2023,
                4,100,1500, combustible5);

        tuCarro.registrarVehiculo(vehiculo1);

        tuCarro.registrarVehiculo(vehiculo2);

        tuCarro.registrarVehiculo(vehiculo3);

        tuCarro.registrarVehiculo(vehiculo4);

        tuCarro.registrarVehiculo(vehiculo5);

        var resultado=tuCarro.getListaVehiculos().stream().filter(UtilFiltrar.filtrar(null,null,null,
                        0,6,0,0,0,0,null))
                .collect(Collectors.toList());
        resultado.forEach(System.out::println);
        System.out.println("separar");

    }
    @Test
    public void test06() throws Exception {//prueba para filtrar por velicidad maxima
        var tuCarro=new TuCarro();
        var combustible=new Combustible(true,13f,20);
        var combustible2=new Combustible(true,true,true);
        var combustible3=new Combustible(true,true,true);
        var combustible4=new Combustible(true,true,true);
        var combustible5=new Combustible(true,true,true);
        var vehiculo1=new Vehiculo("IZG95F", EstadoVehiculo.USADO,"MUZAN",2023,
                4,100,1500, combustible);

        var vehiculo2=new Vehiculo("WXX30G", EstadoVehiculo.NUEVO,"MUZAN",2021,
                4,120,1500, combustible2);

        var vehiculo3=new Vehiculo("WZS457", EstadoVehiculo.NUEVO,"MUZAN",1999,
                5,149,1500, combustible3);

        var vehiculo4=new Vehiculo("HSR834", EstadoVehiculo.USADO,"MUZAN",2000,
                6,150,1500, combustible4);

        var vehiculo5=new Vehiculo("OFK345", EstadoVehiculo.USADO,"MUZAN",2023,
                4,150,1500,combustible5 );

        tuCarro.registrarVehiculo(vehiculo1);

        tuCarro.registrarVehiculo(vehiculo2);

        tuCarro.registrarVehiculo(vehiculo3);

        tuCarro.registrarVehiculo(vehiculo4);

        tuCarro.registrarVehiculo(vehiculo5);

        var resultado=tuCarro.getListaVehiculos().stream().filter(UtilFiltrar.filtrar(null,null,null,
                        0,0,150,0,0,0,null))
                .collect(Collectors.toList());
        resultado.forEach(System.out::println);
        System.out.println("separar");

    }
    @Test
    public void test07() throws Exception {//prueba para filtrar por cilinbraje
        var tuCarro=new TuCarro();
        var combustible=new Combustible(true,13f,20);
        var combustible2=new Combustible(true,true,true);
        var combustible3=new Combustible(true,true,true);
        var combustible4=new Combustible(true,true,true);
        var combustible5=new Combustible(true,true,true);
        var vehiculo1=new Vehiculo("IZG95F", EstadoVehiculo.USADO,"MUZAN",2023,
                4,100,150,combustible );

        var vehiculo2=new Vehiculo("WXX30G", EstadoVehiculo.NUEVO,"MUZAN",2021,
                4,120,200, combustible2);

        var vehiculo3=new Vehiculo("WZS457", EstadoVehiculo.NUEVO,"MUZAN",1999,
                5,149,300, combustible3);

        var vehiculo4=new Vehiculo("HSR834", EstadoVehiculo.USADO,"MUZAN",2000,
                6,150,600, combustible4);

        var vehiculo5=new Vehiculo("OFK345", EstadoVehiculo.USADO,"MUZAN",2023,
                4,150,1290, combustible5);

        tuCarro.registrarVehiculo(vehiculo1);

        tuCarro.registrarVehiculo(vehiculo2);

        tuCarro.registrarVehiculo(vehiculo3);

        tuCarro.registrarVehiculo(vehiculo4);

        tuCarro.registrarVehiculo(vehiculo5);

        var resultado=tuCarro.getListaVehiculos().stream().filter(UtilFiltrar.filtrar(null,null,null,
                        0,0,0,200,0,0,null))
                .collect(Collectors.toList());
        resultado.forEach(System.out::println);
        System.out.println("separar");

    }
    @Test
    public void test08() throws Exception {//prueba para filtrar por numero de pasajeros
        var tuCarro=new TuCarro();
        var combustible=new Combustible(true,13f,20);
        var combustible2=new Combustible(true,true,true);
        var combustible3=new Combustible(true,true,true);
        var combustible4=new Combustible(true,true,true);
        var combustible5=new Combustible(true,true,true);
        var vehiculo1=new Vehiculo("IZG95F", EstadoVehiculo.USADO,"MUZAN",2023,
                4,100,150, combustible);

        var vehiculo2=new Vehiculo("WXX30G", EstadoVehiculo.NUEVO,"MUZAN",2021,
                4,120,200, combustible2);

        var vehiculo3=new Vehiculo("WZS457", EstadoVehiculo.NUEVO,"MUZAN",1999,
                5,149,300, combustible3);

        var vehiculo4=new Vehiculo("HSR834", EstadoVehiculo.USADO,"MUZAN",2000,
                6,150,600, combustible4);

        var vehiculo5=new Vehiculo("OFK345", EstadoVehiculo.USADO,"MUZAN",2023,
                4,150,1290, combustible5);

        tuCarro.registrarVehiculo(vehiculo1);

        tuCarro.registrarVehiculo(vehiculo2);

        tuCarro.registrarVehiculo(vehiculo3);

        tuCarro.registrarVehiculo(vehiculo4);

        tuCarro.registrarVehiculo(vehiculo5);

        var resultado=tuCarro.getListaVehiculos().stream().filter(UtilFiltrar.filtrar(null,null,null,
                        0,0,0,0,2,0,null))
                .collect(Collectors.toList());
        resultado.forEach(System.out::println);
        System.out.println("separar");

    }
    @Test
    public void test09() throws Exception {//prueba para filtrar por numero de pasajeros
        var tuCarro=new TuCarro();
        var combustible=new Combustible(true,13f,20);
        var combustible2=new Combustible(true,true,true);
        var combustible3=new Combustible(true,true,true);
        var combustible4=new Combustible(true,true,true);
        var combustible5=new Combustible(true,true,true);
        var vehiculo1=new Vehiculo("IZG95F", EstadoVehiculo.USADO,"MUZAN",2023,
                4,100,150,combustible );

        var vehiculo2=new Vehiculo("WXX30G", EstadoVehiculo.NUEVO,"MUZAN",2021,
                4,120,200,combustible2 );

        var vehiculo3=new Vehiculo("WZS457", EstadoVehiculo.NUEVO,"MUZAN",1999,
                5,149,300,combustible3 );

        var vehiculo4=new Vehiculo("HSR834", EstadoVehiculo.USADO,"MUZAN",2000,
                6,150,600,combustible4 );

        var vehiculo5=new Vehiculo("OFK345", EstadoVehiculo.USADO,"MUZAN",2023,
                4,150,1290,combustible5 );

        tuCarro.registrarVehiculo(vehiculo1);

        tuCarro.registrarVehiculo(vehiculo2);

        tuCarro.registrarVehiculo(vehiculo3);

        tuCarro.registrarVehiculo(vehiculo4);

        tuCarro.registrarVehiculo(vehiculo5);

        var resultado=tuCarro.getListaVehiculos().stream().filter(UtilFiltrar.filtrar(null,null,null,
                        0,0,0,0,0,2,null))
                .collect(Collectors.toList());
        resultado.forEach(System.out::println);
        System.out.println("separar");
    }
   /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   // De aqui en adelante se le realizaron pruebas unitarias a los metodos de filtrar cliente y empleado
   @Test
   public void test10() throws Exception {//filtrar cliente por numero de documento
       var tuCarro = new TuCarro();
       var cliente=new Cliente("1094883247", "juan jose");

       var cliente2=new Cliente("1122334455", "juan jose");

       var cliente3=new Cliente("1234567890", "juan jose");

       var cliente4=new Cliente("3235006677", "juan jose");

       var cliente5=new Cliente("3128638699", "juan jose");
       tuCarro.registrarCliente(cliente);

       tuCarro.registrarCliente(cliente2);

       tuCarro.registrarCliente(cliente3);

       tuCarro.registrarCliente(cliente4);

       tuCarro.registrarCliente(cliente5);
       var resultado=tuCarro.getListaClientes().stream().filter(UtilFiltrar.filtrarCliente("3235006677",
               null,null)).collect(Collectors.toList());

       resultado.forEach(System.out::println);
   }
    @Test
    public void test11() throws Exception {//filtrar cliente por nombre
        var tuCarro = new TuCarro();
        var cliente=new Cliente("1094883247", "juan jose");

        var cliente2=new Cliente("1122334455", "juan pablo");

        var cliente3=new Cliente("1234567890", "laura");

        var cliente4=new Cliente("3235006677", "juan carlos");

        var cliente5=new Cliente("3128638699", "lukas");
        tuCarro.registrarCliente(cliente);

        tuCarro.registrarCliente(cliente2);

        tuCarro.registrarCliente(cliente3);

        tuCarro.registrarCliente(cliente4);

        tuCarro.registrarCliente(cliente5);
        var resultado=tuCarro.getListaClientes().stream().filter(UtilFiltrar.filtrarCliente(null,
                "juan pablo",null)).collect(Collectors.toList());

        resultado.forEach(System.out::println);
    }
    @Test
    public void test12() throws Exception {//filtrar cliente por password
        var tuCarro = new TuCarro();
        var cliente=new Cliente("1094883247", "juan jose");

        var cliente2=new Cliente("1122334455", "juan jose");

        var cliente3=new Cliente("1234567890", "juan jose");

        var cliente4=new Cliente("3235006677", "juan jose");

        var cliente5=new Cliente("3128638699", "juan jose");
        tuCarro.registrarCliente(cliente);

        tuCarro.registrarCliente(cliente2);

        tuCarro.registrarCliente(cliente3);

        tuCarro.registrarCliente(cliente4);

        tuCarro.registrarCliente(cliente5);
        var resultado=tuCarro.getListaClientes().stream().filter(UtilFiltrar.filtrarCliente(null,
                null,"2004")).collect(Collectors.toList());

        resultado.forEach(System.out::println);
    }
    @Test
    public void test13() throws Exception {//filtrar Empleado por documento
        var tuCarro = new TuCarro();

        var empleado=new Empleado("1094883247", "juan jose", "2045");

        var empleado2=new Empleado("1122334455", "juan jose", "2004");

        var empleado3=new Empleado("1234567890", "juan jose", "2030");

        var empleado4=new Empleado("3235006677", "juan jose", "1000");

        var empleado5=new Empleado("3128638699", "juan jose", "5000");
        tuCarro.registrarEmpleado(empleado);

        tuCarro.registrarEmpleado(empleado2);

        tuCarro.registrarEmpleado(empleado3);

        tuCarro.registrarEmpleado(empleado4);

        tuCarro.registrarEmpleado(empleado5);

        var resultado=tuCarro.getListaEmpleados().stream().filter(UtilFiltrar.filtrarEmpleado("1234567890",
                null,null));

        resultado.forEach(System.out::println);
    }
    @Test
    public void test14() throws Exception {//filtrar Empleado por nombre
        var tuCarro = new TuCarro();

        var empleado=new Empleado("1094883247", "juan carlos", "2045");

        var empleado2=new Empleado("1122334455", "juana", "2004");

        var empleado3=new Empleado("1234567890", "juan pablo", "2030");

        var empleado4=new Empleado("3235006677", "candela", "1000");

        var empleado5=new Empleado("3128638699", "jacobo", "5000");
        tuCarro.registrarEmpleado(empleado);

        tuCarro.registrarEmpleado(empleado2);

        tuCarro.registrarEmpleado(empleado3);

        tuCarro.registrarEmpleado(empleado4);

        tuCarro.registrarEmpleado(empleado5);

        var resultado=tuCarro.getListaEmpleados().stream().filter(UtilFiltrar.filtrarEmpleado(null,
                "jacobo",null));

        resultado.forEach(System.out::println);
    }
    @Test
    public void test15() throws Exception {//filtrar Empleado por passcliente
        var tuCarro = new TuCarro();

        var empleado=new Empleado("1094883247", "juan carlos", "2045");

        var empleado2=new Empleado("1122334455", "juana", "2004");

        var empleado3=new Empleado("1234567890", "juan pablo", "2030");

        var empleado4=new Empleado("3235006677", "candela", "1000");

        var empleado5=new Empleado("3128638699", "jacobo", "5000");
        tuCarro.registrarEmpleado(empleado);

        tuCarro.registrarEmpleado(empleado2);

        tuCarro.registrarEmpleado(empleado3);

        tuCarro.registrarEmpleado(empleado4);

        tuCarro.registrarEmpleado(empleado5);

        var resultado=tuCarro.getListaEmpleados().stream().filter(UtilFiltrar.filtrarEmpleado(null,
                null,"5000"));

        resultado.forEach(System.out::println);
    }
}
