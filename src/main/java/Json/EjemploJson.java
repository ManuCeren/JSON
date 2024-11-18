
package Json;

import Modelo.empleado;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploJson {
    
    // Método para escribir un objeto Empleado como JSON
    public static void escribirJson(String filePath, empleado emp) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("nombre", emp.getNombre());
        jsonObject.put("edad", emp.getEdad());
        jsonObject.put("departamento", emp.getDepartamento());

        try (FileWriter file = new FileWriter(filePath)) {
            file.write(jsonObject.toJSONString());
            System.out.println("Archivo JSON creado: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para leer un archivo JSON y convertirlo a un objeto Empleado
    public static empleado leerJson(String filePath) {
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(filePath)) {
            JSONObject jsonObject = (JSONObject) parser.parse(reader);

            String nombre = (String) jsonObject.get("nombre");
            long edad = (long) jsonObject.get("edad");  // JSON devuelve números como `long`
            String departamento = (String) jsonObject.get("departamento");

            return new empleado(nombre, (int) edad, departamento);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
