<%--
  Created by IntelliJ IDEA.
  User: ZKY
  Date: 2017-01-18 0018
  Time: 10:35:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath= request.getScheme()+"://request.getServerName()"+":"+
          request.getServerPort()+path+"/";

%>
<html>
<head>
  <base href="<%=basePath%>">
    <title></title>
</head>
<body>
<form action="index2.jsp" method="get">
  输入第一个数：<br/>
  <input type="text" name="num1" /><br/>
  请选择运算符：<br/>
  <input type="radio" name="flag" value="1"><font size="5"><b>+</b></font>
  <input type="radio" name="flag" value="2"><font size="5"><b>-</b></font>
  <input type="radio" name="flag" value="3"><font size="5"><b>*</b></font>
  <input type="radio" name="flag" value="4"><font size="5"><b>/</b></font>
  <br/>
  请输入第二个数：<br/>
  <input type="text" name="num2" ><br/>
  <input type="submit" value="计算"/><br/>
</form>
<jsp:useBean id="coc" class="com.tyd.test.Three" scope="page"></jsp:useBean>
<jsp:setProperty name="coc" property="*"></jsp:setProperty>
<%
  int result = coc.computer();
%>
输出的结果为：<%--<input type="text" value="${result}"/><br/>--%>
<%= result%>

</body>
</html>
