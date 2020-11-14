package com.tumedia.metoo.dao.lecture;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.tumedia.metoo.model.lecture.LectureEvaluation;


@Repository
@Mapper
public interface LectureEvaluationDAO {
	
	List<LectureEvaluation> findAllLectureEvaluation();
	
	LectureEvaluation findEvaluationDetailBySeq(int seq);
	
	boolean insertLectureEvaluation(LectureEvaluation lectureEvaluation);
}
