package com.tumedia.metoo.dao.member;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.tumedia.metoo.model.member.Member;

/**
 * memberDAO -> resource/mapper/memberDAO 매칭
 */
@Repository
@Mapper
public interface MemberDAO {
	void signUp(Member mebmer);
}
