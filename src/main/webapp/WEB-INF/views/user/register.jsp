<%@include file="../layout/headers.html"%>
<style>
    form{
        margin: 10px 10px 10px 30px;
        border: 4px dashed #bcbcbc;
        padding: 20px 20px 20px 20px;
    }
</style>
<form class="register">
    <div class="form-group">
        <label for="username">username:</label>
        <input type="username" class="form-control" placeholder="Enter username" id="username">
    </div>
    <div class="form-group">
        <label for="password">Password:</label>
        <input type="password" class="form-control" placeholder="Enter password" id="password">
    </div>
    <div class="form-group form-check">
        <label class="form-check-label">
            <input class="form-check-input" type="checkbox"> Register
        </label>
    </div>
    <button id ="btn-save" class="btn btn-primary">Register</button>
</form>
<%@include file="../layout/footer.html"%>