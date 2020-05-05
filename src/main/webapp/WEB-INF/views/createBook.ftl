<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add New Book</title>
</head>
<body>
<div align="center">
    <h3>ADD NEW BOOK</h3>
    <form name="book" action="/addBook" method="post">
        <table border="1" cellpadding="8">
        <tr>
            <td>Title</td>
            <td><input title="Title" type="text" name="title"></td>
        </tr>
        <tr>
            <td>Author</td>
            <td><input title="Author" type="text" name="author"></td>
        </tr>
        <tr>
            <td>Type</td>
            <td>
                <select title="Type" name="type">
                    <option>Fiction</option>
                    <option>Education</option>
                    <option>Science Fiction</option>
                </select>
            </td>
        </tr>
        </table>
        <br/>
        <input type="submit" value="Add">
    </form>
</div>
</body>
</html>