// -완-
// 메인 페이지로
function main() {
    window.location.href = "/";
}
// 갤러리명 실시간 중복체크
function currentCheck() {
    var gallName = {
        gallName: $("#gallNameCheck").val(),
    }
    $.ajax({
        url: "/duplicateCheck",
        type: "GET",
        data: gallName,
        success: function(data) {
            if (data == "0") {
                $("#checkYes").show();
                $("#checkNo").hide();
                $("#checkResult").val("0");
            } else if (data == "1") {
                $("#checkYes").hide();
                $("#checkNo").show();
                $("#checkResult").val("1");
            }
            
            if ($("#gallNameCheck").val().length < 1) {
                $("#checkYes").hide();
                $("#checkNo").hide();
                $("#checkResult").val("");
            }
            
        }
    });
}
// 갤러리 생성 액션
function createGall() {
    if ($("#gallNameCheck").val() === '') {
        alert("갤러리명을 입력하세요");
        $("#gallNameCheck").focus();
        return;
    }
    if ($("#checkResult").val() === '1') {
        alert("중복된 갤러리명입니다.");
        $("#gallNameCheck").focus();
        return;
    }
    if (!confirm("생성하시겠습니까?")) {
        return;
    }
    var gallName = {
        gallName: $("#gallNameCheck").val()
    }
    $.ajax({
        url: "/createGall",
        type: "POST",
        data: gallName,
        success: function() {
            alert("갤러리 생성 성공!");
            history.back();
        }
    });
}
// 이전 페이지로
function goBack() {
    history.back();
}