package com.tumedia.metoo.controller.page;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonPageController {
	
	/** 메인화면 */
    @GetMapping(value = "/")
    public String mainPage(Locale locale, Model model, HttpServletRequest request) {
        return "common/main";
    }

    /** 로그인 */
    @GetMapping(value = "auth/login")
    public String loginPage() {
        return "common/login";
    }

}
