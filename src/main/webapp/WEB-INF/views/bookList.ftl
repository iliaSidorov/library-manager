<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <title>Books</title>
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
    <h2>BOOK STORAGE</h2>
    <br/>
    <a href="/">Home</a>
    <br/><br/>
    <form name="new" action="/addBook" method="get">
        <input type="submit" value="Add New Book">
    </form>
    <br>
    <table border="1" cellpadding="8">
        <br/>
        <caption>Total number of books in the library: ${books?size}</caption>
        <br/>
        <thead>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Author</th>
            <th>Type</th>
            <th>Student_id</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <#list books as book>
            <tr>
                <td><a href="/book/${book.id}">${book.id}</a></td>
                <td>${book.title}</td>
                <td><a href="/listBooksByAuthor/${book.author}">${book.author}</a></td>
                <td><a href="/listBooksByType/${book.type}">${book.type}</a></td>
                <td><a href="/studentDebts/${book.student_id}">${book.student_id}</a></td>
                <td><button><a href="/edit/${book.id}">Edit</a></button></td>
                <td><button><a href="/delete/${book.id}">Delete</a></button></td>
            </tr>
        </#list>
        </tbody>
    </table>
</div>
</body>
</html>