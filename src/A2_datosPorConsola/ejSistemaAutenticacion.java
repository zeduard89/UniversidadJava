package A2_datosPorConsola;

import java.util.Scanner;

public class ejSistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticacion ***");

        final var USUARIO_VALIDO = "admin";
        final var PASSWORD_VALIDO = "123";

        var consola = new Scanner(System.in);

        System.out.print("Ingresa tu usuario: ");
        var usuario = consola.nextLine().strip();

        System.out.print("Ingrese tu password: ");
        var password = consola.nextLine().strip();

        var mensajeAutenticacion = switch (usuario){
            case USUARIO_VALIDO -> {
                if(PASSWORD_VALIDO.equals(password))
                    yield "Bienvenido al sistema!";
                else
                    yield "Password incorrecto, porfavor corregirlo!";
            }
            default -> {
                if (PASSWORD_VALIDO.equals(password))
                    yield "Usuario incorrecto, porfavor corregirlo!";
                else
                    yield "Usuario y password incorrectos, porfavor de corregirlo";

            }
        };
        System.out.println("mensajeAutenticacion = " + mensajeAutenticacion);
    }
}
