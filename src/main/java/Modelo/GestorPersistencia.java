/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Usuario
 */

public class GestorPersistencia {

    private final String RUTA_ARCHIVO;

    public GestorPersistencia() {
        this("registro_gremio.txt");
    }

    // Constructor sobrecargado útil para pruebas unitarias con archivo temporal
    public GestorPersistencia(String rutaArchivo) {
        this.RUTA_ARCHIVO = rutaArchivo;
    }

    public void guardarLinea(String evento) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA_ARCHIVO, true))) {
            bw.write("[" + timestamp + "] " + evento);
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error al escribir en " + RUTA_ARCHIVO + ": " + e.getMessage());
        }
    }

    public String leerHistorial() {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                sb.append(linea).append("\n");
            }
        } catch (IOException e) {
            return "Aún no existe historial guardado.";
        }
        return sb.toString();
    }
}
