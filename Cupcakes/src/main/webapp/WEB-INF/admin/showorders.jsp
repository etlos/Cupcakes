
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/indcludes/adminheader.inc"%>

<div class="bod">


    <h1>Vis Alle Ordre</h1>

    <table >
        <tr>
            <th>Ordre ID</th>
            <th>Tidspunk</th>
            <th>Email</th>
            <th>Top</th>
            <th>Bund</th>
            <th>Antal</th>
            <th>Total pris</th>
        </tr>
        <c:forEach var="ordre" items="${requestScope.ordreListe}">
            <tr>

                <td>${Order.orderId}</td>
                <td>${Order.orderTime}</td>
                <td>${Order.userId}</td>
                <td>${Order.toppingId}</td>
                <td>${Order.bottomId}</td>
                <td>${Order.quantity}</td>
                <td> 1 </td>
                <td>${Order.sum}</td>



            </tr>

        </c:forEach>
    </table>

</div>

<c:if test = "${requestScope.error!= null}" >

    <h2>Error ! </h2>
    ${requestScope.error}

</c:if>

<%@include file="/indcludes/footer.inc"%>
