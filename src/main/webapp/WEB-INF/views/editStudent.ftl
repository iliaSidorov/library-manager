<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Edit</title>
</head>
<body>
<div align="center">
    <h3>EDIT STUDENT</h3>
    <br/>
    <form name="book" action="/students/editStudent" method="post">
        <table border="1" cellpadding="8">
            <tr>
                <td>ID</td>
                <td><input title="ID" type="text" name="id" value="${student.id}"/></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input title="Name" type="text" name="name" value="${student.name}"/></td>
            </tr>
            <tr>
                <td>Faculty</td>
                <td><input title="Faculty" type="text" name="faculty" value="${student.faculty}"/></td>
            </tr>
            <tr>
                <td>Year</td>
                <td><input title="Year" type="text" name="year" value="${student.year}"/></td>
            </tr>
        </table>
        <br/>
        <input type="submit" value="Edit"/>
    </form>

</div>

</body>
</html>