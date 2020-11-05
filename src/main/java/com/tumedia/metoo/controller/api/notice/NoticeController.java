package com.tumedia.metoo.controller.api.notice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tumedia.metoo.common.data.Response;
import com.tumedia.metoo.dao.notice.NoticeDAO;
import com.tumedia.metoo.model.notice.Notice;

@RestController
@RequestMapping("/api")
public class NoticeController {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	@PostMapping("/notice")
	Response<Map<String,Object>> getAllNoticeList(@ModelAttribute Notice notice,
									BindingResult result,
									HttpServletRequest request, 
									HttpServletResponse response){
//		Response<Notice> res = new Response<Notice>();
		List<Notice> arrNotice = null;
		Notice notice2 = new Notice();
		HashMap<String,Object> param = new HashMap<>();
		
			
//			notice1.setTitle("test03");
//			notice1.setContent("동해물과 백두산이 마르고 닳도록 하나님 보우하사 우리나라 만세");
//			notice1.setNotice_dvcd("media");
//			notice1.setIsFixed("test04");
//			notice1.setView_cnt(2);
//			notice1.setReg_date(LocalDate.now());
			arrNotice = noticeDAO.listAllByNotice();
			param.put("notice", arrNotice);
			
			System.out.println(new Response(param));
//			res.setData(notice1);
		return new Response(param);
	}
	
//	@PostMapping("/notice")
//	Response<Notice> insertNotice(@ModelAttribute Notice notice,
//									BindingResult result,
//									HttpServletRequest request, 
//									HttpServletResponse response){
//		Response<Notice> res = new Response<Notice>();
//		Notice notice1 = new Notice();
//			
//			notice1.setTitle("test03");
//			notice1.setContent("동해물과 백두산이 마르고 닳도록 하나님 보우하사 우리나라 만세");
//			notice1.setNotice_dvcd("media");
//			notice1.setIsFixed("test04");
//			notice1.setView_cnt(2);
//			notice1.setReg_date(LocalDate.now());
//			noticeDAO.insertBoard(notice1);
//			
//			res.setData(notice1);
//		return res;
//	}
}