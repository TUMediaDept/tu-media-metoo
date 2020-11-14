package com.tumedia.metoo.service.lecture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tumedia.metoo.dao.lecture.LectureEvalutionDAO;
import com.tumedia.metoo.model.lecture.LectureEvalution;

@Service
public class LectureEvalutionServiceImpl implements LectureEvalutionService {

	@Autowired
	private LectureEvalutionDAO lectureEvalutionDAO;
	
	@Override
	public List<LectureEvalution> findAllLectureEvalution() {
		// TODO Auto-generated method stub
		return lectureEvalutionDAO.findAllLectureEvalution();
	}

	@Override
	public LectureEvalution findEvalutionDetailBySeq(int id) {
		// TODO Auto-generated method stub
		return lectureEvalutionDAO.findEvalutionDetailBySeq(id);
	}

	@Override
	public boolean insertLectureEvalution(LectureEvalution lectureEvalution) {
		// TODO Auto-generated method stub
		return lectureEvalutionDAO.insertLectureEvalution(lectureEvalution);
	}

}
