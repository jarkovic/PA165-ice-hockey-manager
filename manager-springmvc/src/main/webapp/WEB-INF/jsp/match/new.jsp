<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" trimDirectiveWhitespaces="false" session="false" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="my" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<head>
    <meta charset="utf-8">
    <title>New match</title>
</head>

<my:pagetemplate>
<jsp:attribute name="body">
    <form:form id="matchCreate" action="${pageContext.request.contextPath}/match/new" modelAttribute="matchCreate" method="POST">
<%--            <c:forEach items="${teams}" var="team">--%>
<%--                ${team.name}--%>
<%--            </c:forEach>--%>

        <div class="form-group">
            <form:label path="homeTeam">Home team:</form:label>
            <form:select path="homeTeam">
                <c:forEach items="${teams}" var="team">
                    <form:option value="${team.id}" label="${team.name}"/>
                </c:forEach>
            </form:select>
            <form:errors path="homeTeam" cssClass="help-block"/>
        </div>

        <div class="form-group">
            <form:label path="visitingTeam">Visiting team:</form:label>
            <form:select path="visitingTeam">
                <c:forEach items="${teams}" var="team">
                    <form:option value="${team.id}" label="${team.name}"/>
                </c:forEach>
            </form:select>
            <form:errors path="visitingTeam" cssClass="help-block"/>
        </div>

        <div class="form-group">
            <form:label path="homeTeamScore">Home team score:</form:label>
            <form:input type="number" min="0" path="homeTeamScore"/>
            <form:errors path="homeTeamScore" cssClass="help-block"/>
        </div>

        <div class="form-group">
            <form:label path="visitingTeamScore">Visiting team score:</form:label>
            <form:input type="number" min="0" path="visitingTeamScore"/>
            <form:errors path="visitingTeamScore" cssClass="help-block"/>
        </div>

        <div class="form-group">
            <form:label path="dateTimeDto">Date and time:</form:label>
            <form:input type="datetime-local" path="dateTimeDto"/>
            <form:errors path="dateTimeDto" cssClass="help-block"/>
        </div>

        <button class="btn btn-primary" type="submit">Create</button>
    </form:form>
</jsp:attribute>
</my:pagetemplate>
