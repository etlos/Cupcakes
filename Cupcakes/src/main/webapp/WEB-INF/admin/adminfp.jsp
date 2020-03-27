<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/indcludes/adminheader.inc"%>

<div class="row">
    <div class="col-lg-12 text-center">
        <h1 class="display-1">Hej ${sessionScope.email} </h1>
    </div>
</div>
<div class="row">

</div>
<table>
    <tr><td>
        <form name="addusercredit" action="FrontController" method="POST">
            <input type="hidden" name="target" value="redirect">
            <input type="hidden" name="redirect" value="addcredit">
            <input type="submit" value="Tilføj Kredit">
        </form>
    </td>
        <td>
            <form name="orders" action="FrontController" method="POST">
                <input type="hidden" name="target" value="redirect">
                <input type="hidden" name="redirect" value="orders">
                <input type="submit" value="Se ordre">
            </form>
            <h1>Se ordre</h1>
        </td>
    </tr>
</table>
<c:if test = "${requestScope.error!= null}" >

    <h2>Error ! </h2>
    ${requestScope.error}

</c:if>
<%@include file="/indcludes/footer.inc"%>
