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
  <a href="/yes/haha?a=234567">g</a>
  <body>
    <div align="center">
      <h1>My Computer</h1>
      <font size="4">请输入第一个数：</font><br/><br>
      <input type="text" id="num1" style="width: 150px;"/><br/>
      <font size="4">请输入第二个数:</font><br/>
      <input type="text" id="num2" style="width: 150px;"><br/>
      <font size="4">请选择运算方式:</font><br/>
      <table>
        <tr>
          <td><input type="button" value="+" class="aniu" onclick="jia()"/></td>
          <td><input type="button" value="-" class="aniu" onclick="jian()"/></td>
          <td><input type="button" value="*" class="aniu" onclick="cheng()"/></td>
          <td><input type="button" value="/" class="aniu" onclick="chu()"/></td>
        </tr>
      </table>
      <font size="4">计算结果为:</font><br/>
      <input type="text" id="result" style="width: 150px;"/>
    </div>

  </body>
<script type="text/javascript">
  function jia()
  {
    var n1 = document.getElementById("num1");
    var n2 = document.getElementById("num2");
    var nv1 = n1.value;
    var nv2 = n2.value;
    var rv = parseInt(nv1) + parseInt(nv2);
    var result = document.getElementById("result");
    result.value = rv;
  }

  function jian()
  {
    var n1= document.getElementById("num1");
    var n2 = document.getElementById("num2");
    var nv1 = n1.value;
    var nv2 =n2.value;
    var rv = parseInt(nv1)- parseInt(nv2);
    var result = document.getElementById("result");
    result.value= rv;
  }

  function cheng()
  {
    var n1 =document.getElementById("num1");
    var n2 = document.getElementById("num2");
    var nv1= n1.value;
    var nv2 = n2.value;
    var rv = parseInt(nv1)*parseInt(nv2);
    var result = document.getElementById("result");
    result.value =rv;
  }

  function chu()
  {
    var n1 = document.getElementById("num1");
    var n2 = document.getElementById("num2");
    var nv1 = n1.value;
    var nv2 = n2.value;
    var rv = parseInt(nv1)/parseInt(nv2);
    var result = document.getElementById("result");
    result.value = rv;
  }
</script>

</html>
