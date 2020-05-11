<#import "parts/common.ftl" as c>
<@c.page>
<div align="center">
    <br/>
    <a href="/">Home</a>
    <br/><br/>
    <a href="/books">Book Storage</a>
    <br/><br/>
    <table border="1" cellpadding="8">
        <thead>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Author</th>
            <th>Type</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <#list books as book>
            <tr>
                <td><a href="/book/${book.id}">${book.id}</a></td>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>${book.type}</td>
                <td><button><a href="/edit/${book.id}">Edit</a></button></td>
                <td><button><a href="/delete/${book.id}">Delete</a></button></td>
            </tr>
        </#list>
        </tbody>
    </table>
</div>
</@c.page>