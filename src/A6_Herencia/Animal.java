package A6_Herencia;

// CLASE PADRE
public class Animal {
    protected void comer(){
        System.out.println("Como muchas veces al dia");
    }

    protected void dormir(){
        System.out.println("Duermo muchas horas");
    }

    protected void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
}
// CLASE HIJA
class Perro extends Animal{
    @Override
    protected void hacerSonido(){
        System.out.println("El perro hace Wauf");
    }

    //Modificar comportamiento heredado de la clase padre
    @Override // Recomendacion Anotacion
    protected void dormir(){
        System.out.println("Duermo 15 horas al dia");

        System.out.println("Metodo clase padre: ");
        super.dormir();
    }

    //Modificar comportamiento heredado de la clase padre
    @Override // Recomendacion Anotacion
    protected void dormir(){
        System.out.println("Duermo 15 horas al dia");

        System.out.println("Metodo clase padre: ");
        super.dormir();
    }
}

/*
class Gato extends Animal{

    @Override
    protected void hacerSonido(){
        System.out.println("El gato hace Miau");
    }
}
*/

class PruebaAnimal{

    // Definimos un metodo usando el polimorfismo
    //Segun el objeto(Padre o hija) que apunte varia la respuesta del metodo
    static void imprimirSonido(Animal animal){
            animal.hacerSonido();
    }

    public static void main(String[] args) {

        System.out.println("*** Ejemplo de Herencia ***");

        System.out.println("Clase Padre, soy una Animal");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();
        imprimirSonido(animal1);

        System.out.println("\nClase Hija, Soy un perro");
        var perro1 = new Perro();
        perro1.comer();
        perro1.dormir();
        perro1.hacerSonido();
        imprimirSonido(perro1);
    }
}