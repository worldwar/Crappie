<%@ include file="header.jsp" %>

<form class="form-horizontal" name='f' action="login" method="post">
    <div class="control-group">
        <label class="control-label">Email</label>
        <div class="controls">
            <input type='text' name="j_username" placeholder="some@email.com"></td>
        </div>
    </div>

    <div class="control-group">
        <label class="control-label">Name</label>
        <div class="controls">

            <input type="text" name="username" placeholder="小明" />
        </div>
    </div>

    <div class="control-group">
        <label class="control-label">Password</label>
        <div class="controls">
            <input type="password" name="password" placeholder="password">
        </div>
    </div>

    <div class="control-group">
        <label class="control-label">Password</label>
        <div class="controls">
            <input type="submit" name="submit" class="btn" value="注册">
        </div>
    </div>
</form>

<%@ include file="footer.jsp" %>
