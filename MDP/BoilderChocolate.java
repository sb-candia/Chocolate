public class BoilderChocolate {
    
    private static BoilderChocolate instanciaUnica;
    
    private boolean vacio;
    private boolean resistenciaApagada;

    private BoilderChocolate() {
        // Estado inicial del boiler: vacío y resistencia apagada
        vacio = true; 
        resistenciaApagada = true; 
    }
    
    public static BoilderChocolate getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new BoilderChocolate();
        }
        return instanciaUnica;
    }

    public void llenar() {
        if (vacio == true && resistenciaApagada == true) {
            System.out.println("Llenando el boiler con chocolate y leche...");
            vacio = false; 
        } else {
            System.out.println("Error: El boiler debe estar vacío y apagado para llenarse.");
        }
    }

    public void mezclar() {
        if (vacio == false && resistenciaApagada == true) {
            System.out.println("Iniciando la mezcla...");
            resistenciaApagada = false; 
        } else {
            System.out.println("Error: El boiler debe estar lleno y la resistencia apagada para mezclar.");
        }
    }

    public void vaciar() {
        if (vacio == false && resistenciaApagada == false) {
            System.out.println("Vaciando el boiler...");
            vacio = true; 
            resistenciaApagada = true; 
        } else {
            System.out.println("Error: El boiler debe estar lleno y la resistencia encendida para vaciar.");
        }
    }
}