package com.tumedia.metoo.controller.api.lecture;

import java.nio.charset.Charset;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tumedia.metoo.common.data.ResponseMessage;
import com.tumedia.metoo.common.data.StatusEnum;
import com.tumedia.metoo.model.lecture.LectureEvalution;
import com.tumedia.metoo.model.notice.Notice;
import com.tumedia.metoo.service.lecture.LectureEvalutionService;


@RestController
@RequestMapping("/api")
public class LectureEvalutionController {
	
	@Autowired
	private LectureEvalutionService lectureEvalutionService;
	
	@GetMapping("/evaluation")
	ResponseEntity<ResponseMessage> getAllNoticeList(@ModelAttribute Notice notice, 
														HttpServletRequest request, 	
														HttpServletResponse response) {

		// 리스트 조회
		List<LectureEvalution> lectureEvalutionList = lectureEvalutionService.findAllLectureEvalution();

		// 응답 Message Header setting
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

		ResponseMessage rms = new ResponseMessage();
		if(lectureEvalutionList != null) {
			rms.setData(lectureEvalutionList);
			rms.setMessage("성공");
			rms.setStatus(StatusEnum.OK);
		} else {
			rms.setData(null);
			rms.setMessage("실패");
			rms.setStatus(StatusEnum.INTERNAL_SERER_ERROR);
		}
		return new ResponseEntity<>(rms, headers, HttpStatus.OK);
	}
	
	@GetMapping("/evaluation/{id}")
	public ResponseEntity<ResponseMessage> findQnADetailById(@PathVariable int id) {


		LectureEvalution lectureEvalution = lectureEvalutionService.findEvalutionDetailBySeq(id);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

		ResponseMessage rms = new ResponseMessage();

		if (lectureEvalution != null) {
			rms.setData(lectureEvalution);
			rms.setMessage("강의평가 조회 성공");
			rms.setStatus(StatusEnum.OK);
		} else {
			rms.setData(lectureEvalution);
			rms.setMessage("강의평가 조회 실패");
			rms.setStatus(StatusEnum.INTERNAL_SERER_ERROR);
		}

		return new ResponseEntity<>(rms, headers, HttpStatus.OK);
	}
	
	@PostMapping("/evaluation")
	public ResponseEntity<ResponseMessage> insertMember(@ModelAttribute LectureEvalution lectureEvalution) {

		// 리스트 등록 결과 : 1. 성공 0. 실패
		boolean result = lectureEvalutionService.insertLectureEvalution(lectureEvalution);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

		ResponseMessage rms = new ResponseMessage();

		if (result = true) {
			rms.setData(result);
			rms.setMessage("강의평가 등록 성공");
			rms.setStatus(StatusEnum.OK);
		} else {
			rms.setData(result);
			rms.setMessage("강의평가 등록 실패");
			rms.setStatus(StatusEnum.INTERNAL_SERER_ERROR);
		}

		return new ResponseEntity<>(rms, headers, HttpStatus.OK);
	}
}
