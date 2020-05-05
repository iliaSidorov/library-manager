<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<div align="center">
    <br/>
    <a href="/">Home</a>
    <br/><br/>
    <a href="/books">Book Storage</a>
    <br/><br/>
    <a href="/students">Registred Students</a>
    <br/><br/><br/>
    <h2>The debts of the student</h2>
    <br/><br/>
    <table border="1" cellpadding="8">
        <thead>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Author</th>
            <th>Type</th>
        </tr>
        </thead>
        <tbody>
        <#list books as book>
        <tr>
            <td><a href="/book/${book.id}">${book.id}</a></td>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>${book.type}</td>
        </tr>
        </#list>
        </tbody>
    </table>
</div>

</body>

</body>
</html>