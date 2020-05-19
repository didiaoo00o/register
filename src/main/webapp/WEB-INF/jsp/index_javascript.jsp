<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="../../js/jquery-1.11.1.min.js"></script>
    <title></title>
</head>
<body>
<div>
    <form id="register" method="post">
        <div>
            <span>用户名：</span>
            <input type="text" name="username" />
        </div>
        <div>
            <span>手机号：</span>
            <input type="text" name="tel"/>
        </div>
        <div>
            <span>密码：</span>
            <input type="password" name="password"/>
        </div>
        <div>
            <span>性别：</span>
            <input type="radio" name="sex" value="1">男</input>
            <input type="radio" name="sex" value="2">女</input>
        </div>

        <div>
            <button type="submit" onclick="register()">提交</button>
            <button type="reset">重置</button>
        </div>
    </form>
</div>

</body>

<script type="text/javascript">
    function register(){
        var formObject = {};
        var formArray =$("#register").serializeArray();
        $.each(formArray,function(i,item){
            formObject[item.name] = item.value;
        });
        $.ajax({
            url:"/register/add",
            type:"post",
            contentType: "application/json; charset=utf-8",
            data: JSON.stringify(formObject),
            dataType: "json",
            success:function(data){
                alert(data.msg);
            },
            error:function(e){
                alert("错误！！");
            }
        })
    }
</script>
</html>