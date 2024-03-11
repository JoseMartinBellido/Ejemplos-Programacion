package prog.ud08.ejemplo01.sentencias01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import prog.ud08.ejemplo01.comun.Constantes;

public class Sentencias {

  public static void main(String[] args) {
    // Conectamos y creamos la sentencia
    try (Connection conn = DriverManager.getConnection(Constantes.JDBC_URL + Constantes.DATABASE_PATH);
         Statement stmt = conn.createStatement();) {
      String sql = String.format("INSERT INTO paises(iso, iso3, isoNum, nombre, capital,"
        + " codigoContinente, codigoMoneda) VALUES (%s, %s, %d, %s, %s, %s, %s)"
        , stmt.enquoteLiteral("FR"), stmt.enquoteLiteral("FRA"), 452, stmt.enquoteLiteral("Francia")
        , stmt.enquoteLiteral("Paris"), stmt.enquoteLiteral("EUR"), stmt.enquoteLiteral("EUR"));
      stmt.executeUpdate(sql);
    } catch (SQLException e) {
      System.out.printf("Error: Ocurríó error %s%n", e.getMessage());
    }
  }

}
