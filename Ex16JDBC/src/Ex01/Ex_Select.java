package Ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex_Select {

	public static void main(String[] args) {

		// JDBC 연결 순서
		// (필수 사전작업 필요) 프로젝트에 Ojdbc6.jar 파일 연결
		// 1.JDBC DRIVER 연결
		// 2.데이터베이스 연결
		// 3.SQL문 작성 및 전송
		// 4.객체 연결 종료

		// 객체 생성 및 선언
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		// 1.JDBC 드라이버 연결
		// Class.forName(): 드라이버 연결에 필요한 클래스 찾아오기!

		// try : 예외 처리를 진행 할 수 있는 구문!
		// catch : try실행시 발생하는 오류를 catch문을 통해 해결할 수 있다
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2.데이터 베이스 연결 > connection 객체 필요!
			// 데이터베이스에 연결하기 위한 필요 정보!(DB주소,아이디 ,비밀번호)

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";

			conn = DriverManager.getConnection(url, db_id, db_pw);

			// 접속이 잘 됐는지 판단하기
			if (conn != null) {
				System.out.println("접속 성공");
			} else {
				System.out.println("접속 실패");
			}

			// 3. SQL 작성 및 전송> PreparedStatement
			String sql = "select * from student";

			psmt = conn.prepareStatement(sql);

			// Sql 문장 전송 작업필요!
			// ResultSet > select sql문 실행시 돌아오는 테이블 형태를
			// 담을 수 있는 객체!
			rs = psmt.executeQuery();// sql 에서 실행할때 ; < 대체 문구 자바에선 실행문구 만들어야됌

			while (rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String gender = rs.getString("gender");

				// 하나의 행에 대하여 다 가져온후 출력하기
				System.out.println(name + " / " + age + " / " + gender);
			}

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 연결 오류");// 29번줄에서 오라클드라이버클래스를 찾아와야하는데 없어서
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 오류");// 35~38번 줄에서 오타날때 오류남
		}
		// 4.객체 연결 종료
		finally {// 마지막에 무조건 수행할 수있는 키워드
			// 객체 닫는 순서 ? 역순으로...
			// Connection(conn)>PreparedStatement(psmt)>ResultSet(rs) 의 역순인
			// Connection<PreparedStatement<ResultSet 요렇게
			try {
				if (rs != null) {
					// 객체 사용 여부 확인
					rs.close();
				}if(psmt!=null) {
					psmt.close();
				}if(conn!=null) {
					conn.close();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
