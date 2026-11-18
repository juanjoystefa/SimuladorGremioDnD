/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */

public abstract class Aventurero implements IAccionCombate {

    public static final int NIVEL_MAXIMO = 20;

    protected String nombre;
    protected int nivel;
    protected int puntosVida;

    // Constructor completo
    public Aventurero(String nombre, int nivel, int puntosVida) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del aventurero no puede estar vacío.");
        }
        if (nivel < 1 || nivel > NIVEL_MAXIMO) {
            throw new IllegalArgumentException("El nivel debe estar entre 1 y " + NIVEL_MAXIMO + ".");
        }
        if (puntosVida <= 0) {
            throw new IllegalArgumentException("Los puntos de vida deben ser mayores a 0.");
        }
        this.nombre = nombre.trim();
        this.nivel = nivel;
        this.puntosVida = puntosVida;
    }

    // Sobrecarga de constructor (Overload): aventurero novato de nivel 1
    public Aventurero(String nombre, int puntosVida) {
        this(nombre, 1, puntosVida);
    }

    // Sobrecarga de métodos (Overload)
    public void subirNivel() {
        subirNivel(1);
    }

    public void subirNivel(int niveles) {
        if (niveles <= 0) {
            throw new IllegalArgumentException("Los niveles a subir deben ser positivos.");
        }
        this.nivel = Math.min(NIVEL_MAXIMO, this.nivel + niveles);
    }

    // Método final: las subclases no pueden alterarlo (regla estándar de D&D 5e)
    public final int calcularBonificadorCompetencia() {
        return 2 + ((this.nivel - 1) / 4);
    }

    // Método abstracto obligatorio para las subclases
    public abstract String obtenerDetalleEspecial();

    // Getters y Setters (Encapsulamiento)
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }

    public int getPuntosVida() { return puntosVida; }
    public void setPuntosVida(int puntosVida) { this.puntosVida = puntosVida; }

    @Override
    public String toString() {
        return String.format("[%s] %s | Nivel: %d | PV: %d | %s",
                this.getClass().getSimpleName(), nombre, nivel, puntosVida, obtenerDetalleEspecial());
    }
}
