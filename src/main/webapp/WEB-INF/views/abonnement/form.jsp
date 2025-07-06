<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Abonnement</title>
</head>
<body>
    <div class="container">
        <div class="nav">
            <ul>
                <li><a href="${pageContext.request.contextPath}/">Dashboard</a></li>
                <li><a href="${pageContext.request.contextPath}/livre/listes">Livre</a></li>
                <li><a href="${pageContext.request.contextPath}/abonnement/form">Abonnement</a></li>
                <li><a href="#">Inscription</a></li>
            </ul>
        </div>
        <div class="formulaire">
            <h2>Creer un abonnement</h2>

            <c:if test="${not empty message}">
                <p>${message}</p>
            </c:if>

            <form action="${pageContext.request.contextPath}/abonnement/enregistrer" method="post">
                <div>
                    <label>Adherant :</label>
                    <select name="adherantId" required>
                        <c:forEach var="a" items="${adherants}">
                            <option value="${a.id}">${a.nom} ${a.prenom}</option>
                        </c:forEach>
                    </select>
                </div>
                <div>
                    <label>Date debut :</label>
                    <input type="date" name="dateDebut" required>
                </div>
                <div>
                    <label>Date fin :</label>
                    <input type="date" name="dateFin" required>
                </div>
                <button type="submit">Valider</button>
            </form>
        </div>
    </div>
</body>
</html>
