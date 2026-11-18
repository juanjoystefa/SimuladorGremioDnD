/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */

public class Monje extends Aventurero {

    private int puntosKi;

    public Monje(String nombre, int nivel, int puntosVida, int puntosKi) {
        super(nombre, nivel, puntosVida);
        if (puntosKi < 0) {
            throw new IllegalArgumentException("Los puntos de Ki no pueden ser negativos.");
        }
        this.puntosKi = puntosKi;
    }

    public int getPuntosKi() { return puntosKi; }
    public void setPuntosKi(int puntosKi) { this.puntosKi = puntosKi; }

    @Override
    public String ejecutarAccionCombate() {
        return "El Monje " + nombre + " gasta puntos de Ki para ejecutar una Ráfaga de Golpes y un Ataque Aturdidor.";
    }

    @Override
    public String obtenerDetalleEspecial() {
        return "Puntos de Ki: " + puntosKi;
    }
}
