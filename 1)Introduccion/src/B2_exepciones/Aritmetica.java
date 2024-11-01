package B2_exepciones;

public class Aritmetica {
        public static int division(int numerador, int denominador) throws Exception{
            if(denominador == 0)
                throw new RuntimeException("Division entre Cero");
            return numerador / denominador;
        }
    }

