package A6_Herencia;

// CLASE PADRE
public class Animal {
    protected void comer(){
        System.out.println("Como muchas veces al dia");
    }

    protected void dormir(){
        System.out.println("Duermo muchas horas");
    }
}
// CLASE HIJA
class Perro extends Animal{
    public void hacerSonido(){
        System.out.println("Puedo ladrar");
    }
}

class PruebaAnimal{
    public static void main(String[] args) {

        System.out.println("*** Ejemplo de Herencia ***");

        System.out.println("Clase Padre, soy una Animal");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();

        System.out.println("\nClase Hija, Soy un perro");
        var perro1 = new Perro();
        perro1.comer();
        perro1.dormir();
        perro1.hacerSonido();
    }
}