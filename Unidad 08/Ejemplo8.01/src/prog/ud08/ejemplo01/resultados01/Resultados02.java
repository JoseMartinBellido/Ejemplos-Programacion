package prog.ud08.ejemplo01.resultados01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import prog.ud08.ejemplo01.comun.Constantes;

public class Resultados02 {
  
  public static void main(String[] args) {
    // Conectamos y creamos la sentencia
    try (Connection conn = DriverManager.getConnection(Constantes.JDBC_URL + Constantes.DATABASE_PATH);
         Statement stmt = conn.createStatement();) {
      // Creamos la consulta
      String sql = String.format("SELECT nombre, capital, iso FROM paises WHERE codigoContinente = %s ORDER BY nombre"
        , stmt.enquoteLiteral("EU"));
      // La ejecutamos y obtenemos respuesta
      ResultSet rs = stmt.executeQuery(sql);
      
      // Cabecera
      System.out.println("Paises Europeos");
      // Para cada registro encontrado
      while (rs.next()) {
        // Imprimimos los datos del pais
        System.out.printf("%s(%s) - Capital: %s%n", rs.getString(1), rs.getString("iso"), rs.getString(2));
      }
    } catch (SQLException e) {
      System.out.printf("Error: Ocurríó error %s%n", e.getMessage());
    }
  }
  
}
