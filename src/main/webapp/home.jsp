<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <head>
    </head>
    <body>
        <c:forEach items="${authors}" var="author" >
            <c:out value="${author.name}" />
        </c:forEach>
    </body>
</html>