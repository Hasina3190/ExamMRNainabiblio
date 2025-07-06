<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Connexion</title>
</head>
<body>
    <h2>Connexion</h2>

    <c:if test="${param.error != null}">
        <p style="color:red;">Identifiants invalides</p>
    </c:if>

    <form action="${pageContext.request.contextPath}/login" method="post">
        <div>
            <label>Email :</label>
            <input type="text" name="username" required />
        </div>
        <div>
            <label>Mot de passe :</label>
            <input type="password" name="password" required />
        </div>
        <div>
            <label>Type d'utilisateur :</label>
            <select name="role">
                <option value="ADHERANT">Adhérant</option>
                <option value="BIBLIO">Bibliothécaire</option>
            </select>
        </div>
        <div>
            <button type="submit">Se connecter</button>
        </div>
    </form>
</body>
</html>
