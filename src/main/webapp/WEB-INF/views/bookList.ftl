<#import "parts/common.ftl" as c>
<@c.page>
<div align="center">
    <h3>Book Storage</h3>
    <br/>
    <a href="/">Home</a>
    <br/><br/>
    <form name="new" action="/addBook" method="get">
        <input type="submit" value="Add New Book">
    </form>
    <br>
    Total number of books in the library: ${books?size}
    <br/><br/>
    <table border="1" cellpadding="8">
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
</@c.page>