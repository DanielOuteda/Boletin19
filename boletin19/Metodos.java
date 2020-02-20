/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author doutedasolla
 */
public class Metodos {

    public int[][] crearMatriz(int[][] goles) {
        for (int f = 0; f < goles.length; f++) {
            for (int c = 0; c < goles[f].length; c++) {
                goles[f][c] = PedirDato.pedirInt();
            }
        }
        return goles;
    }

    public void amosar(int[][] goles, String[] equipos, String[] jornadas) {
        for (int i = 0; i < jornadas.length; i++) {
            System.out.print(" " + jornadas[i] + " ");
        }
        for (int f = 0; f < goles.length; f++) {
            System.out.print("\n" + equipos[f] + "  ");
            for (int c = 0; c < goles[f].length; c++) {
                System.out.print(" " + goles[f][c] + "    ");
            }
        }

    }

    public void sair() {
        System.exit(0);
    }

    public int[][] random(int[][] goles) {
        for (int f = 0; f < goles.length; f++) {
            for (int c = 0; c < goles[f].length; c++) {
                goles[f][c] = (int) (Math.random() * (5));
            }
        }
        System.out.println("Liga Creada");
        return goles;
    }

    public void ordendecrecente(int[][] goles, String[] equiposOrdenados) {
        int[] totalGoles = new int[goles.length];
        for (int f = 0; f < goles.length; f++) {
            for (int c = 0; c < goles[f].length; c++) {
                totalGoles[f] = totalGoles[f] + goles[f][c];
            }
        }
        int aux;
        String auxEqu;
        for (int i = 0; i < totalGoles.length - 1; i++) {
            for (int j = i + 1; j < equiposOrdenados.length; j++) {
                if (totalGoles[i] > totalGoles[j]) {
                    aux = totalGoles[i];
                    totalGoles[i] = totalGoles[j];
                    totalGoles[j] = aux;
                    auxEqu = equiposOrdenados[i];
                    equiposOrdenados[i] = equiposOrdenados[j];
                    equiposOrdenados[j] = auxEqu;
                }
            }
        }
        System.out.println("\n\nLista de equipos :");
        for (int j = 0; j < equiposOrdenados.length; j++) {
            System.out.println(equiposOrdenados[j] + "  " + totalGoles[j]);
        }

    }

    public void maximoGoleadorXornada(int[][] goles, String[] equipos, String[] jornadas) {
        int maxGoles;
        String equipoMax[] = new String[equipos.length];

        for (int i = 0; i < goles[0].length; i++) {
            maxGoles = 0;
            for (int j = 0; j < goles.length; j++) {
                if (maxGoles <= goles[j][i]) {
                    maxGoles = goles[j][i];
                    equipoMax[j] = equipos[j];
                }
            }
            System.out.println("\nNa jornada " + (i + 1) + " os maximos goleadores foron (con " + maxGoles + " goles)" + ":");
            for (int k = 0; k < goles.length; k++) {
                if (maxGoles == goles[k][i]) {
                    System.out.println(equipoMax[k]);
                }
            }
        }
        System.out.println("");
    }

    public void maximosGoleadores(int[][] goles, String[] jornadas, String[] equipos) {
        int maxGoles = 0;
        for (int i = 0; i < jornadas.length; i++) {
            for (int j = 0; j < goles.length; j++) {
                if (maxGoles <= goles[j][i]) {
                    maxGoles = goles[j][i];
                }
            }

        }
        System.out.println("Los equipos que mas goles marcaron en cada jornada fueron:");
        for (int x = 0; x < goles[0].length; x++) {

            for (int y = 0; y < goles.length; y++) {
                if (goles[y][x] == maxGoles) {
                    System.out.println(equipos[y] + " en la " + jornadas[x]);
                }
            }
        }

    }

    public void consultarGoles(int[][] goles, String[] jornadas, String[] equipos) {
        String equipoBuscar = JOptionPane.showInputDialog("Introduce o equipo a buscar:");
        String xornadaBuscar = JOptionPane.showInputDialog("Introduce a xornada a buscar:");
        int auxEquipo = 0, auxJor = 0;
        int i, j;
        for (i = 0; i < equipos.length; i++) {
            if (equipos[i].equals(equipoBuscar)) {
                auxEquipo = i;
            }
        }
        for (j = 0; j < jornadas.length; j++) {
            if (jornadas[j].equals(xornadaBuscar)) {
                auxJor = j;
            }
        }
        System.out.println("O " + equipos[auxEquipo] + " na " + jornadas[auxJor] + " marcou " + goles[auxEquipo][auxJor] + " goles");

    }

}
