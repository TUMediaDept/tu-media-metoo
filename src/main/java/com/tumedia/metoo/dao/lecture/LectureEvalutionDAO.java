package com.tumedia.metoo.dao.lecture;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.tumedia.metoo.model.lecture.LectureEvalution;

@Repository
@Mapper
public interface LectureEvalutionDAO {
	
	List<LectureEvalution> findAllLectureEvalution();
	
	LectureEvalution findEvalutionDetailBySeq(int seq);
	
	boolean insertLectureEvalution(LectureEvalution lectureEvalution);
}
