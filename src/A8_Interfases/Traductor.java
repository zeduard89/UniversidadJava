package A8_Interfases;

public interface Traductor {

    //Si no ingresamos la firma, por defecto es "public y abstract"
    void traducir();

    //Metodos con implementacion por default
    default void iniciarTraductor(){
        System.out.println("Iniciar traductor...");
    }
}

class Ingles implements Traductor{
    @Override
    public void traducir(){
        System.out.println("Traduzo a ingles");
    }
}

class PruebaTraductor{
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();
    }
}
