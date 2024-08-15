package src.clase2.ejemplo2;

/**
 * Created by Michael Garcia on 13/08/24
 */
class Animal {
    void sonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {

    void sonido() {
        System.out.println("El perro ladra");
    }
}

class Gato extends Animal {

    @Override
    void sonido() {
        System.out.println("El gato maúlla");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Animal();
        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        miAnimal.sonido();  // Salida: El animal hace un sonido
        miPerro.sonido();   // Salida: El perro ladra
        miGato.sonido();    // Salida: El gato maúlla
    }
}

