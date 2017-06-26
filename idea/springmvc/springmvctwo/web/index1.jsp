<%--
  Created by IntelliJ IDEA.
  User: ZKY
  Date: 2017-01-16 0016
  Time: 10:37:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <title></title>
</head>

<body>
<div style="border: 2px;">
  <form action="/yes/y" >
    输入第一个数：<input type="text" name="num1"/><br/>
    选择运算符：
    <select name="flag">
      <option value="1">+</option>
      <option value="2">-</option>
      <option value="3">*</option>
      <option value="4">/</option>
      <option value="5">^</option>
      <option value="6">√</option>
    </select><br/>
    输入另外一个数：<input type="text" name="num2"/><br/>
    <input type="submit" value="提交"/><br/>
    <%--<% Integer result = (Integer)request.getAttribute("result");%>--%>
    结果为：<input type="text" name="result" value="${result}"/>

  </form>
</div>
</body>



</html>
