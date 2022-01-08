<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

  
</head>
<body>
<form>
    <div>
        <label for="input_file">파일을 추가해주세요.</label>
        <input type="file" id="input_file">
    </div>
    <div>
        <button onclick="test(event)">summit</button>
    </div>
    <div></div>
</form>

</body>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.js"></script>
<script>
$(function(){
    function test(event) {
        event.preventDefault(); //submit 할때 새로고침 되는것을 방지
        let fileObject = document.getElementById("input_file");
        let fileName = fileObject.files[0];

        let fr = new FileReader();
        fr.readAsText(fileName, "utf-8");

        fr.onload = () => {
            parseText(fr.result);
        }
    }

    function parseText(text) {
        console.log(text)
        // 여기서 파일 가공하면됨
    }
	
});
</script>
</html>
