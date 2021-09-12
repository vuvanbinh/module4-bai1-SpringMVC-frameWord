<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: binhhd1996
  Date: 2021/09/10
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Greeting</title>
  </head>
  <body>
  <h1>Hello ${name}, bạn ${age} tuổi phải không? hi</h1>

  <h3>Chuyển đổi tiền tệ.</h3>
  <form action="/page">
    <label for="usd">USD:</label>
    <input type="number" id="usd" name="usd">
    <button type="submit">SubMit</button>
  </form>
  <c:if test="${vnd!=null}">
    <h2>RESULT: ${vnd}</h2>
  </c:if>
<p>----------------------------------------------------</p>
  <h3>Từ điển tiếng anh.</h3>
  <form action="/searchDictionaries">
    <label for="english">Nhập từ cần tìm:</label>
    <input type="text" id="english" name="eng">
    <button type="submit">Search</button>
  </form>
  <c:if test="${vna!=null}">
    <h2>RESULT: ${vna}</h2>
  </c:if>
  </body>
</html>
