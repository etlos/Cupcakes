<%-- 
    Document   : customerpage
    Created on : Aug 22, 2017, 2:33:37 PM
    Author     : kasper
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/indcludes/customerheader.php"%>

<table>

    <form name="shop" action="FrontController" method="POST">
        <input type="hidden" name="target" value="shop">
        <div>
            <p>Vælg en bund til din cupcake</p>
            <select class="custom-select" name="bottom" id="bottom">
                <c:forEach var="element" items="${requestScope.bottomList}">
                    <option value="${element.bottomId}">${element.name}</option>
                </c:forEach>
            </select><br><br>
        </div>
        <div>
            <p>Vælg en topping til din cupcake</p><br>
            <select class="custom-select" name="topping" id="topping">
                <c:forEach var="element" items="${requestScope.toppingList}">
                    <option value="${element.toppingId}" >${element.name}</option>
                </c:forEach>
            </select><br><br>
        </div>
        <br>
        <div>
            <p>Angiv et antal af den valgte cupcake</p><br>
            <input type="text" id="count" name="count" value="" placeholder="Antal, fx. 2">
            <br>
            <input type="submit" value="Føj til kurv">
        </div><br>
    </form>

</table>
<c:if test = "${requestScope.error!= null}" >

    <h2>Error ! </h2>
    ${requestScope.error}

</c:if>

<%@include file="/indcludes/footer.inc"%>