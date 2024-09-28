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
            <a href="#">Fichas Técnicas</a>
            <a href="#">Insumos</a>
            <a href="#">Vendas</a>
        </nav>
        <div class="user-info">
            <span>Usuário: Fulano</span>
        </div>
    </div>

    <!-- Título da seção e botão de cadastro -->
    <div class="section-header">
        <h2>Insumos</h2>
        <button class="btn-cadastrar" href="registerSupplies.jsp">Cadastrar Insumos/button>
    </div>

    <!-- Listagem das fichas técnicas -->
    <div class="fichas-list">
        <!-- Exemplo de ficha técnica -->
        <div class="ficha-item">
            <img src="/path-to-image.jpg" alt="Prato">
            <div class="ficha-info">
                <div class="details">
                    <span>Categoria: Carnes</span>
                    <span>Nome:Hamburger</span>
                </div>
                <div class="price">
                    R$ 15,00
                </div>
                <div class="margin">
                    Fornecedor: fabrica
                </div>
            </div>
        </div>

        <div class="ficha-item">
            <img src="/path-to-image.jpg" alt="Prato">
            <div class="ficha-info">
                <div class="details">
                    <span>Categoria: Sobremesa</span>
                    <span>Nome: Sorvete</span>
                </div>
                <div class="price">
                    R$ 45,00
                </div>
                <div class="margin">
                    Fornecedor: sorveteria
                </div>
            </div>
        </div>

        <!-- Adicione mais fichas técnicas aqui -->
    </div>

</body>
</html>
