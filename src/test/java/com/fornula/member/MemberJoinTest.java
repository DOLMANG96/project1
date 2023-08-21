package com.fornula.member;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.join.MemberJoinMapper;

import org.junit.Test;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberJoinTest {

	@Autowired
	private MemberJoinMapper memberJoinMapper;
	
	@Test
	public void memberJoin() {
		Member member = new Member();
		
		member.setId("1");
		member.setPassword("1");
		member.setEmail("1");
		
		memberJoinMapper.memberJoin(member);
	}
}
