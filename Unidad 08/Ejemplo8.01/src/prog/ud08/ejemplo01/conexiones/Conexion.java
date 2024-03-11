package prog.ud08.ejemplo01.conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import prog.ud08.ejemplo01.comun.Constantes;

public class Conexion {
  public static void main(String[] args) {
    // Conecta con la base de datos
    try (Connection conn = DriverManager.getConnection(Constantes.JDBC_URL + Constantes.DATABASE_PATH)) {
    } catch (SQLException e) {
      // Errorr
      System.out.printf("ERROR conectando con la base de datos. Error original: %s%n", e.getMessage());
    }
  }

}
