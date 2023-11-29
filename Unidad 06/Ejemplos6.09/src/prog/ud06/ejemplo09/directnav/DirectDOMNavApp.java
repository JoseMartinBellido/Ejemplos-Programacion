package prog.ud06.ejemplo09.directnav;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DirectDOMNavApp {

  private static final String FICHERO_XML = "empleados.xml";

  public static void main(String[] args) {
    // Capturamos las posibles excepciones (de fichero, parser, etc.)
    try {
      // Creamos el procesador
      DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
      // Abrimos el documento
      Document documento = builder.parse(FICHERO_XML);
      // Accedemos directamente a cada empleado
      NodeList empleados = documento.getElementsByTagName("empleado");

      // Imprimimos cabecera
      System.out.println("Lista de empleados");
      // Para cada empleado
      for (int i = 0; i < empleados.getLength(); i++) {
        // Imprimimos que vamos a mostrar los datos de otro empleado
        // Obtiene los datos del empleado directamente
        Element empleado = (Element)empleados.item(i);
        String nombre = empleado.getElementsByTagName("nombre").item(0).getTextContent();
        String apellidos = empleado.getElementsByTagName("apellido").item(0).getTextContent();
        String edad = empleado.getElementsByTagName("edad").item(0).getTextContent();
        String departamento = empleado.getElementsByTagName("departamento").item(0).getTextContent();
        String cargo = empleado.getElementsByTagName("cargo").item(0).getTextContent();
        System.out.println("El empleado " + (i + 1) + " se llama " + nombre + " "
          + apellidos + ", es " + cargo + " en el departamento " + departamento
          + " y tiene " + edad + " años");
      }
    } catch (ParserConfigurationException e) {
      System.out.println("Error creando el parser");
    } catch (IOException e) {
      // No se puede encontrar el fichero
      System.out.println("Error. No se puede leer el archivo \"" + FICHERO_XML + "\"");
    } catch (SAXException e) {
      // Error procesando el archivo
      System.out.println("Error procesando el archivo \"" + FICHERO_XML + "\". Compruebe que es un fichero XML bien formado");
    }  }

}
