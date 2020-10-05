<%@ include file="common/header.jspf" %>
<html xmlns="http://www.w3.org/1999/xhtml"
	  xmlns:th="http://www.thymeleaf.org">
<head>
	<meta charset="utf-8"/>
	<title>Registration Report</title>
</head>
	<body>
	<div class="container" align="Center">
		<table class="table table-striped" style="border: double black">
			<caption style="color: blue;font-size: large;" >Registration Report:</caption>
			<thead style="color: cadetblue" >
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Address 1</th>
					<th>Address 1</th>
					<th>City</th>
					<th>State</th>
					<th>Zip</th>
					<th>Country</th>
					<th>Registration Date</th>
				</tr>
			</thead>
			<tbody style="color: cornflowerblue;">
				<c:forEach items="${userReport}" var="user">
					<tr>
						<td>${user.first_name}</td>
						<td>${user.last_name}</td>
						<td>${user.address1}</td>
						<td>${user.address2}</td>
						<td>${user.city}</td>
						<td>${user.state}</td>
						<td>${user.zip}</td>
						<td>${user.country}</td>
						<td>${user.reg_date}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<table>
			<tr>
				<td>
					<div>
						<a class="button" href="/home">New User? Register here</a>
					</div>
				</td>
			</tr>
		</table>

	</div>
	</body>
<%@ include file="common/footer.jspf" %>