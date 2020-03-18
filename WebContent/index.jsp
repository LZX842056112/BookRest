<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="book/1">查询图书</a><br>
	<form action="book" method="post">
		<input type="submit" value="添加图书"/>
	</form>
	<form action="book/1" method="post">
		<input name="_method" value="delete"/>
		<input type="submit" value="删除图书"/>
	</form>
	<form action="book/1" method="post">
		<input name="_method" value="put"/>
		<input type="submit" value="修改图书"/>
	</form>
</body>
</html>