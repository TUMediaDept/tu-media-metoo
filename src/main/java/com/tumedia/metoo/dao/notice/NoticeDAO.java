package com.tumedia.metoo.dao.notice;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.tumedia.metoo.model.notice.Notice;

@Repository
@Mapper
public interface NoticeDAO {
	public List<Notice> listAllByNotice();
	Notice findNoticeDetails(int id);
}
