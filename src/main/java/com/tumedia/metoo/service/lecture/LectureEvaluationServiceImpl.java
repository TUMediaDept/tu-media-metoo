package com.tumedia.metoo.service.lecture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tumedia.metoo.dao.lecture.LectureEvaluationDAO;
import com.tumedia.metoo.model.lecture.LectureEvaluation;

@Service
public class LectureEvaluationServiceImpl implements LectureEvaluationService {

	@Autowired
	private LectureEvaluationDAO lectureEvalutionDAO;
	
	@Override
	public List<LectureEvaluation> findAllLectureEvaluation() {
		// TODO Auto-generated method stub
		return lectureEvalutionDAO.findAllLectureEvaluation();
	}

	@Override
	public LectureEvaluation findEvaluationDetailBySeq(int id) {
		// TODO Auto-generated method stub
		return lectureEvalutionDAO.findEvaluationDetailBySeq(id);
	}

	@Override
	public boolean insertLectureEvaluation(LectureEvaluation lectureEvalution) {
		// TODO Auto-generated method stub
		return lectureEvalutionDAO.insertLectureEvaluation(lectureEvalution);
	}

}
