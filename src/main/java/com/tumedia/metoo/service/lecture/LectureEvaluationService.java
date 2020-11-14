package com.tumedia.metoo.service.lecture;

import java.util.List;

import com.tumedia.metoo.model.lecture.LectureEvaluation;


public interface LectureEvaluationService {

List<LectureEvaluation> findAllLectureEvaluation();
	
	LectureEvaluation findEvaluationDetailBySeq(int id);
	
	boolean insertLectureEvaluation(LectureEvaluation lectureEvalution);
}
