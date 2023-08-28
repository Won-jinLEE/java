/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package egovframework.example.sample.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import egovframework.example.sample.service.EgovSampleService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;

/**
 * @Class Name : EgovSampleServiceImpl.java
 * @Description : Sample Business Implement Class
 * @Modification Information
 * @
 * @  수정일      수정자              수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2009.03.16           최초생성
 *
 * @author 개발프레임웍크 실행환경 개발팀
 * @since 2009. 03.16
 * @version 1.0
 * @see
 *
 *  Copyright (C) by MOPAS All right reserved.
 */

@Service("sampleService")
public class EgovSampleServiceImpl extends EgovAbstractServiceImpl implements EgovSampleService {

	private static final Logger LOGGER = LoggerFactory.getLogger(EgovSampleServiceImpl.class);

	/** ID Generation */
	@Resource(name = "egovIdGnrService")
	private EgovIdGnrService egovIdGnrService;
	
	@Override
    public void uploadFile(MultipartHttpServletRequest req) throws Exception {
		String uploadPath = "F:\\"; // 파일 저장위치
	    int chunkSize = 10 * 1024 * 1024; // 10MB

	    Iterator<String> itr = req.getFileNames();
	    String originalFilename = null;
	    String combinedFilePath = null;
	    OutputStream outputStream = null;
	    
	    long startTime = System.currentTimeMillis();
	    
	    while (itr.hasNext()) {
	        MultipartFile mpf = req.getFile(itr.next());
	        originalFilename = mpf.getOriginalFilename();
	        combinedFilePath = uploadPath + originalFilename;

	        try (InputStream inputStream = mpf.getInputStream()) {
	            if (outputStream == null) {
	                outputStream = new FileOutputStream(new File(combinedFilePath));
	            }

	            byte[] buffer = new byte[chunkSize];
	            int bytesRead;
	            while ((bytesRead = inputStream.read(buffer)) != -1) {
	                outputStream.write(buffer, 0, bytesRead);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	            // Handle the exception
	        }
	    }

	    if (outputStream != null) {
	        outputStream.close();
	    }
	    
	    long endTime = System.currentTimeMillis(); // 종료 시간 기록
	    long uploadTime = endTime - startTime; // 업로드 시간 계산

	    System.out.println("File upload time: " + uploadTime + "ms");
    }
	
}