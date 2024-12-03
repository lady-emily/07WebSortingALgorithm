<html>
<head>
    <title>Class Assignment</title>
</head>
<body>
    <h1>Class Assignment Results</h1>
    <table border="1">
        <tr>
            <th>Student Name</th>
            <th>Assigned Class</th>
        </tr>
        <c:forEach items="${students}" var="student">
            <tr>
                <td>${student.name}</td>
                <td>${student.className}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="main">Back to Main</a>
</body>
</html>
