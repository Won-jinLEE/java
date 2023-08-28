<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
 	 
<body>
 <form action="/fileUpload.do" id="fileUpload" name="fileUpload" method="post" enctype="multipart/form-data">
	파일 : <input type="file" name="file"><br>
	<input type="submit" name="업로드" value="업로드"><br>
 </form>
</body>