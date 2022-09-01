package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {

	// DAO : Data Access Object
	// 데이터베이스의 data에 접근을 위한 객체!(접근 로직)

	// 객체 생성
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int cnt = 0; // executeUpdate의 결과값을 담아주는 변수
	// 데이터베이스 접속을 위한 연결메소드

	public void getCon() {
		// 1.Class.fowName()
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";

			conn = DriverManager.getConnection(url, db_id, db_pw);

			if (conn != null) {
				System.out.println("접속 성공");
			} else {
				System.out.println("접속 실패");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 2. 데이터베이스의 url, id, pw 연결
	}

	// 사용된 객체를 닫아주는 메소드
	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
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

	// [1] 회원가입
	// -DB 접속 > 중복되고있으니 메소드로 로직을 정리하여 따로 뽑아내기
	// -sql문장 실행
	// -연결 종료
	public int insert(String id, String pw, String nick, int age) {
		getCon();

		String sql = "insert into memberInfo values(?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);
			psmt.setInt(4, age);

			cnt = psmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			close();
		}

		return cnt;
	}

	// [2] 로그인
	// -DB 접속
	// -sql문장 실행
	// -연결 종료

	public String login(String id, String pw) {
		String nick = "";// 결과값 리턴을 위한 저장용 변수
		getCon();

		try {
			String sql = "select nick from memberInfo where id=? and pw=?";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();

			if (rs.next()) {
				nick = rs.getString(1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return nick;
	}

	// [3] 조회 -> 전체 회원의 아이디와 닉네임만 출력!
	public ArrayList<MemberDTO> select() { // <<어떤타입으로 돌아올지 모르니 일단 보이드 형태로 해놓고 다음에 설정하기

		// 전체 회원의 정보를 담을 수 있는 ArrayList만들기
		ArrayList<MemberDTO> totalList = new ArrayList<>();

		getCon();

		try {
			String sql = "select id, nick from memberInfo";

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString("id");
				String nick = rs.getString("nick");
//				rs.getString(1); <가능

				// System.out.println(id+" / "+nick);

				MemberDTO dto = new MemberDTO(id, nick);
				totalList.add(dto);
//				totalList.add(new MemberDTO(id,nick)); 한번에 넘겨버리기
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return totalList;
	}

	// -DB 접속
	// -sql문장 실행
	// -연결 종료

	// [4] 조회
	// -DB 접속
	// -sql문장 실행
	// -연결 종료

}
