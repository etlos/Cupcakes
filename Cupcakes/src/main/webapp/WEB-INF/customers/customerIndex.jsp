<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/indcludes/customerheader.php"%>



<div class="row">
    <div class="col-lg-12 text-center">
        <h1 class="display-1">Velkommen</h1>
    </div>
</div>
<div class="row">
    <div class="col-lg-12 text-center">
        <h1 class="display-4" id="tagline">Til Vores Shop</h1>
    </div>
</div>

<table>
    <tr><td>
        <h1>Login</h1>

            <form name="login" action="FrontController" method="POST">
                <input type="hidden" name="target" value="login">
                Email:<br>
                <input type="text" name="email" value="" placeholder="givemecake@frosting.dk">
                <br>
                Adganskode:<br>
                <input type="password" name="password" value="" placeholder="********">
                <br>
                <input type="submit" value="Submit">
            </form>
        </td>
        <td>
            <h1>Opret ny bruger</h1>

            <form name="register" action="FrontController" method="POST">
                <input type="hidden" name="target" value="register">
                Email:<br>
                <input type="text" name="email" value="someone@nowhere.com">
                <br>
                Adgangskode:<br>
                <input type="password" name="password1" value="sesam">
                <br>
                Gentag adgangskode:<br>
                <input type="password" name="password2" value="sesam">
                <br>
                <input type="submit" value="Submit">
            </form>
        </td>
    </tr>
</table>


<%--        Bare lige se I har en ide om hvad vi forslå I ikke gør ! det hedder scpript lets --%>
<%--        <% String error = (String) request.getAttribute( "error");--%>
<%--           if ( error != null) { --%>
<%--               out.println("<H2>Error!!</h2>");--%>
<%--               out.println(error);--%>
<%--           }--%>
<%--        %>--%>

<c:if test = "${requestScope.error!= null}" >

    <h2>Error ! </h2>
    ${requestScope.error}

</c:if>

<%@include file="/indcludes/footer.inc"%>

