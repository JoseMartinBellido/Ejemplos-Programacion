package prog.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class PruebaBD {
  
  // Constantes
  private static final String URL_TEMPLATE = "jdbc:sqlite:%s";
  private static final String SQL_ACTUALIZA_SALARIO = "UPDATE prueba SET salario = salario * ?";
  private static final String SQL_GET_ALL_PRUEBA = "SELECT *, salario * 0.8 AS salario_neto FROM prueba ORDER BY nombre";
  private static final String SQL_GET_BY_ID_PRUEBA = "SELECT * FROM prueba WHERE id = ?";
  private static final String SQL_INSERT_PRUEBA = "INSERT INTO prueba (nombre, salario, idJefe) VALUES (?, ?, ?)";
  
  // Campos de prueba
  private static final String C_PRUEBA_ID = "id";
  private static final String C_PRUEBA_NOMBRE = "nombre";
  private static final String C_PRUEBA_SALARIO = "salario";
  private static final String C_PRUEBA_IDJEFE = "idJefe";
  private static final String C_PRUEBA_SALARIO_NETO = "salario_neto";

  // Atributos
  // Esquema
  private String esquema;
  

  /**
   * Constructor con parametros
   * @param esquema
   */
  public PruebaBD(String esquema) {
    this.esquema = esquema;
  }

  public static void main(String[] args) {
    PruebaBD app = new PruebaBD("db/prueba.db");
    app.run();
  }
  
  public void run() {
    //actualizarSalario(1.1);
    //listarEmpleados();
    /*Empleado empleado = buscaEmpleadoPorId(20);
    if (empleado != null) {
      System.out.println("Empleado encontrado");
      String jefe = (empleado.getIdJefe() == null) ? "N" : String.valueOf(empleado.getIdJefe());  
      System.out.printf("%5d %-20s %8.2f %s%n", empleado.getId(), empleado.getNombre(), empleado.getSalario(),  jefe);
    } else {
      System.out.println("Empleado NO encontrado");
    }*/
    Empleado empleado = new Empleado (0, "Manolito", 3000, null);
    int id = crearEmpleado(empleado);
    String jefe = (empleado.getIdJefe() == null) ? "N" : String.valueOf(empleado.getIdJefe());  
    System.out.printf("%5d %-20s %8.2f %s%n", id, empleado.getNombre(), empleado.getSalario(),  jefe);
  }
  
  private int crearEmpleado(Empleado empleado) {
    try (Connection conexion = getConnection();
        PreparedStatement sentencia = conexion.prepareStatement(SQL_INSERT_PRUEBA, Statement.RETURN_GENERATED_KEYS);) {

      // Compruebo si el id jefe está perita
      if (empleado.getIdJefe() == null || buscaEmpleadoPorId(empleado.getIdJefe()) != null) {
        // Rellenamos las variables
        sentencia.setString(1, empleado.getNombre());
        sentencia.setDouble(2, empleado.getSalario());
        // Como ID Jefe puede ser null
        if (empleado.getIdJefe() != null) {
          sentencia.setInt(3, empleado.getIdJefe());
        } else {
          sentencia.setNull(3, Types.INTEGER);
        }
        
        if (sentencia.executeUpdate() == 1) {
          // Accedemos a la clave
          ResultSet rs = sentencia.getGeneratedKeys();
          if (rs.next()) {
            int resultado = rs.getInt(1);
            rs.close();
            return resultado;
          } else {
            rs.close();
            return -1;
          }
        } else {
          throw new IllegalArgumentException("Algo ha pasao");
        }
      } else {
        throw new IllegalArgumentException("Cenutrio, estás intentando usar un id de jefe que no existe");
      }

    } catch (SQLException e) {
      System.err.println("Error " + e.getMessage());
      return -1;
    }
  }

  private Empleado buscaEmpleadoPorId(int id) {
    try (Connection conexion = getConnection();
         PreparedStatement sentencia = conexion.prepareStatement(SQL_GET_BY_ID_PRUEBA);) {

      // Colocamos el ID
      sentencia.setInt(1, id);
      
      ResultSet rs = sentencia.executeQuery();
      
      if (rs.next()) {
        String nombre = rs.getString(C_PRUEBA_NOMBRE);
        double salario = rs.getDouble(C_PRUEBA_SALARIO);
        Integer idJefe = rs.getInt(C_PRUEBA_IDJEFE);
        if (rs.wasNull()) {
          idJefe = null;
        }
        rs.close();
        return new Empleado (id, nombre, salario, idJefe);
      } else {
        rs.close();
        return null;
      }
    } catch (SQLException e) {
      System.err.println("Error " + e.getMessage());
      return null;
    }
  }

  private void listarEmpleados() {
    try (Connection conexion = getConnection();
         PreparedStatement sentencia = conexion.prepareStatement(SQL_GET_ALL_PRUEBA);) {

      ResultSet rs = sentencia.executeQuery();
      while (rs.next()) {
        int id = rs.getInt(C_PRUEBA_ID);
        String nombre = rs.getString(C_PRUEBA_NOMBRE);
        double salario = rs.getDouble(C_PRUEBA_SALARIO);
        double salarioNeto = rs.getDouble(C_PRUEBA_SALARIO_NETO);
        Integer idJefe = rs.getInt(C_PRUEBA_IDJEFE);
        String jefe = "";
        if (rs.wasNull()) {
          idJefe = null;
          jefe = "N";
        } else {
          jefe = String.valueOf(idJefe);
        }
        
        System.out.printf("%5d %-20s %8.2f %8.2f %s%n", id, nombre, salario, salarioNeto, jefe);
      }
      rs.close();
   } catch (SQLException e) {
     System.err.println("Error " + e.getMessage());
   }
  }

  private void actualizarSalario(double porcentaje) {
    try (Connection conexion = getConnection();
        PreparedStatement sentencia = conexion.prepareStatement(SQL_ACTUALIZA_SALARIO);) {
     
      sentencia.setDouble(1, porcentaje);
      int resultado = sentencia.executeUpdate();
      System.out.printf("Resultado = %d%n", resultado);
   } catch (SQLException e) {
     System.err.println("Error " + e.getMessage());
   }
  }

  private Connection getConnection() throws SQLException {
    String url = String.format(URL_TEMPLATE, esquema);
    return DriverManager.getConnection(url);
  }

}
