<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
					<a class="nav-item nav-link" href="./index.jsp">Home </a> <a
						class="nav-item nav-link" href="./index.jsp">My dog(s)</a> <a
						class="nav-item nav-link" href="./index.jsp">Log out</a>
				</div>
			</div>
		</nav>

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

			<c:forEach items="${requestScope.chiens}" var="chien">

				<tbody>
					<tr>
						<th scope="row">${chien.idChien}</th>
						<td>${chien.nom}</td>
						<td>${chien.puce}</td>
						<td>${chien.couleur}</td>
						<td>${chien.age}</td>
						<td>${chien.imgPath}</td>
						<td><a
							href="UpdateServlet?idChien=${chien.idChien}">Update</a></td>
						<td><a class="deleteClass"
							href="DeleteServlet?idChien=${chien.idChien}">Delete</a></td>
					</tr>
				</tbody>
			</c:forEach>
			<tbody>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td><a
						href="pages/new_dog.jsp">Add new dog</a></td>
				</tr>

			</tbody>

		</table>





	</div>
</body>
</html>
