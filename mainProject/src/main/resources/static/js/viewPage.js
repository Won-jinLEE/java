// 메인페이지로
function main(){
	window.location.href = "/mainPage.do";
}
// 회원가입 페이지로
function insert(){
	window.location.href = "/insertPage.do";
}
// 정보수정 페이지로
function modify(){
	window.location.href = "/insertPage.do?workType=modify";
}
//이전 페이지로
function cancle(){
	window.location.href = "/gallPage.do?idx="+gallIdx+"&name="+gallName;
}
function hash(input) {
  	return CryptoJS.SHA256(input).toString();
}
// 로그인 액션
function login(){
	if($("#user_id").val() ==""){
        alert("아이디를 입력하세요");
        $("#user_id").focus();
        return false;
    }
    if($("#password").val() ==""){
        alert("비밀번호를 입력하세요");
        $("#password").focus();
        return false;
    }
    $("#url").val(currentPage)
    return true;
}
// 로그아웃 액션
function logout(){
	$("#url").val(currentPage)
	return true;
}
// 비로그인시 글수정 및 삭제 비밀번호 체크창
function checkPostPassword() {
	var actionType = $("#actionType").val();
	var password = $("#postPassword").val();
	var checkPassword = $("#postDeletePassword").val();
	var hashPassword = hash(checkPassword);
	if(password != hashPassword){
		alert("비밀번호 오류")
		return
	}
	if(actionType=="D"){
		if (!confirm("글을 삭제하시겠습니까?")){
        	return;
        }
		window.location.href = "/deletePost.do?idx="+gallIdx+"&name="+gallName+"&seq="+postSeq;
	}else if(actionType=="M"){
		if (!confirm("글을 수정하시겠습니까?")){
        	return;
        }
		var title = $("#postTitle").val();
    	var contents = $("#postContents").val();
    	window.location.href = "/postPage.do?idx="+gallIdx+"&name="+gallName+"&seq="+postSeq+"&title="+title+"&contents="+contents;
	}
}
// 비로그인시 글수정 및 삭제 비밀번호 체크창 닫기
function closePostModal() {
    $("#postPasswordCheck").css("display", "none");
}
// 글수정 버튼
function modifyPostBtn(checkType){
	if(checkType=="Y"){// 로그인시
    	if (!confirm("글을 수정하시겠습니까?")){
        	return;
        }
    	var title = $("#postTitle").val();
    	var contents = $("#postContents").val();
    	window.location.href = "/postPage.do?idx="+gallIdx+"&name="+gallName+"&seq="+postSeq+"&title="+title+"&contents="+contents;
	}else{//비 로그인시
		$("#actionType").val("M");
    	if($("#postPasswordCheck").css("display")=="none"){
    		$("#postPasswordCheck").css("display", "block");
            $("#postDeletePassword").focus();      		
    	}else{
    		$("#postPasswordCheck").css("display", "none");
    	}
	}
}
// 글삭제 버튼
function deletePostBtn(checkType){
	if(checkType=="Y"){// 로그인시
		if (!confirm("글을 삭제하시겠습니까?")){
        	return;
        }
		window.location.href = "/deletePost.do?idx="+gallIdx+"&name="+gallName+"&seq="+postSeq;
	}else{// 비로그인시
		$("#actionType").val("D");
		if($("#postPasswordCheck").css("display")=="none"){
    		$("#postPasswordCheck").css("display", "block");
            $("#postDeletePassword").focus();      		
    	}else{
    		$("#postPasswordCheck").css("display", "none");
    	}
	}
}
// 댓글등록
function addReply(){
	if (!confirm("댓글을 등록하시겠습니까?")){
		return false;
	}
	$("#throw_reply_id").val($("#reply_id").val());
	$("#throw_reply_login_yn").val($("#login_yn").val());
	var check = $("#throw_reply_login_yn").val();
	if(check=='Y'){
		$("#throw_reply_password").val($("#reply_password").val());
	}else{
		$("#throw_reply_password").val(hash($("#reply_password").val()));
	}
	return true;
}
// 비로그인시 댓글삭제 체크창
function checkReplyPassword() {
	if (!confirm("댓글을 삭제하시겠습니까?")){
   		return;
   	}
	var checkNum = $("#replySeqCheck").val();
    var replyPassword = $("#checkReplyDeletePassword"+checkNum).val();
    var password = $("#replyDeletePassword").val();
    if(replyPassword!=hash(password)){
    	alert("비밀번호가 틀렸습니다")
    	return;
    }
    var loginCheck = $("#checkReplyDeleteLogin"+checkNum).val();
    window.location.href = "/deleteReply.do?idx="+gallIdx+"&name="+gallName+"&seq="+postSeq+"&replySeq="+checkNum;
}
// 비로그인시 댓글삭제 체크창 닫기
function closeReplyModal() {
    $("#replyPasswordCheck").css("display", "none");
}
// 댓글삭제 버튼
function deleteReplyBtn(replySeqNum) {
	var loginCheck = $("#checkReplyDeleteLogin"+replySeqNum).val();
    if(loginCheck=="N"){// 비로그인시
    	$("#replySeqCheck").val(replySeqNum);
    	if($("#replyPasswordCheck").css("display")=="none"){
    		$("#replyPasswordCheck").css("display", "block");
            $("#replyDeletePassword").focus();      		
    	}else{
    		$("#replyPasswordCheck").css("display", "none");
    	}
    }else{// 로그인시
    	if (!confirm("댓글을 삭제하시겠습니까?")){
    		return;
    	}
    	var replyPassword = $("#checkReplyDeletePassword"+replySeqNum).val();
    	var uuid = $("#uuid").val();
    	if(uuid != replyPassword){
    		alert("권한불가!");
    		return;
    	}
    	window.location.href = "/deleteReply.do?idx="+gallIdx+"&name="+gallName+"&seq="+postSeq+"&replySeq="+replySeqNum;
    }
}