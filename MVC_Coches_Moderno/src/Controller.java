public class Controller {

//Como la View no se comunica con el model lo hacemos con el Controller, aqui le indocamos las funciones al model.
    public static String listarCoches() {
         return Model.listarCoches();
    }

    public static void crearCoche(String modelo, String matricula) {
        Model.crearCoche(modelo, matricula);
    }

    public static void modificarVelocidad(String matricula1, String velocidad) {
        Model.modificarVelocidad(matricula1, velocidad);
    }

    public static void repostarGasolina(String matricula2, int litros) {
        Model.repostarGasolina(matricula2, litros);
    }

    public static void avanzarCoche(String matricula3, int metros) {
        Model.avanzarCoche(matricula3, metros);
    }
}
