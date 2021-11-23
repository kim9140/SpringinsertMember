package com.mycompany.myapp.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp.member.vo.Member;

@Repository("memberdao")
public class MemberDAO {
	@Autowired
	SqlSession sqlsession;
	
	public int signUp(Member vo) throws Exception{
		
		return sqlsession.insert("signUp", vo);
	}
}
