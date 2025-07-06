<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Liste des livres</title>
</head>
<body>
    <div class="container">
        <div class="nav">
            <ul>
                <li><a href="${pageContext.request.contextPath}/">Dashbord</a></li>
                <li><a href="${pageContext.request.contextPath}/livre/listes">Livre</a></li>
                <li><a href="${pageContext.request.contextPath}/abonnement/form">Abonnement</a></li>
                <li><a href="#${pageContext.request.contextPath}">Inscription</a></li>
            </ul>
        </div>
        <div class="liste-livre">
            <h2>Liste des livres</h2>

            <table border="1">
                <thead>
                    <tr>
                        <th>Titre</th>
                        <th>Auteur</th>
                        <th>Langue</th>
                        <th>Annee</th>
                        <th>Accessibilite</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="livre" items="${livres}">
                        <tr>
                            <td>${livre.titre}</td>
                            <td>${livre.auteur}</td>
                            <td>${livre.langue}</td>
                            <td>${livre.annee_publication}</td>
                            <td>
                                <c:choose>
                                    <c:when test="${livre.accessibilite == 1}">Tous</c:when>
                                    <c:when test="${livre.accessibilite == 2}">Professeurs</c:when>
                                    <c:otherwise>Inconnu</c:otherwise>
                                </c:choose>
                            </td>
                            <td>
                                <a href="${pageContext.request.contextPath}/livre/preter?id=${livre.id}">Preter</a> |
                                <a href="${pageContext.request.contextPath}/livre/reserver?id=${livre.id}">Reserver</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>
