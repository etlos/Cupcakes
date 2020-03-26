<%-- 
    Document   : customerpage
    Created on : Aug 22, 2017, 2:33:37 PM
    Author     : kasper
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/indcludes/customerheader.php"%>

        <form name="cupcakeShop" action="/FrontController" method="post">
            <div>
                <div>
                    <p>Vælg en bund til din cupcake</p><br>
                    <select class="custom-select" name="bottom" id="bottom">
                        <c:forEach var="element" items="${requestScope.bottom}">
                            <option value="${element.id}">${element.name}</option>
      <%--              <option value="1">Chokolade, 5.00,-</option>
                        <option value="2">Vanilje, 5.00,-</option>
                        <option value="3">Muskatnød, 5.00,-</option>
                        <option value="4">Pistacie, 6.00,-</option>
                        <option value="5">Mandel, 7.00,-</option>              --%>
                        </c:forEach>
                    </select>
                </div><br>
                <div>
                    <p>Vælg en topping til din cupcake</p><br>
                    <select class="custom-select" name="topping" id="topping">
                        <c:forEach var="element" items="${requestScope.topping}">
                            <option value="${element.id}">${element.name}</option>
                <%--    <option value="1">Chokolade, 5.00,-</option>
                        <option value="2">Blåbær, 5.00,-</option>
                        <option value="3">Hindbær, 5.00,-</option>
                        <option value="4">Crispy, 6.00,-</option>
                        <option value="5">Jordbær, 6.00,-</option>
                        <option value="6">Rum Raisin, 7.00,-</option>
                        <option value="7">Appelsin, 8.00,-</option>
                        <option value="8">Citron, 8.00,-</option>
                        <option value="9">Blue cheese, 9.00,-</option>             --%>
                        </c:forEach>
                    </select>
                </div><br>
                <div>
                    <p>Angiv et antal af den valgte cupcake</p><br>
                    <input type="text" id="count" name="count" placeholder="Antal, fx. 2"><br>
                    <input class="button" type="submit" value="submit">
                </div><br>
            </div>
            </body>
            </html>
        </form>

<%@include file="/indcludes/footer.inc"%>
