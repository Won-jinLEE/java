package com.kopo.mainProject.controller;

import java.util.List;
import java.util.Map;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kopo.mainProject.service.BoardService;

import jakarta.annotation.Resource;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "http://localhost/api")
public class ApiController {
	
	@Resource(name="boardService")
	private BoardService boardService;
	
	@GetMapping("/duplicateCheck")
	@ResponseBody
	public String duplicateCheck(@RequestParam("gallName") String gallName) throws Exception {
		String result = boardService.duplicateCheck(gallName);
		return result;
	}
	
	@GetMapping("/gallList")
	@ResponseBody
	public List<Map<String, String>> gallList() throws Exception {
		List<Map<String, String>> result = boardService.gallList();
		return result;
	}
	
	@GetMapping("/postList")
	@ResponseBody
	public List<Map<String, String>> postList(@RequestParam("idx") String idx) throws Exception {
		List<Map<String, String>> result = boardService.postList(idx);
		return result;
	}
	
	@PostMapping("/createGall")
	public void createGall(@RequestParam("gallName") String gallName) throws Exception {
		boardService.createGall(gallName);
	}
	
}
