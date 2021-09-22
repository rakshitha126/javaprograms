package com.xworkz.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.mobile.Mobile;

public class Book {

	public static void main(String[] args) {
	
		Mobile.save();
		Mobile.update();
		Mobile.delete();

	}
	public static void save(){
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.create connection
			//jdbc:databasename://IP address:port/schema name
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Pavixworkz130621");
			//3.Create Statement
			Statement statement = con.createStatement();
			//4.Execute statement
			boolean saved=statement.execute("insert into book_details values(24,'The best vibes',150000)");
			if(saved == false) {
				System.out.println("Data saved");
			}else {
				System.out.println("Data not saved");
			}
			//5.close connection
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			//System.err.println(e.getMessage());
		}
	}
	
	public static void update() {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Pavixworkz130621");
		Statement state = connect.createStatement();
		boolean updated = state.execute("update book_details set book_price=3000000 where mobile_id =254");
		if(updated == false){
			System.out.println("Data updated");
		}else {
			System.out.println("Data not updated");
		}
		connect.close();
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void delete() {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Pavixworkz130621");
		Statement stat = connection.createStatement();
		boolean deleted = stat.execute("Delete from book_details where book_id =256");
		if(deleted == false) {
			System.out.println("Data deleted");
		}else {
			System.out.println("Data not deleted");
		}
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
