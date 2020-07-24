<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>index</title>

<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";

	pageContext.setAttribute("basePath", basePath);
%>

<base href="<%=basePath%>">
<link type="text/css" rel="stylesheet" href="static/css/style.css">
<script type="text/javascript" src="static/script/jquery-1.7.2.js"></script>
<script type="text/javascript">
	$(function() {
		$("a.deleteClass").click(
				function() {
					return confirm("Are you sure to delete "
							+ $(this).parent().parent().find("td:first").text()
							+ " ?");
				});
	});
</script>

<link type="text/css" rel="stylesheet" href="static/css/style.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">

</head>

<body>
	<div class="container-fluid">

		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="navbar-brand">Welcome to Wouf!</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
				<div class="navbar-nav">
					<a class="nav-item nav-link" href="../index.jsp">Home </a> <a
						class="nav-item nav-link" href="../index.jsp">My dog(s)</a> <a
						class="nav-item nav-link" href="../index.jsp">Log out</a>
				</div>
			</div>
		</nav>

		<div id="main">
			<table>
				<tr>
					<td>Name</td>
					<td>No. chip</td>
					<td>Color</td>
					<td>Age</td>
					<td>Photo</td>
					<td colspan="2">Action</td>
				</tr>

				<c:forEach items="${requestScope.page.items}" var="dog">
					<tr>
						<td>${book.name}</td>
						<td>${book.price}</td>
						<td>${book.author}</td>
						<td>${book.sales}</td>
						<td>${book.stock}</td>
						<td><a
							href="manager/bookServlet?action=getBook&id=${book.id}&pageNo=${requestScope.page.pageNo}">Update</a></td>
						<td><a class="deleteClass"
							href="manager/bookServlet?action=delete&id=${book.id}&pageNo=${requestScope.page.pageNo}">Delete</a></td>
					</tr>
				</c:forEach>

				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
			</table>

		</div>
	</div>
</body>
</html>
