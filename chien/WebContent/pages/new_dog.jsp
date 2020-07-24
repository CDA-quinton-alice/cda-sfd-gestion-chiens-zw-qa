<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";

	pageContext.setAttribute("basePath", basePath);
%>

<base href="<%=basePath%>">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
</head>
<body>
	<div class="container-fluid">

		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="navbar-brand">Edit my dog</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
				<div class="navbar-nav">
					<a class="nav-item nav-link" href="./index.jsp">Home </a> <a
						class="nav-item nav-link" href="./dog.jsp">My dog(s)</a> <a
						class="nav-item nav-link" href="./index.jsp">Log out</a>
				</div>
			</div>
		</nav>
		<form action="AddServlet" method="post">
			<table class="table">
				<thead>
					<tr>
						<th scope="col">#</th>
						<th scope="col">Name</th>
						<th scope="col">No. Chip</th>
						<th scope="col">Color</th>
						<th scope="col">Age</th>
						<th scope="col">Photo</th>
						<th scope="col" colspan="2">Action</th>
					</tr>
				</thead>

				<tbody>
					<tr>
						<th scope="row">${ch.idChien}</th>
						<td><input name="nom" type="text" value="${ch.nom}" /></td>
						<td><input name="puce" type="text" value="${ch.puce}" /></td>
						<td><input name="couleur" type="text" value="${ch.couleur}" /></td>
						<td><input name="age" type="text" value="${ch.age}" /></td>
						<td><input name="imgPath" type="text" value="${ch.imgPath}" /></td>
						<td><input type="submit" value="Submit" /></td>
					</tr>
				</tbody>

			</table>
		</form>
	</div>
</body>
</html>