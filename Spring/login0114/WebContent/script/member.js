function loginCheck(){
	if(document.frm.userid.value.length==0){
		alert("아이디를 입력하세요");
		frm.userid.focus();
		return false;
	}
	if(document.frm.pwd.value==""){
		alert("비밀번호를 입력하세요");
		frm.pwd.focus();
		return false;
	}
	return true;
}
 
function idCheck(){
	if(document.frm.userid.value==""){
		alert('아이디를 입력하세요');
		document.frm.userid.focus();
		return;
	}
	var url="idCheck.do?userid="+document.frm.userid.value;
	window.open(url,"_blank_1","toolbar=no, menubar=no, scroolbars=yes, resizable=yes, width=450, height=300");

}

function idok(){
	opener.frm.userid.value=document.frm.userid.value;
	opener.frm.reid.value=document.frm.userid.value;
	self.close();
}

function joinCheck(){
	if(document.frm.name.value.length==0){
		alert("이름을 입력하세요");
		frm.name.focus();
		return false;
	}
	if(document.frm.userid.value.length==0){
		alert("아이디를 입력하세요");
		frm.userid.focus();
		return false;
	}
	if(document.frm.userid.value.length<4){
		alert("아이디가 너무 짧습니다(4글자 이상)");
		frm.userid.focus();
		return false;
	}
	if(document.frm.pwd.value==""){
		alert("비밀번호를 입력하세요");
		frm.pwd.focus();
		return false;
	}
	if(document.frm.pwd.value!=document.frm.pwd.pwd_check.value){
		alert("비밀번호 확인이 틀렸습니다");
		frm.pwd.focus();
		return false;
	}
	if(document.frm.reid.value.length==0){
		alert("아이디 중복 검사를 해주세요");
		frm.userid.focus();
		return false;
	}
	return true;
}