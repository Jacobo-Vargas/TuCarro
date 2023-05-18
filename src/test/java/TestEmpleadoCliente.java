import org.example.Cliente;
import org.example.Empleado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEmpleadoCliente {
    @Test
    public void test01() throws Exception {// test a la clase cliente documento null
        Assertions.assertThrows(Exception.class, ()->new Cliente(null,"juan","23d"));
    }
    @Test
    public void test02(){// test a la clase cliente documento espacios vacios
        Assertions.assertThrows(Exception.class, ()->new Cliente("  ","juan","23d"));
    }
    @Test
    public void test03(){// test a la clase cliente nombre null
        Assertions.assertThrows(Exception.class, ()->new Cliente("1094883247",null,"23d"));
    }
    @Test
    public void test04(){// test a la clase cliente nombre espacios vacios
        Assertions.assertThrows(Exception.class, ()->new Cliente("1094883247","  ","23d"));
    }
    @Test
    public void test05(){// test a la clase cliente password null
        Assertions.assertThrows(Exception.class, ()->new Cliente("1094883247","juan",null));
    }
    @Test
    public void test06(){// test a la clase cliente password espacios vacios
        Assertions.assertThrows(Exception.class, ()->new Cliente("1094883247",null,"   "));
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////// Pruebas unitarias a la clase cliente/////////////////////////////////////////////////////////////////////
    @Test
    public void test07(){// test a la clase Empleado documento null
        Assertions.assertThrows(Exception.class, ()->new Empleado(null,"juan","ewdfs"));
    }
    @Test
    public void test08(){// test a la clase Empleado docuemnto espacios vacios
        Assertions.assertThrows(Exception.class, ()->new Empleado("  ","juan","ewdfs"));
    }
    @Test
    public void test09(){// test a la clase Empleado nombre null
        Assertions.assertThrows(Exception.class, ()->new Empleado("1094883247",null,"ewdfs"));
    }
    @Test
    public void test10(){// test a la clase Empleado nombre espacios vacios
        Assertions.assertThrows(Exception.class, ()->new Empleado("1094883247","   ","ewdfs"));
    }
    @Test
    public void test11(){// test a la clase Empleado passcliente null
        Assertions.assertThrows(Exception.class, ()->new Empleado("1094883247","juan",null));
    }
    @Test
    public void test12(){// test a la clase Empleado passCliente espacios vacios
        Assertions.assertThrows(Exception.class, ()->new Empleado("1094883247","juan","   "));
    }

}
