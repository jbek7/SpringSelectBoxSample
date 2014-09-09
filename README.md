SpringSelectBoxSample
=====================

`<form:form method="post" action="addLesson" modelAttribute="lesson">
   <form:select path="course">
     <form:options items="${courses}"/>
   </form:select>
   <input type="submit" name="addLesson" value="Add lesson">
</form:form>`

By default, once this form is submitted - it only posts selected item as a string not full-fledged Course object.

In this sample demo, a full-fledged object can be converted by using `Formatter<T>` 

To make it work, we need to implement Formatters to convert our course and data centers back and forth to IDs. Regarding Formatters, I’ll let you read about them in the <a href="http://docs.spring.io/spring/docs/current/spring-framework-reference/html/validation.html#format">Spring Reference Documentation: 7.6 Spring Field Formatting</a> 

This repository is created from my answer in StackOverflow - 

<a href ="http://stackoverflow.com/questions/25731951/spring-mvc-select-form-get-object-from-the-list-used-in-form-options-instead-o/25733967#25733967">Spring-MVC: Get full-fledged object instead of string when using 'select-options'
</a>
