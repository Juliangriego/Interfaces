public class Repaso2 {
    public static void main (String[] args){
        ClaseCasa casa1 = new ClaseCasa("Teja", "Madera", "Azul", "Calle Falsa 123", 6, 30.0);
        ClaseCasa casa2 = new ClaseCasa("Chapa", "Porcelanato", "Verde", "Calle Falsa 125", 4, 45.5);

        ClaseCasa casaaux;
        casaaux = casa1;
        System.out.println("Tipo de techo: " + casaaux.techo + "| Tipo de piso: " +casaaux.piso + "| Color de la casa: " + casaaux.color + "| Dirección: " + casaaux.direccion + "| Cant. de ambientes: " + casaaux.ambientes + "| Superficie de la casa: " + casaaux.superficie + " m2 |");
        casaaux = casa2;
        System.out.println("Tipo de techo: " + casaaux.techo + "| Tipo de piso: " +casaaux.piso + "| Color de la casa: " + casaaux.color + "| Dirección: " + casaaux.direccion + "| Cant. de ambientes: " + casaaux.ambientes + "| Superficie de la casa: " + casaaux.superficie + " m2 |");
        

    }
}
