package com.tumedia.metoo.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tumedia.metoo.dao.member.MemberDAO;
import com.tumedia.metoo.model.member.Member;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDAO memberDao;

	@Override
	public boolean insertMember(Member member) {
		// TODO Auto-generated method stub
		return memberDao.insertMember(member);
	}

	@Override
	public List<Member> findAllMember() {
		// TODO Auto-generated method stub
		return memberDao.findAllMember();
	}

	@Override
	public Member findMemberDetailById(int id) {
		// TODO Auto-generated method stub
		return memberDao.findMemberDetailById(id);
	}

}