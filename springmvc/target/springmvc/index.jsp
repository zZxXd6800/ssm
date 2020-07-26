<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>SpringMVC</title>
    </head>
    <body>
        <a href="${pageContext.request.contextPath}/dept">dept</a><br/>
        <a href="${pageContext.request.contextPath}/depts">depts</a><br/>
        <a href="${pageContext.request.contextPath}/emp">emp</a><br/>
        <a href="${pageContext.request.contextPath}/emps">emps</a><br/>
        <br>
        <a href="${pageContext.request.contextPath}/test">GET</a><br/>
        <form action="${pageContext.request.contextPath}/test" method="post">
            <input type="submit" value="POST">
        </form><br/>
        <a href="${pageContext.request.contextPath}/abc/anta/a/b/c/testAnt">Ant</a><br/>
        <a href="${pageContext.request.contextPath}/testRest/1001/admin">PathVariable</a><br>
        <br>
        <a href="${pageContext.request.contextPath}/rest/testRest/1001">get</a><br/>
        <form action="${pageContext.request.contextPath}/rest/testRest" method="post">
            <input type="submit" value="post"/>
        </form><br/>
        <form action="${pageContext.request.contextPath}/rest/testRest" method="post">
            <input type="hidden" name="_method" value="put"/>
            <input type="submit" value="put"/>
        </form><br/>
        <form action="${pageContext.request.contextPath}/rest/testRest/1001" method="post">
            <input type="hidden" name="_method" value="delete"/>
            <input type="submit" value="delete"/>
        </form>
        <br>
        <form action="${pageContext.request.contextPath}/param" method="post">
            username:<input type="text" name="username"/><br/>
            password:<input type="text" name="password"/><br/>
            address:<input type="text" name="address"/><br/>
            <input type="submit" value="param">
        </form><br/>
        <a href="${pageContext.request.contextPath}/header">header</a><br/>
        <a href="${pageContext.request.contextPath}/cookie">cookie</a><br/>
        <br/>
        <form action="${pageContext.request.contextPath}/pojo" method="post">
            id:<input type="text" name="id"/><br/>
            name:<input type="text" name="name"/><br/>
            province:<input type="text" name="address.province"/><br/>
            city:<input type="text" name="address.city"/><br/>
            <input type="submit" value="pojo">
        </form>
        <br/>
        <form action="${pageContext.request.contextPath}/servlet" method="post">
            id:<input type="text" name="id"/><br/>
            name:<input type="text" name="name"/><br/>
            province:<input type="text" name="address.province"/><br/>
            city:<input type="text" name="address.city"/><br/>
            <input type="submit" value="servlet">
        </form>
        <br/>
        <a href="${pageContext.request.contextPath}/attribute">attribute</a><br/>
        <br>
    </body>
</html>