package com.fornula.domain.member.join;

import com.fornula.domain.member.dto.Interest;
import com.fornula.domain.member.dto.Member;

public interface MemberJoinRepository {

	public void join(Member member) throws Exception;
	public void insertjoin(Interest interest) throws Exception;
}
