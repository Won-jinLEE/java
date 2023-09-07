package com.kopo.mainProject.service.serviceImpl;

import java.security.MessageDigest;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.kopo.mainProject.repository.BoardRepository;
import com.kopo.mainProject.repository.GallRepository;
import com.kopo.mainProject.repository.UserRepository;
import com.kopo.mainProject.service.BoardService;

import jakarta.transaction.Transactional;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	private final GallRepository gallRepo;
	private final UserRepository userRepo;
	private final BoardRepository boardRepo;
	
	public BoardServiceImpl(GallRepository gallRepo, UserRepository userRepo, BoardRepository boardRepo) {
        this.gallRepo = gallRepo;
        this.userRepo = userRepo;
        this.boardRepo = boardRepo;
    }
	
	public String duplicateCheck(String gallName) throws Exception{
		String check = gallRepo.duplicateCheck(gallName);
		String result;
		if(check==null) {
			result = "0";
		}else {
			result = "1";
		}
		return result;
	}
	
	@Transactional
    public void createGall(String gallName) throws Exception {
        gallRepo.createGall(gallName);
    }
	
	public List<Map<String, String>> gallList() throws Exception{
		List<Map<String, String>> result = gallRepo.gallList();
		return result;
	}
	
	public Map<String, String> login(String userId, String password) throws Exception{
		String hashPw = hash(password);
		Map<String, String> result = userRepo.login(userId, hashPw);
		return result;
	}
	
	public List<Map<String, String>> postList(String idx) throws Exception{
		List<Map<String, String>> result = boardRepo.postList(idx);
		return result;
	}
	
	public static String hash(String s) {
        return encrypt(s, "SHA-256");
    }
	
	public static String encrypt(String s, String messageDigest) {
	   try {
	       MessageDigest md = MessageDigest.getInstance(messageDigest);
	       byte[] passBytes = s.getBytes();
	       md.reset();
	       byte[] digested = md.digest(passBytes);
	       StringBuilder sb = new StringBuilder();
	       for (int i = 0; i < digested.length; i++) sb.append(Integer.toString((digested[i]&0xff) + 0x100, 16).substring(1));
	       return sb.toString();
	   } catch (Exception e) {
	       return s;
	   }
	}
	
}
