<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cadastro de Insumos</title>
    <link rel="stylesheet" type="text/css" href="/style/style.css">
</head>

<body>

    <!-- Menu superior -->
    <div class="top-bar">
        <div class="logo">
            <img src="/path-to-logo.png" alt="Logo">
            <span>Engenharia de Cardápio</span>
        </div>
        <nav>
            <a href="homepage.jsp">Fichas Técnicas</a>
            <a href="supplies.jsp">Insumos</a>
            <a href="sales.jsp">Vendas</a>
        </nav>
        <div class="user-info">
            <span>Usuário: Fulano</span>
        </div>
    </div>

    <!-- Título da seção e botão de cadastro -->
    <div class="section-header">
        <h2>Fichas Técnicas</h2>
        <button class="btn-cadastrar" href="registerTechnicalSheet.jsp">Cadastrar Ficha Técnica</button>
    </div>

    <!-- Listagem das fichas técnicas -->
    <div class="fichas-list">
        <!-- Exemplo de ficha técnica -->
        <div class="ficha-item">
            <img src="/path-to-image.jpg" alt="Prato">
            <div class="ficha-info">
                <div class="details">
                    <span>Categoria: Entrada</span>
                    <span>Nome: Salada Caesar</span>
                </div>
                <div class="price">
                    R$ 35,00
                </div>
                <div class="margin">
                    Margem de lucro: 25%
                </div>
            </div>
        </div>

        <div class="ficha-item">
            <img src="/path-to-image.jpg" alt="Prato">
            <div class="ficha-info">
                <div class="details">
                    <span>Categoria: Sobremesa</span>
                    <span>Nome: Cheesecake</span>
                </div>
                <div class="price">
                    R$ 45,00
                </div>
                <div class="margin">
                    Margem de lucro: 30%
                </div>
            </div>
        </div>

        <!-- Adicione mais fichas técnicas aqui -->
    </div>

</body>
</html>
