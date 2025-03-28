import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Automovil auto = new Automovil("Toyota", 180, 50);
//        Barco barco = new Barco("Yamaha", 60, 100);
//
//        auto.mostrarinf();
//        auto.moverse();
//        auto.consumocombustible(60);
//
//        barco.mostrarinf();
//        barco.moverse();
//        barco.consumocombustible(200);
//        }

        List<Vehiculo> vehiculos = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        boolean estado = true;
        do {
            int opcion;
            System.out.println("""
                    ====== MENÚ DE VEHÍCULOS ======
                    1. AGREGAR AUTOMOVIL
                    2. AGREGAR BARCO
                    3. MOSTRAR VEHICULOS
                    4. MOVER VEHICULOS
                    5. REGISTAR CONSUMO DE COMBUSTIBLE
                    6. SALIR
                    ==============================
                    """);

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese la marca del Auto: ");

                    String marcaAuto = teclado.next();
                    System.out.print("Ingrese velocidad máxima: ");
                    int velAuto = teclado.nextInt();
                    System.out.print("Ingrese combustible inicial: ");
                    double combAuto = teclado.nextDouble();
                    vehiculos.add(new Automovil(marcaAuto, velAuto, combAuto));
                    System.out.println("Auto agregado correctamente.");
                }
                case 2-> {
                    System.out.print("Ingrese marca del Barco: ");
                    String marcaBarco = teclado.next();
                    System.out.print("Ingrese velocidad máxima: ");
                    int velBarco = teclado.nextInt();
                    System.out.print("Ingrese combustible inicial: ");
                    double combBarco = teclado.nextDouble();
                    vehiculos.add(new Barco(marcaBarco, velBarco, combBarco));
                    System.out.println("Barco agregado correctamente.");
                }

                case 3 -> {
                    if (vehiculos.isEmpty()) {
                        System.out.println("No hay vehículos registrados.");
                    } else {
                        for (int i = 0; i < vehiculos.size(); i++) {
                            System.out.println("Vehículo #" + (i + 1));
                            vehiculos.get(i).mostrarinf();
                            if (vehiculos.get(i) instanceof Motor) {
                                System.out.println("Combustible: " + ((Motor) vehiculos.get(i)).getCombustible());
                            }
                        }
                    }
                }

                case 4 -> {
                    if (vehiculos.isEmpty()) {
                        System.out.println("No hay vehículos registrados.");
                    } else {
                        System.out.print("Ingrese el número del vehículo a mover: ");
                        int numMov = teclado.nextInt();
                        if (numMov > 0 && numMov <= vehiculos.size()) {
                            vehiculos.get(numMov - 1).moverse();
                        } else {
                            System.out.println("Número inválido.");
                        }
                    }
                }

                case 5 -> {
                    if (vehiculos.isEmpty()) {
                        System.out.println("No hay vehículos registrados.");
                    } else {
                        System.out.print("Ingrese el número del vehículo: ");
                        int numComb = teclado.nextInt();
                        if (numComb > 0 && numComb <= vehiculos.size() && vehiculos.get(numComb - 1) instanceof Motor) {
                            System.out.print("Ingrese cantidad de combustible a consumir: ");
                            double litros = teclado.nextDouble();
                            ((Motor) vehiculos.get(numComb - 1)).consumocombustible(litros);
                        } else {
                            System.out.println("Número inválido o el vehículo no tiene motor.");
                        }
                    }
                }

                case 6 -> {
                    System.out.println("Saliendo del programa...");
                }
                default ->{
                        System.out.println("Opción inválida. Intente de nuevo.");
                }
            }
        } while (estado);

    }
}



