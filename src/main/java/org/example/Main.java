package org.example;

import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("======================");
        System.out.println("Reservas APP");
        System.out.println("======================\n");

        //Entradas del algoritmo
        Scanner entradaTeclado = new Scanner(System.in);

        //Definición de variables
        LocalDate fechaReserva;
        LocalDate fechaMantenimiento;
        String nombreUsuario;
        String idUsuario;
        String correoUsuario;
        String tipoUsuario;
        String numeroApartamento;
        String tipoApartamento;
        String contraseñaUsuario;
        String telefonoUsuario;

        String horarioEspacio;
        String nombreEspacio;
        String reglamentoEspacio;
        String utensilioEspacio;

        String codigoReserva;
        String horarioReserva;

        byte numeroBloque;
        byte cantidadAsistentes;
        byte edadUsuario;
        int valorReserva;

        boolean esAdministrador = false;
        boolean confirmacionReserva = false;
        boolean estaOscupado = false;
        boolean estaEnMantenimiento = false;

    }
}