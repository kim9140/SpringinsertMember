package com.mycompany.myapp.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp.member.dao.MemberDAO;
import com.mycompany.myapp.member.vo.Member;


@Service("MemberService")
public class MemberServicelmpl implements MemberService {

@Autowired
private MemberDAO memberdao;

@Override
public int signUp(Member vo) throws Exception {
	// TODO Auto-generated method stub
	return memberdao.signUp(vo);
}

}
