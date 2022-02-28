<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <h1>Employyees Table </h1>
    <br>
    <br>

<table>

    <tr>

        <th>Id</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Operations </th>
    </tr>

    <c:forEach var="item" items="${allEmployees }">
        <c:url var = "updateButton" value="updateEmployee">
            <c:param name = "empId" value = "${item.id}"/>


        </c:url>

        <c:url var = "deleteButton" value="deleteEmployee">
            <c:param name = "empId" value = "${item.id}"/>


        </c:url>
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>${item.surname}</td>
            <td>${item.department}</td>
            <td>${item.salary}</td>
            <td>
                <input type="button" value="Update" onclick="window.location.href='${updateButton}'">
            </td>

            <td>
                <input type="button" value="Delete" onclick="window.location.href='${deleteButton}'">
            </td>
        </tr>
    </c:forEach>


</table>

    <br>
    <input type="button" value="Add" onclick="window.location.href = 'addEmployee'"/>





</body>
</html>