package com.tumedia.metoo.controller.api.qna;

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
import com.tumedia.metoo.model.qna.QnA;
import com.tumedia.metoo.service.qna.QnAService;

@RestController
@RequestMapping("/api")
public class QnAController {
	
	@Autowired
	private QnAService qnaService;
	
	@GetMapping("/qna")
	ResponseEntity<ResponseMessage> findAllQnA(@ModelAttribute QnA QnA, 
														HttpServletRequest request, 	
														HttpServletResponse response) {

		// 리스트 조회
		List<QnA> qnaList = qnaService.findAllQnA();

		// 응답 Message Header setting
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

		ResponseMessage rms = new ResponseMessage();
		if(qnaList != null) {
			rms.setData(qnaList);
			rms.setMessage("성공");
			rms.setStatus(StatusEnum.OK);
		} else {
			rms.setData(null);
			rms.setMessage("실패");
			rms.setStatus(StatusEnum.INTERNAL_SERER_ERROR);
		}
		return new ResponseEntity<>(rms, headers, HttpStatus.OK);
	}
	
	@GetMapping("/qna/{id}")
	public ResponseEntity<ResponseMessage> findQnADetailById(@PathVariable int id) {


		QnA qna = qnaService.findQnADetailById(id);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

		ResponseMessage rms = new ResponseMessage();

		if (qna != null) {
			rms.setData(qna);
			rms.setMessage("QnA 조회 성공");
			rms.setStatus(StatusEnum.OK);
		} else {
			rms.setData(qna);
			rms.setMessage("QnA 조회 실패");
			rms.setStatus(StatusEnum.INTERNAL_SERER_ERROR);
		}

		return new ResponseEntity<>(rms, headers, HttpStatus.OK);
	}
	
	@PostMapping("/qna")
	public ResponseEntity<ResponseMessage> insertMember(@ModelAttribute QnA qna) {

		// QnA 등록 결과 : 1. 성공 0. 실패
		boolean result = qnaService.insertQnA(qna);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

		ResponseMessage rms = new ResponseMessage();

		if (result = true) {
			rms.setData(result);
			rms.setMessage("QnA 등록 성공");
			rms.setStatus(StatusEnum.OK);
		} else {
			rms.setData(result);
			rms.setMessage("QnA 등록 실패");
			rms.setStatus(StatusEnum.INTERNAL_SERER_ERROR);
		}

		return new ResponseEntity<>(rms, headers, HttpStatus.OK);
	}
	
}
