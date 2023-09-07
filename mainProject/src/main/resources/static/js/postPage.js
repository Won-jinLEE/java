var currentUrl = window.location.href;
// 로그인 액션
function login(){
	if($("#userId").val() ==""){
        alert("아이디를 입력하세요");
        $("#userId").focus();
        return false;
    }
    if($("#password").val() ==""){
        alert("비밀번호를 입력하세요");
        $("#password").focus();
        return false;
    }
    $("#url").val(currentUrl)
    return true;
}
// 로그아웃 액션
function logout(){
	$("#url").val(currentUrl)
	return true;
}
// 이미지 추가 액션
$(document).ready(function () {
    $('#fileInput').change(function () {
        const fileInput = this;
        const contents = $('#contents');
        const file = fileInput.files[0];
        if (file) {
            const reader = new FileReader();
            reader.onload = function (e) {
                // 이미지를 추가하는 <p> 태그를 생성하고 내용을 설정합니다.
                const imageBox = $('<p name="img">');
                const imageTag = $('<img>');
                imageTag.attr('src', e.target.result);
                imageTag.css('max-width', '100%'); // 이미지의 최대 너비를 설정합니다.
                imageBox.append(imageTag);
                // 텍스트 컨텐츠의 끝에 이미지 태그를 추가합니다.
                contents.append(imageBox);
                // 파일 업로드 필드 초기화
                $(fileInput).val('');
            };
            reader.readAsDataURL(file);
        }
    });
});
// 메인페이지로
function main(){
	window.location.href = "/";
}
// 회원가입 페이지로
function insert(){
	window.location.href = "/insertPage";
}
// 이전 페이지로
function cancle(){
	window.location.href = "/gallPage.do?idx="+gallIdx+"&name="+gallName;
}
// 갤러리 생성페이지로(관리지만 가능)
function create(){
	window.location.href = "/createPage";
}
// 게시물 추가시 정보 체크
function postCheck(){
	if($("#postNickName").val()==''){
        alert("아이디를 입력하세요");
        $("#postNickName").focus();
    	return false;
    }
    if($("#postPassword").val()==''){
        alert("비밀번호를 입력하세요");
        $("#postPassword").focus();
    	return false;
    }
    if( $("#postPassword").val().length<4) {
		alert("비밀번호를  4자 이상 입력해주세요");
		$("#postPassword").focus();
		return false;
	}
    if($("#title").val()==''){
        alert("제목을 입력하세요");
        $("#title").focus();
    	return false;
    }
    if( $("#title").val().length<2) {
		alert("제목을 2자 이상 입력해주세요");
		$("#title").focus();
		return false;
	}
    if($("#contents").val()==''){
        alert("글 내용을 입력하세요");
        $("#contents").focus();
    	return false;
    }
    if (!confirm("글을 등록하시겠습니까?")){
		return false;
	}
    $("#throwGallIdx").val(gallIdx);
    $("#throwGallName").val(gallName);
    $("#throwPostNickName").val($("#postNickName").val());
    $("#throwPostPassword").val($("#postPassword").val());
    $("#throwLoginCheck").val($("#loginCheck").val());
    $("#throwPostTitle").val($("#title").val());
    $("#throwPostContents").val($("#contents").val());
    return true;
}
// 게시물 수정
function modifyCheck(){
    if($("#title").val()==''){
        alert("제목을 입력하세요");
        $("#title").focus();
        return false;
    }
    if( $("#title").val().length<2) {
		alert("제목을 2자 이상 입력해주세요");
		$("#title").focus();
		return false;
	}
    if($("#contents").val()==''){
        alert("글 내용을 입력하세요");
        $("#contents").focus();
        return false;
    }
    if (!confirm("글을 수정하시겠습니까?")){
		return false;
	}
    $("#throwGallIdx").val(gallIdx);
    $("#throwGallName").val(gallName);
    $("#throwPostTitle").val($("#title").val());
    $("#throwPostContents").val($("#contents").val());
    return true;
}