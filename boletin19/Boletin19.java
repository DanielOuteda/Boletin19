/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import javax.swing.JOptionPane;

/**
 *
 * @author doutedasolla
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[20][36];
        String[] equipos = {"Alavés            ","Athletic Club     ","Atlético de Madrid","Barcelona         ","Betis             ","Celta de Vigo     ","Eibar             ","Espanyol          ","Getafe            ","Girona            ","Huesca            ","Leganés           ","Levante           ","Rayo Vallecano    ","Real Sociedad     ","Real Madrid       ","Sevilla           ","Valladolid        ","Valencia          ","Villarreal        "};
        String[] jornadas = {"                    J.1", " J.2", " J.3"," J.4"," J.5"," J.6"," J.7"," J.8"," J.9"," J.10","J.11","J.12","J.13","J.14","J.15","J.16","J.17","J.18","J.19","J.20","J.21","J.22","J.23","J.24","J.25","J.26","J.27","J.28","J.29","J.30","J.31","J.32","J.33","J.34","J.35","J.36"};

        int opcion;
        Metodos obx = new Metodos();
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("***MENU***\n 1 --> Crear Liga\n 2 --> Crear Liga Aleatoria\n 3 --> Enseñar Liga\n 4 --> Lista de equipos que menos goles marca\n 5 --> Indicar cuantos goles mete cada equipo en cada jornada\n 6 --> Equipo que mas \n 7 --> Consultas por equipo y jornada por nº de goles \n 8 --> Salir \n Teclea opcion"));
            switch (opcion) {
                case 1:
                    matriz = obx.crearMatriz(matriz);
                    break;
                case 2:
                    obx.random(matriz);
                    break;
                case 3:
                    obx.amosar(matriz,equipos,jornadas);
                    break;
                case 4:
                    obx.ordendecrecente(matriz, equipos);
                    break;
                case 5:
                    obx.maximoGoleadorXornada(matriz, equipos, jornadas);
                    break;
                case 6:
                    obx.maximosGoleadores(matriz, jornadas, equipos);
                    break;
                case 7:
                    obx.consultarGoles(matriz, jornadas, equipos);
                    break;
                case 8:
                    obx.sair();

            }
        } while (opcion < 8);
    }

}


