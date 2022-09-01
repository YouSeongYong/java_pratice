package Ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex_delete {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		// 삭제하고자 하는 이름과 동일한 이름을 가지고 있는
		// 데이터 삭제하기
		// ex) 김미희 입력하면 해당 데이터 삭제 !
		Connection conn = null;
		PreparedStatement psmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";

			conn = DriverManager.getConnection(url, db_id, db_pw);

			if (conn != null) {
				System.out.println("접속 완료");
			} else {
				System.out.println("접속실패");
			}
			// 삭제할 데이터
			System.out.println("삭제할 이름: ");
			String name = sc.next();
			String sql = "delete from student where name=?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, name);
			int result = psmt.executeUpdate();

			if (result > 0) {
				System.out.println("수정성공");
			} else {
				System.out.println("수정실패");
			}

		} catch (Exception e) {
			System.out.println("오류발생");

		} finally {
			try {
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {

				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
