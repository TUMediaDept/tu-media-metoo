package com.tumedia.metoo.service.notice;

import java.util.List;

import com.tumedia.metoo.model.notice.Notice;

public interface NoticeService {
	
	List<Notice> listAllByNotice();
	
	Notice findNoticeDetails(int id);
}
