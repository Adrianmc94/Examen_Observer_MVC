import java.util.Scanner;

public class View {
    public static void menu() {

        Scanner sc = new Scanner(System.in);
        int opcion;
        do {

            System.out.println("--MENU--");
            System.out.println("1. Listar todos los coches");
            System.out.println("2. Añadir un nuevo coche");
            System.out.println("3. Modificar velocidad");
            System.out.println("4. Repostar gasolina");
            System.out.println("5. Avanzar");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();


            switch (opcion) {
                //Caso en el que listamos todos los coches
                case 1:
                String listaDeCoches =  Controller.listarCoches();
                    System.out.println(listaDeCoches);
                    break;

                //Caso en el que pedimos modelo y matricula para crear un nuevo coche
                case 2:
                    System.out.println("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.println("Matricula: ");
                    String matricula = sc.nextLine();
                Controller.crearCoche(modelo, matricula);
                    System.out.println("Coche creado");
                    break;

                //Caso en el que ponemos la nueva velocidad por la matricula del coche
                case 3:
                    System.out.println("Introdice la matricula del vehículo al que le quieres poner una nueva velocidad: ");
                    String matricula1 = sc.nextLine();
                    System.out.println("Nueva velocidad: ");
                    String velocidad = sc.nextLine();
                Controller.modificarVelocidad(matricula1 ,velocidad);
                    System.out.println("Velocidad cambiada");
                    break;

                //caso en el que repostamos gasolina por la matricula del coche
                case 4:
                    System.out.println("Introdice la matricula del vehículo al que quieres repostar: ");
                    String matricula2 = sc.nextLine();
                    System.out.println("Cuanta gasolina quieres añadir(en litros): ");
                    int Litros = sc.nextInt();
                    sc.nextLine();
                Controller.repostarGasolina(matricula2, Litros);
                    System.out.println("Gasolina repostada");
                    break;

                //Caso en el que avanzamos el coche por su matricula
                case 5:
                    System.out.println("Introdice la matricula del vehículo al que quieres que avance: ");
                    String matricula3 = sc.nextLine();
                    System.out.println("Cuanto queires que avance(en metros): ");
                    int Metros = sc.nextInt();
                    sc.nextLine();
                Controller.avanzarCoche(matricula3, Metros);
                    System.out.println("El coche a avanzado");
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;

            }

        } while (opcion != 0);

        sc.close();
    }

}
