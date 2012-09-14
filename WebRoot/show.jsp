<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'show.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <table border=1>
    <tr>
    <td>商品ID</td>
    <td>商品名称</td>
    <td>供应商ID</td>
    <td>计量单位</td>
   	</tr>
    <c:forEach items="${goodsList}" var="g">
	    <tr>
	    <td>${g.goodsId}</td>
	    <td>${g.goodsName }</td>
	    <td>${g.supplierId }</td>
	    <td>${g.unit }</td>
	    </tr>
    </c:forEach>
    <tr>
    <td><a href="">首页</a></td>
    <!-- <% //if(pageBean.currentPage == 1) {%>
    <td>上一页</td>
    <%//} else {%>
    <td><a href="output.action?pageBean.currentPage=${pageBean.currentPage-1}">上一页</a></td>
    <%//} %>
     -->
    <td><a href="">上一页</a></td> 
    <td><a href="">下一页</a></td>
    <td><a href="">末页</a></td>
    </tr>
    </table>
  </body>
</html>
