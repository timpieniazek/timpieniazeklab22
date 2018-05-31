<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Java Café</title>

<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">


</head>
<body class="bg-info">

	<div class="container-fluid text-center text-white">
		<h1 class="display-1 mt-5">Welcome to Java Café!</h1>
		<a href="register" class="text-white">Sign up!</a>
	</div>


	<div class="container text-center text-white">
		<p class="lead mt-3">Menu Items Available!
		</h1>
		<table class="table" border="1">



			<thead>
				<th>Item</th>
				<th>Description</th>
				<th>Price</th>
			</thead>
			<tbody>
				<c:forEach var="item" items="${items}">
					<tr>
						<td>${item.itemName}</td>
						<td>${item.description}</td>
						<td id="price">$${item.price}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div class="container ">
		<div class="row">
			<c:forEach var="item" items="${items}">
				<div class="col">
					<p>${item.itemName}</p>
					${item.description}
					<p>
				</p>
					$${item.price}
					<p id="price">
					</p>
					</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>