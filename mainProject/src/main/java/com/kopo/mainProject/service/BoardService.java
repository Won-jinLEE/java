package com.kopo.mainProject.service;

import java.util.List;
import java.util.Map;

public interface BoardService {
	String duplicateCheck(String gallName) throws Exception;
	void createGall(String gallName) throws Exception;
	List<Map<String, String>> gallList() throws Exception;
	Map<String, String> login(String userId, String password) throws Exception;
	List<Map<String, String>> postList(String idx) throws Exception;
}
