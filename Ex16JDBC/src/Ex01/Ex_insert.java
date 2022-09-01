package Ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex_insert {

	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		PreparedStatement psmt = null;
		Scanner sc = new Scanner(System.in);
		try {
			// .1jdbc 동적 로딩!
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2.데이터베이스 연결!
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";

			conn = DriverManager.getConnection(url, db_id, db_pw);
			if (conn != null) {
				System.out.println("접속 성공");
			} else {
				System.out.println("접속 실패");
			}

			// 3. sql문 전송
			// "강예진", 20, "여성" insert 문장구현

			System.out.print("이름 : ");
			String name=sc.next();
			System.out.print("나이 : ");
			int age=sc.nextInt();
			System.out.print("성별 : ");
			String gender=sc.next();
			
			String sql="insert into student values(?,?,?)";//밑에형식을 사용자가 입력하게끔

			//String sql = "insert into student values('강예진',20,'여성')";

			psmt = conn.prepareStatement(sql);
			
			//?값에 실제 값들이 연결될 수 있또록 만들어 주기
			// Set(위치, 데이터 값) >위치는 1부터 시작한다!
			psmt.setString(1, name);
			psmt.setInt(2, age);
			psmt.setString(3,gender);
			
			// prepareStatment의 사용함수!
			// -Query() : 테이블의 전후가 바뀌는 작업 수행시 '조회'기능
			// -Update() : 테이블의 전후가 수정되는 작업 수행시 '삽입','수정','삭제'
			// psmt.executeQuery();
			int result = psmt.executeUpdate();

			if (result > 0) {
				System.out.println("삽입 성공");
			} else {
				System.out.println("삽입 실패");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 연결 오류");
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 오류");
		}

		// 4.객체 연결 종료
		finally {// 마지막에 무조건 수행할 수있는 키워드
			// 객체 닫는 순서 ? 역순으로...
			// Connection(conn)>PreparedStatement(psmt)>ResultSet(rs) 의 역순인
			// Connection<PreparedStatement<ResultSet 요렇게
			try {
				if (psmt != null) {// 객체 사용 여부
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
