
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/indcludes/adminheader.inc"%>



<table>


        <form name="addcredit" action="FrontController" method="POST">
            <input type="hidden" name="target" value="addcredit">
            Indtast kunde ID:<br>
            <input type="text" name="id" value="" placeholder="givemecake@frosting.dk">
            <br>
            Indtast beløb:<br>
            <input type="password" name="amount" value="" placeholder="********">
            <br>
            <input type="submit" value="Submit">
        </form>

</table>

<c:if test = "${requestScope.error!= null}" >

    <h2>Error ! </h2>
    ${requestScope.error}

</c:if>

<%@include file="/indcludes/footer.inc"%>
