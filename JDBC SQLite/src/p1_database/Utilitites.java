package p1_database;

	import java.sql.Connection;
	import java.sql.DatabaseMetaData;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class Utilitites {

	    /**
	     * Connect to a sample database
	     *
	     * @param fileName the database file name
	     */
	    public static void createNewDatabase(String fileName) {

	    	String url = "jdbc:sqlite:data/db/" + fileName;
	        try (Connection conn = DriverManager.getConnection(url)) {
	            if (conn != null) {
	                DatabaseMetaData meta = conn.getMetaData();
	                System.out.println("The driver name is " + meta.getDriverName());
	                System.out.println("A new database has been created.");
	            }

	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}