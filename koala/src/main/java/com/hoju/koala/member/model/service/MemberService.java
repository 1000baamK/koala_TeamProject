package com.hoju.koala.member.model.service;

import java.util.ArrayList;

import com.hoju.koala.board.model.vo.Board;
import com.hoju.koala.member.model.vo.Follow;
import com.hoju.koala.member.model.vo.Member;

public interface MemberService {

	//로그인
	Member loginMember(Member m);

	//회원조회 활동내역
	Member selectMember(String userId);

	//회원가입
	int insertMember(Member m);

	//소개글 수정
	int updateIntroduce(Member m);

	//팔로우가 되어있는지 확인하는 메소드
	int selectFollow(Follow f);
	
	//팔로우 하기
	int addFollow(Follow f);

	//팔로우 취소하기
	int removeFollow(Follow f);

	//해당 회원 팔로우 수 조회
	int selectFollowCount(int userNo);

	//비밀번호 변경
	int updatePwd(Member loginUser);
	
	//계정 삭제
	int deleteMember(String userId);

	//입력한 이메일에 대한 데이터가 있는지 조회 있다면 아이디만 가져오기
	String selectEmail(String userEmail);

	//아이디 중복체크
	int idCheck(String inputId);

	//닉네임 중복체크
	int nickCheck(String inputNick);

	//유저가 쓴 게시글 조회
	ArrayList<Board> boardList(String userNo);

	

}
