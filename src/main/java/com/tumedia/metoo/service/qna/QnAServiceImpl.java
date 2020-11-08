package com.tumedia.metoo.service.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tumedia.metoo.dao.qna.QnADAO;
import com.tumedia.metoo.model.qna.QnA;

@Service
public class QnAServiceImpl implements QnAService{

	@Autowired
	private QnADAO qnaDao;
	
	@Override
	public List<QnA> findAllQnA() {
		// TODO Auto-generated method stub
		return qnaDao.findAllQnA();
	}

	@Override
	public QnA findQnADetailBySeq(int id) {
		// TODO Auto-generated method stub
		return qnaDao.findQnADetailBySeq(id);
	}

	@Override
	public boolean insertQnA(QnA qna) {
		// TODO Auto-generated method stub
		return qnaDao.insertQnA(qna);
	}

	
}
