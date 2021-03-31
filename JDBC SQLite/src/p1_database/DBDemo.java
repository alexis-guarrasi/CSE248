package p1_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemo {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("org.sqlite.JDBC");
			System.out.println(Class.forName("org.sqlite.JDBC").toString());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection conn = DriverManager.getConnection("jdbc:sqlite:data/db/sampleDB.sqlite");
		Statement statement = conn.createStatement();
//		statement.executeUpdate("drop table if exists Student");
//		statement.executeUpdate("create table student (FirstName VARCHAR(50), LastName VARCHAR(50))");
		statement.executeUpdate("insert into users (userName, usePassword, addressID) Values ('A', 'Smith', 1)");
		statement.executeUpdate("insert into users (userName, usePassword, addressID) Values ('B', 'Smith', 3)");
		ResultSet rs = statement.executeQuery("Select userName, usePassword, city, state, zip FROM users INNER JOIN addresses on addresses.addressID = users.addressID");
		while(rs.next()) {
			System.out.print(rs.getString("userName") + "\n");
			System.out.print(rs.getString("usePassword") + "\n");
			System.out.println(rs.getString("city"));
		}
		conn.close();
		
	
	}

}
