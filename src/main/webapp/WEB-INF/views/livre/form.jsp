<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Ajouter un livre</title>
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
        <div class="ajout-livre">
            <h2>Ajouter un livre</h2>

            <form action="${pageContext.request.contextPath}/livre/enregistrer" method="post">
                <div>
                    <label>Titre :</label>
                    <input type="text" name="titre" required>
                </div>
                <div>
                    <label>Auteur :</label>
                    <input type="text" name="auteur">
                </div>
                <div>
                    <label>Langue :</label>
                    <input type="text" name="langue">
                </div>
                <div>
                    <label>Année de publication :</label>
                    <input type="number" name="anneePublication">
                </div>
                <div>
                    <label>Accessibilité :</label>
                    <select name="accessibilite">
                        <option value="1">Tous</option>
                        <option value="2">Professeur seulement</option>
                    </select>
                </div>
                <div>
                    <label>Genre :</label>
                    <select name="genre.id" required>
                        <c:forEach var="g" items="${genres}">
                            <option value="${g.id}">${g.libelle}</option>
                        </c:forEach>
                    </select>
                </div>
                <button type="submit">Enregistrer</button>
            </form>
        </div>
    </div>
</body>
</html>
