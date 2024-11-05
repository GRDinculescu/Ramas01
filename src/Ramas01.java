import java.util.Scanner;

public class Ramas01 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        while (true) {
            int opcion = 0;

            // Pedir opcion
            while (true) {
                try {
                    System.out.println("""
                    
                    Elige una opcion.
                    1. Agregar nota de un alumno.
                    2. Calcular promedio.
                    3. Mostrar nota mas alta.
                    4. Mostrar nota mas baja.
                    0. Salir
                    ->:""");
                    opcion = sn.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Eso no es una opcion valida.");
                }
            }

            if (opcion == 0) {
                break;
            }

            switch (opcion) {
                case 1 -> Rnotas.agregarNotas(0);
                case 2 -> Rnotas.calcularPromedio(0);
                case 3 -> Rnotas.notaMaxima();
                case 4 -> Rnotas.notaMinima();
                default -> System.out.println("Eso no es una opcion valida.");
            }
        }
    }
}