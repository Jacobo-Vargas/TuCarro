import org.example.EstadoVehiculo;
import org.example.TuCarro;
import org.example.UtilFiltrar;
import org.example.Vehiculo;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

public class TestUtilFiltrar {
    @Test
    public void test01() throws Exception {//prueba para buscar una placa en especifico
        var tuCarro=new TuCarro();
        var vehiculo1=new Vehiculo("IZG95F", EstadoVehiculo.USADO,"MUZAN",2023,
                4,100,1500,4,4);

        var vehiculo2=new Vehiculo("WXX30G", EstadoVehiculo.USADO,"MUZAN",2021,
                4,100,1500,4,4);

        var vehiculo3=new Vehiculo("WZS457", EstadoVehiculo.USADO,"MUZAN",1999,
                4,100,1500,4,4);

        var vehiculo4=new Vehiculo("HSR834", EstadoVehiculo.USADO,"MUZAN",2000,
                4,100,1500,4,4);

        var vehiculo5=new Vehiculo("OFK345", EstadoVehiculo.USADO,"MUZAN",2001,
                4,100,1500,4,4);

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
        var vehiculo1=new Vehiculo("IZG95F", EstadoVehiculo.USADO,"MUZAN",2023,
                4,100,1500,4,4);

        var vehiculo2=new Vehiculo("WXX30G", EstadoVehiculo.NUEVO,"MUZAN",2021,
                4,100,1500,4,4);

        var vehiculo3=new Vehiculo("WZS457", EstadoVehiculo.NUEVO,"MUZAN",1999,
                4,100,1500,4,4);

        var vehiculo4=new Vehiculo("HSR834", EstadoVehiculo.USADO,"MUZAN",2000,
                4,100,1500,4,4);

        var vehiculo5=new Vehiculo("OFK345", EstadoVehiculo.USADO,"MUZAN",2001,
                4,100,1500,4,4);

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
        var vehiculo1=new Vehiculo("IZG95F", EstadoVehiculo.USADO,"MUZAN",2023,
                4,100,1500,4,4);

        var vehiculo2=new Vehiculo("WXX30G", EstadoVehiculo.NUEVO,"mazda",2021,
                4,100,1500,4,4);

        var vehiculo3=new Vehiculo("WZS457", EstadoVehiculo.NUEVO,"akt",1999,
                4,100,1500,4,4);

        var vehiculo4=new Vehiculo("HSR834", EstadoVehiculo.USADO,"bmw",2000,
                4,100,1500,4,4);

        var vehiculo5=new Vehiculo("OFK345", EstadoVehiculo.USADO,"MUZAN",2001,
                4,100,1500,4,4);

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
        var vehiculo1=new Vehiculo("IZG95F", EstadoVehiculo.USADO,"MUZAN",2023,
                4,100,1500,4,4);

        var vehiculo2=new Vehiculo("WXX30G", EstadoVehiculo.NUEVO,"MUZAN",2021,
                4,100,1500,4,4);

        var vehiculo3=new Vehiculo("WZS457", EstadoVehiculo.NUEVO,"MUZAN",1999,
                4,100,1500,4,4);

        var vehiculo4=new Vehiculo("HSR834", EstadoVehiculo.USADO,"MUZAN",2000,
                4,100,1500,4,4);

        var vehiculo5=new Vehiculo("OFK345", EstadoVehiculo.USADO,"MUZAN",2023,
                4,100,1500,4,4);

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
        var vehiculo1=new Vehiculo("IZG95F", EstadoVehiculo.USADO,"MUZAN",2023,
                4,100,1500,4,4);

        var vehiculo2=new Vehiculo("WXX30G", EstadoVehiculo.NUEVO,"MUZAN",2021,
                4,100,1500,4,4);

        var vehiculo3=new Vehiculo("WZS457", EstadoVehiculo.NUEVO,"MUZAN",1999,
                5,100,1500,4,4);

        var vehiculo4=new Vehiculo("HSR834", EstadoVehiculo.USADO,"MUZAN",2000,
                6,100,1500,4,4);

        var vehiculo5=new Vehiculo("OFK345", EstadoVehiculo.USADO,"MUZAN",2023,
                4,100,1500,4,4);

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
        var vehiculo1=new Vehiculo("IZG95F", EstadoVehiculo.USADO,"MUZAN",2023,
                4,100,1500,4,4);

        var vehiculo2=new Vehiculo("WXX30G", EstadoVehiculo.NUEVO,"MUZAN",2021,
                4,120,1500,4,4);

        var vehiculo3=new Vehiculo("WZS457", EstadoVehiculo.NUEVO,"MUZAN",1999,
                5,149,1500,4,4);

        var vehiculo4=new Vehiculo("HSR834", EstadoVehiculo.USADO,"MUZAN",2000,
                6,150,1500,4,4);

        var vehiculo5=new Vehiculo("OFK345", EstadoVehiculo.USADO,"MUZAN",2023,
                4,150,1500,4,4);

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
        var vehiculo1=new Vehiculo("IZG95F", EstadoVehiculo.USADO,"MUZAN",2023,
                4,100,150,4,4);

        var vehiculo2=new Vehiculo("WXX30G", EstadoVehiculo.NUEVO,"MUZAN",2021,
                4,120,200,4,4);

        var vehiculo3=new Vehiculo("WZS457", EstadoVehiculo.NUEVO,"MUZAN",1999,
                5,149,300,4,4);

        var vehiculo4=new Vehiculo("HSR834", EstadoVehiculo.USADO,"MUZAN",2000,
                6,150,600,4,4);

        var vehiculo5=new Vehiculo("OFK345", EstadoVehiculo.USADO,"MUZAN",2023,
                4,150,1290,4,4);

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
        var vehiculo1=new Vehiculo("IZG95F", EstadoVehiculo.USADO,"MUZAN",2023,
                4,100,150,4,4);

        var vehiculo2=new Vehiculo("WXX30G", EstadoVehiculo.NUEVO,"MUZAN",2021,
                4,120,200,2,4);

        var vehiculo3=new Vehiculo("WZS457", EstadoVehiculo.NUEVO,"MUZAN",1999,
                5,149,300,6,4);

        var vehiculo4=new Vehiculo("HSR834", EstadoVehiculo.USADO,"MUZAN",2000,
                6,150,600,40,4);

        var vehiculo5=new Vehiculo("OFK345", EstadoVehiculo.USADO,"MUZAN",2023,
                4,150,1290,10,4);

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
        var vehiculo1=new Vehiculo("IZG95F", EstadoVehiculo.USADO,"MUZAN",2023,
                4,100,150,4,4);

        var vehiculo2=new Vehiculo("WXX30G", EstadoVehiculo.NUEVO,"MUZAN",2021,
                4,120,200,2,2);

        var vehiculo3=new Vehiculo("WZS457", EstadoVehiculo.NUEVO,"MUZAN",1999,
                5,149,300,6,2);

        var vehiculo4=new Vehiculo("HSR834", EstadoVehiculo.USADO,"MUZAN",2000,
                6,150,600,40,4);

        var vehiculo5=new Vehiculo("OFK345", EstadoVehiculo.USADO,"MUZAN",2023,
                4,150,1290,10,4);

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
}
