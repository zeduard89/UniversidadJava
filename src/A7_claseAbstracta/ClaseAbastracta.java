package A7_claseAbstracta;

public class ClaseAbastracta {
    public static void main(String[] args) {
        //* No se puede instanciar, ya que no sabemos que puede hacer
        //por ende se debe llamar al medo concreto de la clase "hija"
        //FiguraGeometrica figuraGeometrica = new FiguraGeometrica();

        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();

        figuraGeometrica = new Circulo();
        figuraGeometrica.dibujar();
    }
}

//* Clase abstracta "No se puede instanciar"
abstract class FiguraGeometrica{
    public abstract void dibujar();
}

//Clase hija
class Rectangulo extends FiguraGeometrica{
    @Override
    public void dibujar(){
        System.out.println("Se dibuja un rectanglo");
    }
}

class Circulo extends FiguraGeometrica{
    public void dibujar(){
        System.out.println("Se debe dibujar un circulo");
    }
}