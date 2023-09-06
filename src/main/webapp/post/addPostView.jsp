<%@ page contentType="text/html; charset=euc-kr" %>
<!DOCTYPE html>
<html>
<head>
<title>addPostView</title>
<script src="../javascript/jquery-2.1.4.js" type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(() => {
		$("button").click(function() {
			var postTitle = $("input").val().trim();
			var postContent = $("textarea").val().trim();
			if(postTitle.length >= 5 && postContent.length >= 5) {
				$("form").submit();				
			} else {
				alert("5글자씩은 쳐주세요.");
			}
		});		
	});
</script>
</head>
<body>
	<h1>게시글 작성</h1>
	<form method="post" action="/post/addPost">
		<h2>제목</h2>
		<input type="text" name="postTitle" placeholder="최소 5글자는 쳐주세요." />
		<h2>내용</h2>
		<textarea name="postContent" placeholder="최소 5글자는 쳐주세요."></textarea>
		<br />
		<button type="button">작성 완료</button>
	</form>
</body>
</html>