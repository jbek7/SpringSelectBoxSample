<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h1>SelectBox Demo</h1>
<form:form method="post" action="addLesson" modelAttribute="lesson">
    <form:select path="course">
        <form:options items="${courses}"  itemValue="id" itemLabel="name"/>
    </form:select>
    <form:errors path="${error}" />
    <input type="submit" name="addLesson" value="Add lesson">
</form:form>

</body>
</html>