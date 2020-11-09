package com.tumedia.metoo.dao.member;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.tumedia.metoo.model.member.Member;


@Repository
@Mapper
public interface MemberDAO {
	
	boolean insertMember(Member mebmer);
	
	List<Member> findAllMember();
	
	Member findMemberDetailById(int id);
}
