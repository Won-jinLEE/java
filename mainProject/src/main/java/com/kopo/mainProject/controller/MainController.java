package com.kopo.mainProject.controller;

import java.util.Locale;
import java.util.Map;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kopo.mainProject.service.BoardService;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpSession;

@SpringBootApplication
@Controller
public class MainController {
	
	@Resource(name="boardService")
	private BoardService boardService;
	
	@GetMapping("/")
	public String mainPage(Locale locale, Model model) {
		return "mainPage";
	}
	
	@GetMapping("/createPage")
	public String createPage(Locale locale, Model model) {
		return "createPage";
	}
	
	@GetMapping("/insertPage")
	public String insertPage(Locale locale, Model model, HttpSession session) {
		String check = (String) session.getAttribute("nickname");
		if(check!=null) {
			model.addAttribute("workType", "modify");
		}else {
			model.addAttribute("workType", "insert");
		}
		return "insertPage";
	}
	
	@GetMapping("/gallPage")
	public String gallPage(Locale locale, Model model) {
		return "gallPage";
	}
	
	@GetMapping("/postPage")
	public String postPage(Locale locale, Model model, @RequestParam("workType") String workType) {
		return "postPage";
	}
	
	@GetMapping("/viewPage")
	public String viewPage(Locale locale, Model model) {
		return "viewPage";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("userId") String userId, @RequestParam("password") String password, @RequestParam("url") String url, ModelMap model, HttpSession session) throws Exception {
		Map<String, String> result = boardService.login(userId, password);
		if(result !=null) {
			for(Map.Entry<String, String> entry : result.entrySet()) {
				String sessionKey = entry.getKey();
				String sessionVal = entry.getValue();
				session.setAttribute(sessionKey, sessionVal);
			}
		}else {
			model.addAttribute("msg", "아이디와 비밀번호를 확인해주세요.");
		}
		return "redirect:" + url;
	}
	
	@PostMapping("/logout")
	public String logout(@RequestParam("url") String url, ModelMap model, HttpSession session) throws Exception {
		session.setAttribute("userType", null);
		session.setAttribute("uuid", null);
		session.setAttribute("nickname", null);
		return "redirect:" + url;
	}
}
