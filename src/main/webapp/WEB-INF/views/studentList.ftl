<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <title>Students</title>
    <style>
        caption {
            padding-bottom: 20px;
            text-align: left;
            font-style: italic;
            font-size: 18px;
        }

        a {
            text-decoration: none;
        }

    </style>
</head>
<body>
<div align="center">
    <h2>REGISTRED STUDENTS</h2>
    <br/>
    <a href="/">Home</a>
    <br/><br/>
    <form name="new" action="/students/addStudent" method="get">
        <input type="submit" value="Add New Student">
    </form>

    <br>
    <table border="1" cellpadding="8">
        <br/>
        <caption>Total number of registred students: ${students?size}</caption>
        <br/>
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Faculty</th>
            <th>Year</th>
            <th>Debts Info</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <#list students as student>
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.faculty}</td>
                <td>${student.year}</td>
                <td><a href="/studentDebts/${student.id}">See the debts</a></td>
                <td><button><a href="/students/edit/${student.id}">Edit</a></button></td>
                <td><button><a href="/students/delete/${student.id}">Delete</a></button></td>
            </tr>
        </#list>
        </tbody>
    </table>
</div>
</body>
</html>