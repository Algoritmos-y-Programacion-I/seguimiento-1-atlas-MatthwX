/*
* Analisis
* Descripcion del programa:
* Entradas:
* Salidas: 
* Ejemplo:
*/

package ui;

import java.util.Scanner;

public class Atlas {

	private Scanner escaner;

    // Declaracion de constantes (completar)
    final double COSTO_TRAYECTO_AVION = 250000;
    final double COSTO_TRAYECTO_BUS = 80000;
    final double COSTO_NOCHES = 150000;
    final int nombre;
    final int edad;
    final int tarjetaidentidad;
    final int cedula;
    final int ciudad;
    final int noches;
    final int transporte;
    final int bus;
    final int avion;
    final int total;
}

	private Atlas() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{   
        // Declaracion de info a pedir del usuario (completar)
        String nombre;
        // Saludo
        System.out.println("Bienvenido al programa de viajes EVENTOS ATLAS realizado por los estudiantes de Algoritmos y programacion I de la Universidad ICESI.");
        // Pedir info al usuario (completar)
        System.out.println("Cual es tu nombre?");
        nombre = escaner.nextLine();

        // ...
        System.out.println("Bienvenido " + nombre + "!");
        // ...

        System.out.println("Cual es tu edad?");
        edad = escaner.nextLine();

        evaluarEdad(edad);

        System.out.println("¿Desde donde te comunicas con nosotros?");
        ciudad = escaner.nextLine();

        System.out.println("Bienvenido a EVENTO ATLAS, ¿cuantas noches deseas hospedarte?");
        noches = escaner.nextLine();

/*
        System.out.println("¿Que medio de transporte usaras? Selecciona 1 para avion o 2 para Bus");

        evaluarTransporte(transporte);
        */

        int multiplicacion;
        int COSTO_NOCHES = noches * COSTO_NOCHES;

        
    }
	
/*
	public static void main(String[] args) {
		Atlas mainApp = new Atlas();
		mainApp.run();
	}
    */

    // Completar metodos para calcular salidas

/*
    /**
	 * Descripción: El método ... permite calcular ...
	 * @param 
	 * @return 
	 */
    /*
    public double calcularTotalTransporte() {
        return 0; // Completar operacion
        */
{
        double totalTransporte
        total = total + (total * 0.1);
        System.out.println("Super! La vas a pasar genial, te quedaras " + noches " en Bogota. Este es el resumen de tu compra");
    }

    public static void evaluarEdad(int edad) {
        if (edad > 18) {
                System.out.println("Digite su cedula");
            } else {
                System.out.println("Digite su tarjeta de identidad");

	
}
    }
/*
    public static void evaluarTransporte(int transporte) {
        if (bus = 2) {
                if (avion = 1);	
}
    }
    */