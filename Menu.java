import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Menu {
	
	
	ReadFile rf = new ReadFile();
	Funkcje fn = new Funkcje();
	int i, j;
	String s;
	
	
	public void printmenu() {
	
	        System.out.println(" Witaj użytkowniku, wybierz opcję ");
	        System.out.println("1. Wyświetl całą bazę"); //DZIALA
	        System.out.println("2. Dodaj gracza");  //DZIALA
	        System.out.println("3. Usuń gracza"); //DZIALA
	        System.out.println("4. Zmień dane"); //
	        System.out.println("5. Tryb Developerski"); //
	        System.out.println("6. Wyjście");
	        System.out.print("Wprowadz cyfr�>> ");
	
	}
	
	
	public void full(Connection conn, Statement stmt) throws SQLException, IOException {
		int x=0;

		    while (x<1 || x>10) {
		    printmenu();
		    x = fn.takeoption();
		    clearScreen();
		    switch (x) {
		        case 1:
		        	fn.wyswietl(conn);
		            break;
		        case 2:
		        	fn.insertPlayer(stmt);
		        	break;
		        case 3:
		        	fn.deletePlayer(stmt);
		        	break;
		        case 4:
		        	//fn.removeplayer();
		        	break;
		        case 5:
		        	//fn.developermode();
		        default:
		            System.out.println("Proszę wybrać prawidłowo opcję");
		    }
		}
		System.out.println("Dzi�kujemy za skorzystanie z naszego programu");
		System.out.println("Czy chcesz skorzysta� ponownie?");
		System.out.println("Prosz� wcisn�� Y aby wr�ci� do menu, "
				+ "lub dowolny inny klawisz aby zako�czy� dzia�anie programu");
		s=fn.takeoptiontext();
		System.out.println(s);
		if(s.equals("Y") || s.equals("y")) full(conn, stmt);
		else return;
	}
	
 
	public final static void clearScreen()
	{
	    try
	    {
	        final String os = System.getProperty("os.name");

	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (final Exception e)
	    {
	        //  Handle any exceptions.
	    }
	}
	
	}