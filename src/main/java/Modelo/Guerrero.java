/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */

public class Guerrero extends Aventurero {

    private boolean armaduraPesada;

    public Guerrero(String nombre, int nivel, int puntosVida, boolean armaduraPesada) {
        super(nombre, nivel, puntosVida);
        this.armaduraPesada = armaduraPesada;
    }

    public boolean isArmaduraPesada() { return armaduraPesada; }
    public void setArmaduraPesada(boolean armaduraPesada) { this.armaduraPesada = armaduraPesada; }

    @Override
    public String ejecutarAccionCombate() {
        return "El Guerrero " + nombre + " usa Oleada de Acción para realizar múltiples ataques físicos continuos.";
    }

    @Override
    public String obtenerDetalleEspecial() {
        return "Armadura Pesada: " + (armaduraPesada ? "Sí" : "No");
    }
}
