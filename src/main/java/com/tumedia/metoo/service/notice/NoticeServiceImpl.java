package com.tumedia.metoo.service.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tumedia.metoo.dao.notice.NoticeDAO;
import com.tumedia.metoo.model.notice.Notice;

@Service
public class NoticeServiceImpl implements NoticeService{

	@Autowired
	private NoticeDAO noticeDao;

	@Override
	public List<Notice> listAllByNotice() {
		// TODO Auto-generated method stub
		return noticeDao.listAllByNotice();
	}

	@Override
	public Notice findNoticeDetails(int id) {
		// TODO Auto-generated method stub
		return noticeDao.findNoticeDetails(id);
	}

	
	
}