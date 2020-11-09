package com.tumedia.metoo.controller.api.notice;

import java.nio.charset.Charset;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tumedia.metoo.common.data.ResponseMessage;
import com.tumedia.metoo.common.data.StatusEnum;
import com.tumedia.metoo.model.notice.Notice;
import com.tumedia.metoo.service.notice.NoticeService;

@RestController
@RequestMapping("/api")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;

	// Notice 전체 조회

	@GetMapping("/notice")
	ResponseEntity<ResponseMessage> getAllNoticeList(@ModelAttribute Notice notice,
												BindingResult result,
												HttpServletRequest request, 
												HttpServletResponse response) {

		// 리스트 조회
		List<Notice> noticeList = noticeService.listAllByNotice();

		// 응답 Message Header setting
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

		ResponseMessage rms = new ResponseMessage();
		if(noticeList != null) {
			rms.setData(noticeList);
			rms.setMessage("성공");
			rms.setStatus(StatusEnum.OK);
		} else {
			rms.setData(null);
			rms.setMessage("실패");
			rms.setStatus(StatusEnum.INTERNAL_SERER_ERROR);
		}
		return new ResponseEntity<>(rms, headers, HttpStatus.OK);
	}

	// Notice 상세조
	@GetMapping("notice/{id}")
	ResponseEntity<ResponseMessage> findNoticeDetail(@PathVariable int id,							
													HttpServletRequest request,
													HttpServletResponse response) {

		// 리스트 조회
		Notice notice = noticeService.findNoticeDetails(id);

		// 응답 Message Header setting 
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

		ResponseMessage rms = new ResponseMessage();
		
		if (notice != null) {
			rms.setData(notice);
			rms.setMessage("성공");
			rms.setStatus(StatusEnum.OK);
		} else {
			rms.setData(null);
			rms.setMessage("실패");
			rms.setStatus(StatusEnum.INTERNAL_SERER_ERROR);
		}
		
		return new ResponseEntity<>(rms, headers, HttpStatus.OK);
	}
}