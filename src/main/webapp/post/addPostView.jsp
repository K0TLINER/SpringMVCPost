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
				alert("5���ھ��� ���ּ���.");
			}
		});		
	});
</script>
</head>
<body>
	<h1>�Խñ� �ۼ�</h1>
	<form method="post" action="/post/addPost">
		<h2>����</h2>
		<input type="text" name="postTitle" placeholder="�ּ� 5���ڴ� ���ּ���." />
		<h2>����</h2>
		<textarea name="postContent" placeholder="�ּ� 5���ڴ� ���ּ���."></textarea>
		<br />
		<button type="button">�ۼ� �Ϸ�</button>
	</form>
</body>
</html>