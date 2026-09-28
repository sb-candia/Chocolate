public class Main {
    public static void main(String[] args) {
        FabricChocolate miBoiler = FabricChocolate.getInstancia();

        System.out.println("--- INICIANDO PROCESO ---");
        miBoiler.llenar();
        miBoiler.mezclar();
        miBoiler.vaciar();
        System.out.println("--- PROCESO TERMINADO ---");
        
        System.out.println("\n--- PRUEBA DE ERROR ---");
        miBoiler.vaciar(); 
    }
}