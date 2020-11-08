package com.tumedia.metoo.service.qna;

import java.util.List;

import com.tumedia.metoo.model.qna.QnA;

public interface QnAService {
	
	List<QnA> findAllQnA();
	
	QnA findQnADetailBySeq(int id);
	
	boolean insertQnA(QnA qna);

}
