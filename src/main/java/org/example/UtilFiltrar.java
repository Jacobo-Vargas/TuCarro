package org.example;

import java.util.function.Predicate;

public class UtilFiltrar {
   public  static Predicate<Vehiculo> filtrarNumeroPlaca(String placa){
       Predicate<Vehiculo > predicate = new Predicate<Vehiculo>() {
           @Override
           public boolean test(Vehiculo vehiculo) {
               return vehiculo.getPlaca()==placa;
           }
       };
       return predicate;
   }


}
