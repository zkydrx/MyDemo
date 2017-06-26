<%--
  Created by IntelliJ IDEA.
  User: ZKY
  Date: 2017-01-11 0011
  Time: 10:40:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<hr/>
<h1>Successful</h1>

username:<%=request.getSession().getAttribute("name")%>
<br/>
password:<%=request.getSession().getAttribute("password")%>
</body>
</html>
