<%@page import="com.dao.UserDao"%>
<jsp:useBean id="u" class="com.bean.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
int i=UserDao.checkUser(u.getUserName(),u.getPassword());
if(i>0){
response.sendRedirect("adduser-success.jsp");
}else{
response.sendRedirect("adduser-error.jsp");
}
%>