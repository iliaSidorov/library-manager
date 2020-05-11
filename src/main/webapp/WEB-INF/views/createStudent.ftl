<#import "parts/common.ftl" as c>
<@c.page>
<div align="center">
    <h3>ADD NEW STUDENT</h3>
    <form name="book" action="/students/addStudent" method="post">
        <table border="1" cellpadding="8">
            <tr>
                <td>Name</td>
                <td><input title="Name" type="text" name="name"></td>
            </tr>
            <tr>
                <td>Faculty</td>
                <td><input title="faculty" type="text" name="faculty"></td>
            </tr>
            <tr>
                <td>Year</td>
                <td><input title="year" type="text" name="year"></td>
            </tr>
        </table>
        <br/>
        <input type="submit" value="Add">
    </form>
</div>
</@c.page>