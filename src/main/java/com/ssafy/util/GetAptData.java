package com.ssafy.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.vue.model.HouseInfoDto;

/**
 * 2021-11-03 DB 초성 컬럼에 자음 삽입 작업
 */

public class GetAptData {
	final static String[] CHO = { "ㄱ", "ㄲ", "ㄴ", "ㄷ", "ㄸ", "ㄹ", "ㅁ", "ㅂ", "ㅃ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅉ", "ㅊ", "ㅋ", "ㅌ",
			"ㅍ", "ㅎ" };
	final static String[] JOONG = { "ㅏ", "ㅐ", "ㅑ", "ㅒ", "ㅓ", "ㅔ", "ㅕ", "ㅖ", "ㅗ", "ㅘ", "ㅙ", "ㅚ", "ㅛ", "ㅜ", "ㅝ", "ㅞ", "ㅟ",
			"ㅠ", "ㅡ", "ㅢ", "ㅣ" };
	final static String[] JONG = { "", "ㄱ", "ㄲ", "ㄳ", "ㄴ", "ㄵ", "ㄶ", "ㄷ", "ㄹ", "ㄺ", "ㄻ", "ㄼ", "ㄽ", "ㄾ", "ㄿ", "ㅀ", "ㅁ",
			"ㅂ", "ㅄ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ" };
	private static DBUtil dbUtil = DBUtil.getInstance();

	public static void main(String[] args) {
//		System.out.println("aptName 자음모음 분리 작업 시작");
//		List<HouseInfoDto> list = new ArrayList<HouseInfoDto>();
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		try {
//			conn = dbUtil.getConnection();
//			StringBuilder aptNameList = new StringBuilder();
//			aptNameList.append("select aptCode, aptName \n");
//			aptNameList.append("from ssafyvue.houseinfo \n");
//			pstmt = conn.prepareStatement(aptNameList.toString());
//			rs = pstmt.executeQuery();
//			HouseInfoDto houseInfoDto = new HouseInfoDto();
//			while (rs.next()) {
//				String title = rs.getString("aptName");
//				String pk = rs.getString("aptCode");
//				String jaeum = "";
//				for (int i = 0; i < title.length(); i++) {
//					char uniVal = title.charAt(i);
//					// 한글일 경우만 시작해야 하기 때문에 0xAC00부터 아래의 로직을 실행한다
//					if (uniVal >= 0xAC00) {
////						System.out.print(uniVal + "=>");
//						uniVal = (char) (uniVal - 0xAC00);
//						char cho = (char) (uniVal / 28 / 21);
//						char joong = (char) ((uniVal) / 28 % 21);
//						char jong = (char) (uniVal % 28);
//						// 종성의 첫번째는 채움이기 때문에
////						System.out.println(CHO[cho] + JOONG[joong] + JONG[jong]);
//						// 맨 첫번째 cho만 추출
//						jaeum += CHO[cho];
//					} else {
////						System.out.println(uniVal + "=>" + uniVal);
//						break;
//					}
//				} // end of for
////				System.out.println("추출한 자음: "+jaeum);
//				// 추출한 자음 테이블에 삽입
//				StringBuilder inputJaeum = new StringBuilder();
//				inputJaeum.append("update houseinfo set aptNameJaeum = ?  \n");
//				inputJaeum.append("where aptCode = ? \n");
//				pstmt = conn.prepareStatement(inputJaeum.toString());
//				pstmt.setString(1, jaeum);
//				pstmt.setString(2, pk);
//				pstmt.executeUpdate();
//				System.out.println("아파트 자음삽입완료");
////				break; // 시험삼아 1개만 해보자..ㅋㅋ
//			} // end of while
//			list.add(houseInfoDto);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			dbUtil.close(rs, pstmt, conn);
//		}
//	} // end of main

	 System.out.println("dongName 자음모음 분리 작업 시작");
     List<HouseInfoDto> list = new ArrayList<HouseInfoDto>();
     Connection conn = null;
     PreparedStatement pstmt = null;
     ResultSet rs = null;
     try {
         conn = dbUtil.getConnection();
         StringBuilder aptNameList = new StringBuilder();
         aptNameList.append("select aptCode, dongName \n");
         aptNameList.append("from houseinfo \n");
         pstmt = conn.prepareStatement(aptNameList.toString());
         rs = pstmt.executeQuery();
         while(rs.next()) {
             String title = rs.getString("dongName");
             String pk = rs.getString("aptCode");
             String jaeum = "";
             for(int i = 0; i < title.length(); i++) {
                 char uniVal = title.charAt(i);
                 // 한글일 경우만 시작해야 하기 때문에 0xAC00부터 아래의 로직을 실행한다
                 if(uniVal >= 0xAC00) {
//                     System.out.print(uniVal + "=>");
                     uniVal = (char)(uniVal - 0xAC00);
                     char cho = (char)(uniVal/28/21);
                     char joong = (char) ((uniVal)/28%21);
                     char jong = (char) (uniVal % 28);
                     // 종성의 첫번째는 채움이기 때문에
//                     System.out.println(CHO[cho] + JOONG[joong] + JONG[jong]);
                     // 맨 첫번째 cho만 추출
                     jaeum += CHO[cho];
                 } else {
//                     System.out.println(uniVal + "=>" + uniVal);
                     break;
                 }
             } // end of for
//             System.out.println("추출한 자음: "+jaeum);
             // 추출한 자음 테이블에 삽입
             StringBuilder inputJaeum = new StringBuilder();
             inputJaeum.append("update ssafyvue.houseinfo set dongNameJaeum = ?  \n");
             inputJaeum.append("where aptCode = ? \n");
             pstmt = conn.prepareStatement(inputJaeum.toString());
             pstmt.setString(1, jaeum);
             pstmt.setString(2, pk);
             pstmt.executeUpdate();
             System.out.println("동 자음삽입완료");
//             break; // 시험삼아 1개만 해보자..ㅋㅋ
         } // end of while
     } catch (SQLException e) {
         e.printStackTrace();
     } finally {
         dbUtil.close(rs, pstmt, conn);
     }
 }

}
