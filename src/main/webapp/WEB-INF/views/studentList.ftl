<#import "parts/common.ftl" as c>
<@c.page>
<div align="center">
    <h3>Registred Students</h3>
    <br/>
    <a href="/">Home</a>
    <br/><br/>
    <form name="new" action="/students/addStudent" method="get">
        <input type="submit" value="Add New Student">
    </form>
    <br/>
    Total number of the registred students: ${students?size}
    <br/><br/>
    <table border="1" cellpadding="8">
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
</@c.page>