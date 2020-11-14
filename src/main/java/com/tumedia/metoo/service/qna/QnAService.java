package com.tumedia.metoo.service.qna;

import java.util.List;

import com.tumedia.metoo.model.qna.QnA;

public interface QnAService {
	
	List<QnA> findAllQnA(int type);
	
	QnA findQnADetailById(int id);
	
	boolean insertQnA(QnA qna);

}
