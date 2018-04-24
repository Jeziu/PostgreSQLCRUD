import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//JOptionPane.showMessageDialog(null,"Error");

public class Funkcje {
	
	public static final String DRIVER = "org.postgresql.Driver";
    public static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/tennis";
    
    

    
	String sql, s;
	char[] si;
	int i, j;
	int maxRows = 200000;
	
	ReadFile rf = new ReadFile();
	DBTablePrinter tb = new DBTablePrinter();
	
	//--------------------------------------------------------------------------------------------------------------------------------	
	public int takeoption() {
		Scanner reader = new Scanner(System.in);
		int i = reader.nextInt();
		return i;
	}
	//--------------------------------------------------------------------------------------------------------------------------------	
	public String takeoptiontext() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		return s;
	}
	public String takeoptionpass() throws IOException {
		Console cnsl = null;
		cnsl = System.console();
		char[] si = cnsl.readPassword("pass: ");
		String sii = new String(si);
		return sii;
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------	
	//--------------------------------------------------------------------------------------------------------------------------------

	
	//--------------------------------------------------------------------------------------------------------------------------------	
	public void wyswietl(Connection conn) throws SQLException{
		DBTablePrinter.printTable(conn, "Players", maxRows);
    }
	//--------------------------------------------------------------------------------------------------------------------------------	
	public void deletePlayer(Statement stmt) throws SQLException {
    	System.out.println("Wpisz id gracza, którego chcesz usunąć");
    	i=takeoption();
		sql="DELETE FROM Players WHERE Players.id="+i+";";
		System.out.println(sql);
		rf.instrukcja(sql);
	}
	//--------------------------------------------------------------------------------------------------------------------------------	
	public void insertPlayer(Statement stmt) throws SQLException, IOException {
    	System.out.println("Wpisz id gracza, którego chcesz usunąć");
    	sql="INSERT INTO Players (NAME, SURNAME, REKA, DATAUR)  VALUES ('";
    	
    	System.out.println("Wpisz imie gracza");
    	s=takeoptiontext();
    	sql=sql+s+"', '";
    			
    	System.out.println("Wpisz nazwisko gracza");
    	s=takeoptiontext();
    	sql=sql+s+"', '";
    	
    	System.out.println("Wpisz lepszą rękę gracza");
    	s=takeoptiontext();
    	sql=sql+s+"', '";
    	
    	System.out.println("Wpisz datę ur gracza");
    	s=takeoptiontext();
    	sql=sql+s+"');";
    	
		System.out.println(sql);
		rf.instrukcja(sql);
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------	
	public void changepoints(Connection conn) {
		
		
		System.out.println(sql);
		rf.instrukcja(sql);
	}
	//--------------------------------------------------------------------------------------------------------------------------------	
}
