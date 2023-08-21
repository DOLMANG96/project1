package com.fornula.domain.member.join;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fornula.domain.member.dto.Member;

@Service
public class MemberJoinServiceImpl implements MemberJoinService{
	
	@Autowired
	private MemberJoinRepository memberJoinDAO;

	@Override
	public void join(Member member) throws Exception {
		
		memberJoinDAO.join(member);
	}
	
}
