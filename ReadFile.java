import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadFile {
	
	public static final String DRIVER = "org.postgresql.Driver";
    public static final String DB_URL = "jdbc:postgresql://";
    
    public static Statement stmt;
    public static Connection conn;
	
    String sql;
    
	public Connection connect(String a, String b, String c) throws SQLException
	{
		try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(DB_URL+a, b, c);
        } catch (ClassNotFoundException e) {
            System.err.println("Brak sterownika JDBC");
            e.printStackTrace();
        }
		return conn;
	}
	public Statement connect1(Connection conn)
		{
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            System.err.println("Problem z otworzeniem połącczenia");
            e.printStackTrace();
        }
        return stmt;
	}
	public void instrukcja (String q) {
    	try {
			stmt.execute(q);
		} catch (SQLException e) {
			System.err.println("B³¹d przy wykonaniu");
			e.printStackTrace();
		}
	}
	
}
