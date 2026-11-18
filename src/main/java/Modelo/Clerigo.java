/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */

public class Clerigo extends Aventurero {

    private String diosVenerado;

    public Clerigo(String nombre, int nivel, int puntosVida, String diosVenerado) {
        super(nombre, nivel, puntosVida);
        if (diosVenerado == null || diosVenerado.trim().isEmpty()) {
            throw new IllegalArgumentException("Debe indicar el dios venerado.");
        }
        this.diosVenerado = diosVenerado.trim();
    }

    public String getDiosVenerado() { return diosVenerado; }
    public void setDiosVenerado(String diosVenerado) { this.diosVenerado = diosVenerado; }

    @Override
    public String ejecutarAccionCombate() {
        return "El Clérigo " + nombre + " usa Canalizar Divinidad para curar a sus aliados y expulsar muertos vivientes.";
    }

    @Override
    public String obtenerDetalleEspecial() {
        return "Dios Venerado: " + diosVenerado;
    }
}