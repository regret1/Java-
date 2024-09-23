package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTemplate {
	//1.연결
	public static Connection getConnection() {
		//connection 객체를 만들어  return
		
		try {
			//1.Driver 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("[error]드라이버 등록 실패");
			e.printStackTrace();
		}
		
		//url, id, pw
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "MULTI";
		String password = "MULTI";
		
		Connection con = null;
		
		try {
			//2.DB연결
			con = DriverManager.getConnection(url,username,password);
			
			//자동커밋 설정
			con.setAutoCommit(false);
			
		}catch(SQLException e){
			System.out.println("[Error]DB연결 실패");
			e.printStackTrace();
		}
		return con;
		
	}
	//2.해제
	public static void Close(Connection con) {
		try {
			con.close();
		}catch(SQLException e){
			System.out.println("[Error]Connection 실패");
			e.printStackTrace();
		}
	}
	public static void Close(Statement stmt) {
		try {
			stmt.close();
		}catch(SQLException e){
			System.out.println("[Error]Statement 실패");
			e.printStackTrace();
		}
	}

	public static void Close(ResultSet rs) {
		try {
			rs.close();
		}catch(SQLException e){
			System.out.println("[Error]ResultSet 실패");
			e.printStackTrace();
		}
	}
	public static void Commit(Connection con) {
		try {
			con.commit();
		}catch(SQLException e){
			System.out.println("[Error]commit 실패");
			e.printStackTrace();
		}
	}
	
	public static void Rollback(Connection con) {
		try {
			con.rollback();
		}catch(SQLException e){
			System.out.println("[Error]rollback 실패");
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
