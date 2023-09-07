var currentUrl = window.location.href;
// 갤러리 리스트 받아와서 테이블에 넣기
$(function(){
	$.ajax({
		'url':'/gallList',
		'type' : 'get',
		'success' : function(data) {
			for(let i = 0; i < data.length; i++){
				let row = data[i];
				let tr = $('<tr>');
				tr.append('<td style="text-align: center;"><a style="text-decoration: none;" href="javascript:gall('+row['idx']+');">'+row['gallName']+'</a></td>');
				tr.append('<input type="hidden" id="gallName_'+row['idx']+'" name="gallName_'+row['idx']+'" value="'+row['gallName']+'">');
				$('#gallList').append(tr);
			}
		}
	});
});
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
// 메인페이지로
function main(){
	window.location.href = "/";
}
// 회원가입or정보수정 페이지로
function insert(){
	window.location.href = "/insertPage";
}
// 갤러리 페이지로
function gall(idx){
	var name = $("#gallName_"+idx).val();
	window.location.href = "/gallPage?idx="+idx+"&name="+name;
}
// 갤러리 생성 페이지로(관리자)
function create(){
	window.location.href = "/createPage";
}