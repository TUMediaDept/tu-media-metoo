package com.tumedia.metoo.service.lecture;

import java.util.List;

import com.tumedia.metoo.model.lecture.LectureEvalution;


public interface LectureEvalutionService {

	List<LectureEvalution> findAllLectureEvalution();
	
	LectureEvalution findEvalutionDetailBySeq(int id);
	
	boolean insertLectureEvalution(LectureEvalution lectureEvalution);
}
