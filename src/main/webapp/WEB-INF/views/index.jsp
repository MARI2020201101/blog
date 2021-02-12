<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>
<%@include file="layout/headers.html"%>

<html>
<head>
    <title>Insert title here</title>
</head>
<style>
    .card{
        margin: 10px 10px 10px 30px;
        border: 4px dashed #bcbcbc;
        padding: 20px 20px 20px 20px;
    }
    #sticky-footer{
        border: 4px dashed #bcbcbc;
        background-color: #bcbcbc;
    }
</style>
<body>
<div class="card w-75">
    <div class="card-body">
        <h5 class="card-title">Card title</h5>
        <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
        <a href="#" class="btn btn-primary">Button</a>
    </div>
</div>

<div class="card w-50">
    <div class="card-body">
        <h5 class="card-title">Card title</h5>
        <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
        <a href="#" class="btn btn-primary">Button</a>
    </div>
</div>
<%@include file="layout/footer.html"%>
</body>
</html>


