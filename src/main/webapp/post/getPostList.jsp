<%@ page contentType="text/html; charset=euc-kr" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<title>getPostList</title>
<script src="../javascript/jquery-2.1.4.js" type="text/javascript"></script>
<script type="text/javascript"></script>
</head>
<body>
	<h1>�Խñ� ����</h1>
	<c:set var="no" value="0" />
	<c:forEach var="post" items="${ list }">
		<c:set var="no" value="${ no + 1 }" />
		<div>
			<h2>NO: ${ no }</h2>
			<h3>����</h3>&nbsp;<a href="/post/getPost/${ post.postNo }">${ post.postTitle }</a>
		</div>
	</c:forEach> 
	<!-- <form method="post" action="/post/addPost">
		<h2>����</h2>
		<input type="text" name="postTitle" placeholder="�ּ� 5���ڴ� ���ּ���." />
		<h2>����</h2>
		<textarea name="postContent" placeholder="�ּ� 5���ڴ� ���ּ���."></textarea>
		<br />
		<button type="button">�ۼ� �Ϸ�</button>
	</form> -->
</body>
</html>