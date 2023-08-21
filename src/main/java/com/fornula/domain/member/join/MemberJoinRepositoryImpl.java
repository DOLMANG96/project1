package com.fornula.domain.member.join;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fornula.domain.member.dto.Interest;
import com.fornula.domain.member.dto.Member;

@Repository
public class MemberJoinRepositoryImpl implements MemberJoinRepository {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void join(Member member) throws Exception {
		sqlSession.insert("MemberJoinMapper.join", member);
	}

	@Override
	public void insertjoin(Interest interest) throws Exception {
		sqlSession.insert("Mem")
		
	}
}
