import org.example.Empleado;
import org.example.Login;
import org.example.TuCarro;
import org.junit.jupiter.api.Test;

public class TestLogin {

    @Test
    void Test01Failed() throws Exception {
        TuCarro prueba = new TuCarro();
        Empleado e1 = new Empleado("1094958613", "jacobo", "1234");
        Empleado e2 = new Empleado("1094958612", "juan", "1234@");
        Empleado e3 = new Empleado("1094958611", "luis", "1234luis");
        Empleado e4 = new Empleado("1094958610", "alexis", "1a34@");
        prueba.registrarEmpleado(e1);
        prueba.registrarEmpleado(e2);
        prueba.registrarEmpleado(e3);
        prueba.registrarEmpleado(e4);

        Login uno = new Login(prueba);
        uno.verificarCredenciales("1094958613", "12345");
    }
    @Test
    void Test02Exitoso()throws Exception{
            TuCarro prueba = new TuCarro();
            Empleado e1 = new Empleado("1094958613", "jacobo", "1234");
            Empleado e2 = new Empleado("1094958612", "juan", "1234@");
            Empleado e3 = new Empleado("1094958611", "luis", "1234luis");
            Empleado e4 = new Empleado("1094958610", "alexis", "1a34@");
            prueba.registrarEmpleado(e1);
            prueba.registrarEmpleado(e2);
            prueba.registrarEmpleado(e3);
            prueba.registrarEmpleado(e4);

            Login uno = new Login(prueba);
            uno.verificarCredenciales("1094958612","1234@");
    }
}
