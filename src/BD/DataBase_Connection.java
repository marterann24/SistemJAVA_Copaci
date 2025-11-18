package BD;

/**
 *
 * @author marit
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase_Connection {

    private Connection connection;

    private String usuario = "postgres";      
    private String password = "postmari7";         
    private String servidor = "localhost";
    private String puerto = "5432";           
    private String nombreBD = "copaciDB";     

    private String url = "jdbc:postgresql://" + servidor + ":" + puerto + "/" + nombreBD;
    private String driver = "org.postgresql.Driver";

    public DataBase_Connection() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, usuario, password);

            if (connection != null) {
                System.out.println("✅ Conexión exitosa a PostgreSQL");
            }

        } catch (Exception e) {
            System.out.println("❌ Error al conectar con la base de datos PostgreSQL");
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}