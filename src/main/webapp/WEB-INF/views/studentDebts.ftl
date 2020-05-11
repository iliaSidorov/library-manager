<#import "parts/common.ftl" as c>
<@c.page>
<div align="center">
    <#if books?size !=0>
        <br/>
        <h3>The debts of the student:</h3>
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
    <#else>
    <br/><br/>
    The student has no debts
    </#if>
    <br/><br/><br/>
    <a href="/">Home</a>
    <br/><br/>
    <a href="/books">Book Storage</a>
    <br/><br/>
    <a href="/students">Registred Students</a>
</div>
</@c.page>