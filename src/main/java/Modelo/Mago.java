/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */

public class Mago extends Aventurero {

    private int espaciosConjuro;

    public Mago(String nombre, int nivel, int puntosVida, int espaciosConjuro) {
        super(nombre, nivel, puntosVida);
        if (espaciosConjuro < 0) {
            throw new IllegalArgumentException("Los espacios de conjuro no pueden ser negativos.");
        }
        this.espaciosConjuro = espaciosConjuro;
    }

    public int getEspaciosConjuro() { return espaciosConjuro; }
    public void setEspaciosConjuro(int espaciosConjuro) { this.espaciosConjuro = espaciosConjuro; }

    @Override
    public String ejecutarAccionCombate() {
        return "El Mago " + nombre + " gasta un espacio de conjuro para lanzar una poderosa Bola de Fuego.";
    }

    @Override
    public String obtenerDetalleEspecial() {
        return "Espacios de Conjuro: " + espaciosConjuro;
    }
}