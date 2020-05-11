<#import "parts/common.ftl" as c>
<@c.page>
<div align="center">
    <h3>EDIT BOOK</h3>
    <br/>
    <form name="book" action="/editBook" method="post">
        <table border="1" cellpadding="8">
            <tr>
                <td>ID</td>
                <td><input title="ID" type="text" name="id" value="${book.id}"/></td>
            </tr>
            <tr>
                <td>Title</td>
                <td><input title="Title" type="text" name="title" value="${book.title}"/></td>
            </tr>
            <tr>
                <td>Author</td>
                <td><input title="Author" type="text" name="author" value="${book.author}"/></td>
            </tr>
            <tr>
                <td>Type</td>
                <td><input title="Type" type="text" name="type" value="${book.type}"/></td>
            </tr>
            <tr>
                <td>Student_id</td>
                <td><input title="Student_id" type="text" name="student_id" value="${book.student_id}"/></td>
            </tr>
        </table>
        <br/>
        <input type="submit" value="Edit"/>
    </form>
</div>
</@c.page>