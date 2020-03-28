<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/indcludes/customerheader.php"%>

<div class="row">
    <div class="col-lg-12 text-center mt-5">
        <h1 class="display-4" id="tagline">Indkøbskurv</h1>
    </div>
</div>

<table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">Bund</th>
        <th scope="col">Top</th>
        <th scope="col">Antal</th>
        <th scope="col">Samlet pris</th>
        <th scope="col"></th>
    </tr>
    </thead>
    <tbody>
    <c:set var="sumTotal" value="${0}" />
    <c:forEach var="e" items="${sessionScope.basket}">
        <c:set var="sumTotal" value="${sumTotal + e.totalPrice}" />
        <tr>
            <td>${e.bottom}</td>
            <td>${e.topping}</td>
            <td>${e.amount}</td>
            <td>${e.totalPrice} kr</td>

            <td>
                <form action="FrontController" method="post" style="margin-bottom: 0px;">
                    <input type="hidden" name="target" value="deleteOrderline">
                    <input type="hidden" name="uniqueId" value="${e.lineId}">
                    <button type="submit" class="btn btn-link" >Fjern</button>
                </form>
            </td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="3">&nbsp;</td>
        <td>${sumTotal} kr</td>
        <td>&nbsp;</td>
    </tr>
    </tbody>
</table>
${requestScope.besked}
<c:if test="${empty sessionScope.basket}">
    <div class="row">
        <div class="col-lg-12 text-center">
            <h5>Din kurv er tom</h5>
        </div>
    </div>
</c:if>

<%@include file="/indcludes/footer.inc"%>


