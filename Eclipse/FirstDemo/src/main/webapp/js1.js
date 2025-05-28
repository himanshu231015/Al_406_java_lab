<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<input type="text" id="t1"/><br><br>
<input type="text" id="t2"/><br><br>
<input type="t" id="t3"/><br><br>

<input type="button" onclick="add1()" value="Add" />
</body>

<script type="text/javascript">
function add1(){

alert("Hey");
var x = parseInt(document.getElementById("t1").value);
var y = parseInt(document.getElementById("t2").value);
document.getElementById("t3").value=(x+y);
}
</script>
</html>