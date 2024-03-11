package prog.ud08.ejemplo01.resultados01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import prog.ud08.ejemplo01.comun.Constantes;

public class Resultados {
  
  private static final String SQL = "SELECT nombre, capital, iso FROM paises WHERE codigoContinente = ? ORDER BY nombre";
  
  public static void main(String[] args) {
    // Conectamos y creamos la sentencia
    try (Connection conn = DriverManager.getConnection(Constantes.JDBC_URL + Constantes.DATABASE_PATH);
         PreparedStatement stmt = conn.prepareStatement(SQL);) {
      
      // Rellenamos el parámetro
      stmt.setString(1, "EU");

      // La ejecutamos y obtenemos respuesta
      ResultSet rs = stmt.executeQuery();
      
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
