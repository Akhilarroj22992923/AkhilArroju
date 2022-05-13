<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


----------Choose, When, Otherwise Attribute------
<c:set var="Emp1" scope="session" value="${5000*4}"/>
<c:set var="Emp2" scope="session" value="${7000*2}"/> 
<c:set var="Emp3" scope="session" value="${5000*5}"/> 
<c:set var="Emp4" scope="session" value="${2000*5}"/>   
<p>Your Emp1income is : <c:out value="${Emp1}"/></p>  
<p>Your Emp2income is : <c:out value="${Emp2}"/></p> 
<p>Your Emp3income is : <c:out value="${Emp3}"/></p> 
<p>Your Emp4income is : <c:out value="${Emp4}"/></p> 
<c:choose>  
    <c:when test="${Emp1 > 9000 & Emp1 < 13000}">  
       <p>Your Emp1income is : <c:out value="${Emp1+5000}"/></p> 
       Income+Bonus.  
    </c:when>  
    <c:when test="${Emp2 > 13500 & Emp2 < 21000}">  
       <p>Your Emp2income is : <c:out value="${Emp2+7000}"/></p> 
       Income+Bonus.  
    </c:when>  
    <c:when test="${Emp3 > 22000 & Emp3 < 26000}">  
       <p>Your Emp3income is : <c:out value="${Emp3+9000}"/></p> 
       Income+Bonus.
    </c:when> 
    <c:otherwise test="${Emp4 > 28000}">
       <p>Your Emp4income is : <c:out value="${Emp4+10000}"/></p>  
       Income+Bonus. 
    </c:otherwise>  
</c:choose>  

</body>
</html>
