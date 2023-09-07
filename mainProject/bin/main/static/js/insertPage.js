var currentUrl = window.location.href;
// 메인 페이지로
function main(){
	window.location.href = "/";
}
// 아이디 실시간 중복체크
function currentCheck() {
  var userId = {
	  userId : $("#userId").val(),
      mod : "member"
  }
  $.ajax({
     url: "/currentCheck.do",
     type : "POST",
     data : userId,
     success: function(data) {
 		 if(data=="0"){
 	     	$("#checkIdYes").css("display", "block");
 	    	$("#checkIdNo").css("display", "none");
 	    	$("#checkIdResult").val("0");
 	     }
 		 
 	     if(data=="1"){
 	     	$("#checkIdYes").css("display", "none");
 	    	$("#checkIdNo").css("display", "block");
 	    	$("#checkIdResult").val("1");
 	     }
 	     
 	     if($("#userId").val().length<4){
 	     	$("#checkIdYes").css("display", "none");
 	    	$("#checkIdNo").css("display", "none");
 	    	$("#checkIdResult").val("");  
 	     }
     }, error: function() {
        	alert("에러발생");
     }
  })
}
// 비밀번호 확인 체크
function equalCheck() {
    if($("#password").val().length<4){
 		$("#pwLength").css("display", "block");
   	}else{
   		$("#pwLength").css("display", "none");
   	}
       
	if($("#password").val() == $("#passwordCheck").val()){
    	$("#equalYes").css("display", "block");
    	$("#equalNo").css("display", "none");
    }
	   
	if($("#password").val() != $("#passwordCheck").val()){
    	$("#equalYes").css("display", "none");
    	$("#equalNo").css("display", "block");
    }
	   
	if($("#passwordCheck").val().length<4){
		$("#equalYes").css("display", "none");
    	$("#equalNo").css("display", "none");
    }
  }
// 회원정보 확인(가입시)
function joinCheck(){
	const userId = $("#userId");
	const statusCheck = $("#checkIdResult");
	const password = $("#password");
	const passwordCheck = $("#passwordCheck");
	const nickName = $("#nickName");
	if( userId!=null && userId.val()==''){
		alert("아이디를 입력하세요");
		userId.focus();
		return false;
	}
	
	if( userId!=null && userId.val().length<4){
		alert("아이디를 4자 이상 입력하세요");
		userId.focus();
		return false;
	}
	
	if( statusCheck!=null && statusCheck.val() == "1"){
		alert("이미 사용중인 아이디입니다");
		userId.focus();
		return false;
	}
	
	if( password.val() == '') {
		alert("비밀번호를 입력하세요");
		password.focus();
		return false;
	}
	
	if( password.val().length<4) {
		alert("비밀번호를  4자 이상 입력하세요");
		password.focus();
		return false;
	}
	
	if( passwordCheck!=null && passwordCheck.val()=='') {
		alert("비밀번호 확인을 입력하세요");
		passwordCheck.focus();
		return false;
	}
	
	if( passwordCheck!=null && password.val() != passwordCheck.val() ) {
		alert("비밀번호 확인이 틀렸습니다");
		passwordCheck.focus();
		return false;
	}
	
	if( nickName.val() == '') {
		alert("닉네임을 입력하세요");
		nickName.focus();
		return false;
	}
	
	if (!confirm("등록하시겠습니까?")){
		return false;
	}
	
	alert("회원가입 완료");
	$("#insertId").val($("#userId").val());
	$("#insertPassword").val($("#password").val());
	$("#insertNickName").val($("#nickName").val());
	$("#url").val(prePage);
	return true;
}
// 회원정보 확인(회원정보수정)
function modifyCheck(){
	if( $("#password").val() == '') {
		alert("비밀번호를 입력하세요");
		$("#password").focus();
		return false;
	}
	
	if( $("#password").val().length<4) {
		alert("비밀번호를 4자 이상 입력하세요");
		$("#password").focus();
		return false;
	}
	
	if( $("#nickName").val() == '') {
		alert("닉네임을 입력하세요");
		$("#nickName").focus();
		return false;
	}
	
	if (!confirm("등록하시겠습니까?")){
		return false;
	}
	
	alert("회원정보 수정완료");
	$("#modifyPassword").val($("#password").val());
	$("#modifyNickName").val($("#nickName").val());
	$("#url").val(prePage);
	return true;
}
// 이전 페이지로
function goBack() {
	history.back();
}
