var currentUrl = window.location.href;
var queryString = decodeURIComponent(currentUrl.split("?")[1]);
// 갤러리 리스트 받아와서 테이블에 넣기
$(function(){
	var querySplit = queryString.split("&");
	var data = {
	}
	for(let i =0; i<querySplit.length; i++){
		var mapString = querySplit[i].split("=");
		var key = mapString[0];
	    var value = mapString[1];
	    data[key] = value;
	}
	$.ajax({
		'url':'/postList',
		'type' : 'get',
		'data' : data,
		'success' : function(data) {
			for(let i = 0; i < data.length; i++){
				let row = data[i];
				let tr = $('<tr>');
				tr.append('<td><a style="text-decoration: none; color:black" href="javascript:view('+row['seq']+');">'+row['seq']+'</a></td>');
				tr.append('<td><a style="text-decoration: none; color:black" href="javascript:view('+row['seq']+');">'+row['title']+'</a></td>');
				tr.append('<td>'+row['writer']+'</td>');
				tr.append('<td>'+formatDate(row['indate'])+'</td>');
				tr.append('<td><span style="margin-left:13px;">'+row['count']+'</span></td>');
				if($('#bambooSpear').val()!=null){
					tr.append('<td><button type="button" class="btn btn-dark" style="width: 25px; height: 25px; font-size: 12px;margin-left:15px"onclick="deletePostBtn('+row['seq']+');">X</button></td>');
				}
				$('#postList').append(tr);
			}
		}
	});
});
// 시간 포멧
function formatDate(dateString) {
  const date = new Date(dateString);
  const year = date.getFullYear();
  const month = String(date.getMonth() + 1).padStart(2, '0');
  const day = String(date.getDate()).padStart(2, '0');
  const hours = String(date.getHours()).padStart(2, '0');
  const minutes = String(date.getMinutes()).padStart(2, '0');
  return `${year}-${month}-${day} ${hours}:${minutes}`;
}
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
// 글작성 페이지로
function post(){
	window.location.href = "/postPage?"+queryString+"&workType=post";
}
// 게시물 페이지로
function view(seq){
	window.location.href = "/viewPage?"+queryString+"&seq="+seq;
}
// 갤러리 생성 페이지(관리자)
function create(){
	window.location.href = "/createPage";
}
// 페이징 넘어가기
function pagingCheck(pageNum){
	if(selectPageLength!="null"){
		window.location.href = "/gallPage?idx="+gallIdx+"&name="+gallName+"&paging="+pageNum+"&selectPageLength="+selectPageLength;
	}else{
		window.location.href = "/gallPage?idx="+gallIdx+"&name="+gallName+"&paging="+pageNum;
	}
}
// 페이징 갯수조절
function changeLength(){
	if($("#pagingLength").val()==""){
		return;
	}
	if(paging!="null"){
		window.location.href = "/gallPage?idx="+gallIdx+"&name="+gallName+"&paging="+paging+"&selectPageLength="+$("#pagingLength").val();
	}else{
		window.location.href = "/gallPage?idx="+gallIdx+"&name="+gallName+"&paging=1&selectPageLength="+$("#pagingLength").val();
	}
}
// 글 삭제(관리자)
function deletePostBtn(seq){
	if (!confirm("글을 삭제하시겠습니까?")){
       	return;
       }
	window.location.href = "/deletePost?"+queryString+"&seq="+seq+"&writerType=Y";
}