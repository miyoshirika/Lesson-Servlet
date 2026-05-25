<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

<h2>お気に入り登録</h2>

<form action="favorite-servlet" method="post">
	<p>
	名前：<input type="text" name="name" >
	</p>
	<p>
	URL：<input type="text" name="url" >
	</p>
	<input type="submit" name="追加">
</form>

<h3>登録一覧</h3>

<%
    java.util.List<Beans.Favorite> list =
        (java.util.List<Beans.Favorite>) session.getAttribute("list");
%>

<% if (list != null && !list.isEmpty()) { %>
    <ul>
    <% for (Beans.Favorite f : list) { %>
        <li>
            <a href="<%= f.getUrl() %>" target="_blank">
                <%= f.getName() %>
            </a>
        </li>
    <% } %>
    </ul>
<% } else { %>
    <p></p>
<% } %>


<form action="clear-servlet" method="post">
<input type="submit" name="clear" value="クリア">
</form>

<%@include file="../footer.html" %>