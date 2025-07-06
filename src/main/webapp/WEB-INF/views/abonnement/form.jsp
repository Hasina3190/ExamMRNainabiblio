<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Abonnement</title>
</head>
<body>
    <h2>Créer un abonnement</h2>

    <p th:text="${message}"></p>

    <form th:action="@{/abonnement/enregistrer}" method="post">
        <label>Adhérant:</label>
        <select name="adherantId" required>
            <option th:each="a : ${adherants}" 
                    th:value="${a.id}" 
                    th:text="${a.nom + ' ' + a.prenom}">Adhérant</option>
        </select><br><br>

        <label>Date début:</label>
        <input type="date" name="dateDebut" required><br><br>

        <label>Date fin:</label>
        <input type="date" name="dateFin" required><br><br>

        <button type="submit">Valider</button>
    </form>
</body>
</html>
