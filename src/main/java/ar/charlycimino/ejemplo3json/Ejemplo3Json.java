/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ar.charlycimino.ejemplo3json;

import Modelo.empleado;
import Json.EjemploJson;

public class Ejemplo3Json {

    public static void main(String[] args) {
        // Crear un objeto Empleado
        empleado emp = new empleado("Ana García", 30, "Ventas");

        // Ruta del archivo JSON
        String filePath = "empleado.json";

        // Escribir el objeto Empleado en un archivo JSON
        EjemploJson.escribirJson(filePath, emp);

        // Leer el archivo JSON y convertirlo a un objeto Empleado
        empleado empleadoLeido = EjemploJson.leerJson(filePath);

        if (empleadoLeido != null) {
            System.out.println("Empleado leído desde JSON:");
            System.out.println(empleadoLeido);
        }
    }
}
