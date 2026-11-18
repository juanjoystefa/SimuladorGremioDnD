/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */

public class AventureroTest {

    @Test
    public void testCombateGuerrero() {
        // 1. Arrange
        Guerrero g = new Guerrero("Aragorn", 5, 45, true);
        // 2. Act
        String resultado = g.ejecutarAccionCombate();
        // 3. Assert
        assertEquals(
            "El Guerrero Aragorn usa Oleada de Acción para realizar múltiples ataques físicos continuos.",
            resultado
        );
    }

    @Test
    public void testCombateMago() {
        Mago m = new Mago("Gandalf", 10, 60, 6);
        assertEquals(
            "El Mago Gandalf gasta un espacio de conjuro para lanzar una poderosa Bola de Fuego.",
            m.ejecutarAccionCombate()
        );
    }

    @Test
    public void testCombateClerigo() {
        Clerigo c = new Clerigo("Selene", 7, 52, "Lathander");
        assertEquals(
            "El Clérigo Selene usa Canalizar Divinidad para curar a sus aliados y expulsar muertos vivientes.",
            c.ejecutarAccionCombate()
        );
    }

    @Test
    public void testCombateMonje() {
        Monje mo = new Monje("Kwai", 6, 48, 6);
        assertEquals(
            "El Monje Kwai gasta puntos de Ki para ejecutar una Ráfaga de Golpes y un Ataque Aturdidor.",
            mo.ejecutarAccionCombate()
        );
    }

    @Test
    public void testSobrecargaSubirNivel() {
        Guerrero g = new Guerrero("Braum", 1, 12, true);
        g.subirNivel();     // Sube 1 -> nivel 2
        g.subirNivel(3);    // Sube 3 -> nivel 5
        assertEquals(5, g.getNivel());
    }

    @Test
    public void testLimiteMaximoNivel() {
        Mago m = new Mago("Merlin", 19, 80, 9);
        m.subirNivel(5);    // No debe superar NIVEL_MAXIMO (20)
        assertEquals(Aventurero.NIVEL_MAXIMO, m.getNivel());
    }

    @Test
    public void testPolimorfismoEnColeccion() {
        ArrayList<Aventurero> grupo = new ArrayList<>();
        grupo.add(new Guerrero("Leonidas", 4, 40, true));
        grupo.add(new Mago("Morgana", 4, 24, 3));

        assertTrue(grupo.get(0).ejecutarAccionCombate().contains("Oleada de Acción"));
        assertTrue(grupo.get(1).ejecutarAccionCombate().contains("Bola de Fuego"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNivelInvalidoLanzaExcepcion() {
        new Monje("Invalido", 0, 20, 2);
    }
}