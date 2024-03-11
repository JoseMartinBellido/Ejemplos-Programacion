package prog.ud08.ejemplo01.sentencias02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import prog.ud08.ejemplo01.comun.Constantes;

public class Sentencias {
  
  private static final String SQL = "INSERT INTO paises(iso, iso3, isoNum, nombre, capital,"
    + " codigoContinente, codigoMoneda) VALUES (?, ?, ?, ?, ?, ?, ?)";

  public static void main(String[] args) {
    // Conectamos y creamos la sentencia
    try (Connection conn = DriverManager.getConnection(Constantes.JDBC_URL + Constantes.DATABASE_PATH);
         PreparedStatement stmt = conn.prepareStatement(SQL);) {
      // Rellenamos los huecos de la sentencia
      stmt.setString(1, "FR");
      stmt.setString(2, "FRA");
      stmt.setInt(3, 452);
      stmt.setString(4,  "Francia");
      stmt.setString(5,  "Paris");
      stmt.setString(6,  "EUR");
      stmt.setString(7,  "EUR");
      
      // La ejecutamos
      stmt.executeUpdate();
    } catch (SQLException e) {
      System.out.printf("Error: Ocurríó error %s%n", e.getMessage());
    }
  }

}
