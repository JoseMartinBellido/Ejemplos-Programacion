package prog.ud06.ejemplo09.browsenav;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class RecorreDOMApp {
  
  private static final String FICHERO_XML = "empleados.xml";

  public static void main(String[] args) {
    try {
      // Creamos el procesador
      DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
      // Abrimos el documento
      Document documento = builder.parse(FICHERO_XML);
      // Accedemos al elemento raiz (empleados)
      Element elementoRaiz = documento.getDocumentElement();
      // Ahora a los hijos (que deben ser empleado)
      NodeList empleados = elementoRaiz.getChildNodes();

      // Imprimimos cabecera
      System.out.println("Lista de empleados");
      // Para cada elemento hijo
      int contadorEmpleados = 1;
      for (int i = 0; i < empleados.getLength(); i++) {
        // Si es un elemento
        if (empleados.item(i).getNodeType() == Node.ELEMENT_NODE) {
          // Imprimimos que vamos a mostrar los datos de otro empleado
          System.out.println();
          System.out.println("Datos del empleado " + contadorEmpleados);
          // Obtiene los datos del empleado
          NodeList datosEmpleado = empleados.item(i).getChildNodes();
          // Para cada dato
          for (int j = 0; j < datosEmpleado.getLength(); j++) {
            Node nodo = datosEmpleado.item(j);
            // Si el nodo es un elemento
            if (nodo.getNodeType() == Node.ELEMENT_NODE) {
              // Convertimos el nodo en elemento porque estamos seguros que lo es
              Element elemento = (Element)nodo;
              // Imprimimos la etiqueta y el contenido
              System.out.println(elemento.getNodeName() + ": " + elemento.getTextContent());
            }
          }
          // Pasamos al siguiente empleado
          contadorEmpleados++;
        }
      }
    } catch (ParserConfigurationException e) {
      System.out.println("Error creando el parser");
    } catch (IOException e) {
      // No se puede encontrar el fichero
      System.out.println("Error. No se puede leer el archivo \"" + FICHERO_XML + "\"");
    } catch (SAXException e) {
      // Error procesando el archivo
      System.out.println("Error procesando el archivo \"" + FICHERO_XML + "\". Compruebe que es un fichero XML bien formado");
    }
  }

}
