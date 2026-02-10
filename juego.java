import java.util.Scanner;
import java.util.Random;

class Juego {

    private int eleccionJugador;
    private int eleccionComputadora;

    public void jugar() {

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        System.out.println("🎮 PIEDRA, PAPEL O TIJERA");
        System.out.println("Elige una opción:");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");

        eleccionJugador = entrada.nextInt();
        eleccionComputadora = random.nextInt(3) + 1;

        System.out.println("Tú elegiste: " + nombre(eleccionJugador));
        System.out.println("La computadora eligió: " + nombre(eleccionComputadora));

        mostrarResultado();

        entrada.close();
    }

    private void mostrarResultado() {

        if (eleccionJugador == eleccionComputadora) {
            System.out.println("🤝 Empate");
        } else if (
                (eleccionJugador == 1 && eleccionComputadora == 3) ||
                        (eleccionJugador == 2 && eleccionComputadora == 1) ||
                        (eleccionJugador == 3 && eleccionComputadora == 2)
        ) {
            System.out.println("🎉 ¡Ganaste!");
        } else {
            System.out.println("😢 Perdiste");
        }
    }

    private String nombre(int opcion) {
        if (opcion == 1) return "Piedra";
        if (opcion == 2) return "Papel";
        return "Tijera";
    }
}
