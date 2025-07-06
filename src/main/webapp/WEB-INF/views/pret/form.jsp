<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Formulaire de prêt</title>
</head>
<body>
    <h2>Preter un exemplaire de "${livre.titre}"</h2>

    <form action="${pageContext.request.contextPath}/pret/enregistrer" method="post">
        <input type="hidden" name="livreId" value="${livre.id}" />

        <div>
            <label>Exemplaire :</label>
            <select name="exemplaireId" required>
                <c:forEach var="ex" items="${exemplaires}">
                    <option value="${ex.id}">${ex.numeroExemplaire}</option>
                </c:forEach>
            </select>
        </div>

        <div>
            <label>Adhérant :</label>
            <select name="adherantId" required>
                <c:forEach var="a" items="${adherants}">
                    <option value="${a.id}">${a.nom} ${a.prenom}</option>
                </c:forEach>
            </select>
        </div>
        <div>
            <label>Type de prêt :</label>
            <select name="typePretId" required>
                <c:forEach var="tp" items="${typePrets}">
                    <option value="${tp.id}">${tp.libelle}</option>
                </c:forEach>
            </select>
        </div>
        <div>
            <label>Date du prêt :</label>
            <input type="date" name="datePret" required />
        </div>

        <div>
            <label>Date de retour prévue :</label>
            <input type="date" name="dateRetour" required />
        </div>

        <button type="submit">Valider</button>
    </form>
</body>
</html>
