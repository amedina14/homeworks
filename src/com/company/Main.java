package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        String mes_cadena = "";
        int mes_numero;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean bandera = true;

        while(bandera == true) {

            System.out.println("En que mes naciste");
            mes_numero = Integer.parseInt(br.readLine());

            switch (mes_numero) {
                case 1:
                    mes_cadena = "Enero";
                    bandera = false;
                    break;
                case 2:
                    mes_cadena = "Febrero";
                    bandera = false;
                    break;
                case 3:
                    mes_cadena = "Marzo";
                    bandera = false;
                    break;
                case 4:
                    mes_cadena = "Abril";
                    bandera = false;
                    break;
                case 5:
                    mes_cadena = "Mayo";
                    bandera = false;
                    break;
                case 6:
                    mes_cadena = "Junio";
                    bandera = false;
                    break;
                case 7:
                    mes_cadena = "Julio";
                    bandera = false;
                    break;
                case 8:
                    mes_cadena = "Agosto";
                    bandera = false;
                    break;
                case 9:
                    mes_cadena = "Septiembre";
                    bandera = false;
                    break;
                case 10:
                    mes_cadena = "Octubre";
                    bandera = false;
                    break;
                case 11:
                    mes_cadena = "Noviembre";
                    bandera = false;
                    break;
                case 12:
                    mes_cadena = "Diciembre";
                    bandera = false;
                    break;
                default:
                    System.out.println("Mes invalido. ");
                    break;
            }
        }

        System.out.println("Usted nacio' en " + mes_cadena);

    }
}
