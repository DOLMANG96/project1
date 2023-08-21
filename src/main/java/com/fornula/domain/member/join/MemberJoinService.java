package com.fornula.domain.member.join;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.fornula.domain.member.dto.Member;

public interface MemberJoinService {

	public void join(Member member) throws Exception;
}
