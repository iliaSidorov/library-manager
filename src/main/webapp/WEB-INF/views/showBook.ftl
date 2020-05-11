<#import "parts/common.ftl" as c>
<@c.page>
<div align="center">
<h3>Book Info</h3>
<br/>
    <table border="1" cellpadding="8">
        <tr>
            <td>ID</td>
            <td>${book.id}</td>
        </tr>
        <tr>
            <td>Title</td>
            <td>${book.title}</td>
        </tr>
        <tr>
            <td>Author</td>
            <td>${book.author}</td>
        </tr>
        <tr>
            <td>Type</td>
            <td>${book.type}</td>
        </tr>
    </table>
    <br/>
    <button><a style="text-decoration: none" href="/books">Back</a></button>
    </div>
</@c.page>