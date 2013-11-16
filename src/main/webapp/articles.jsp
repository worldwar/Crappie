<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
    <head>
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    </head>
    <body>
        <c:forEach items="${articles}" var="article" >
            <c:out value="${article.title}" /><br/>
            <c:out value="${article.time}" /> <br/>
            <c:out value="${article.content}" /><br/>
        </c:forEach>
    </body>
</html>