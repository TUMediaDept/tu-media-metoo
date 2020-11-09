package com.tumedia.metoo.dao.qna;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.tumedia.metoo.model.qna.QnA;

@Repository
@Mapper
public interface QnADAO {
	
	List<QnA> findAllQnA();
	
	QnA findQnADetailById(int id);
	
	boolean insertQnA(QnA qna);
}
